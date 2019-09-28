package hungdt.ApiBread.controller;

import hungdt.ApiBread.entity.UsersEntity;
import hungdt.ApiBread.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(value = "Users")
    public ResponseEntity checkLogin(@RequestParam("username") String username
            , @RequestParam("password") String password) {
        try {
            UsersEntity result = usersService.loginUser(username, password);
            if (result == null) {
                return new ResponseEntity("username and password invalid", HttpStatus.OK);
            } else {
                return new ResponseEntity(result, HttpStatus.OK);
            }

        } catch (Exception e) {
            return new ResponseEntity("Login failed", HttpStatus.CONFLICT);
        }
    }
}
