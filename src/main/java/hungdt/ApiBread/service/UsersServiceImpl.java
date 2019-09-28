package hungdt.ApiBread.service;

import hungdt.ApiBread.entity.UsersEntity;
import hungdt.ApiBread.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    private final UsersRepository usersRepository;

    @Autowired
    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UsersEntity loginUser(String username, String password) {
        return usersRepository.findByUsernameAndPassword(username,password);
    }
}
