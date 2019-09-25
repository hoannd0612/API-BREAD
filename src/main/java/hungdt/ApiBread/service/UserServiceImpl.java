package hungdt.ApiBread.service;

import hungdt.ApiBread.entity.UsersEntity;
import hungdt.ApiBread.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UsersEntity loginUser(String id, String password) {
        return userRepository.findByIdAndPassword(id,password);
    }

    @Override
    public void delete(String id) {

        userRepository.deleteUser(id);

    }


}
