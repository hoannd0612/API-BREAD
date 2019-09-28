package hungdt.ApiBread.service;

import hungdt.ApiBread.entity.UsersEntity;

public interface UsersService {
    UsersEntity loginUser(String username,String password);
}
