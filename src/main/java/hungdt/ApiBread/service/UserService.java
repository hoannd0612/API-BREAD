package hungdt.ApiBread.service;


import hungdt.ApiBread.entity.UsersEntity;

import java.util.Optional;

public interface UserService {
    UsersEntity loginUser(String id, String password);
    void delete(String id);

}
