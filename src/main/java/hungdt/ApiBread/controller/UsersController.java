package hungdt.ApiBread.controller;

import hungdt.ApiBread.entity.UsersEntity;
import hungdt.ApiBread.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/User")
    public ResponseEntity loginUser(@RequestParam(value = "id") String id,
                                    @RequestParam(value = "password") String password) {
        try {
            UsersEntity userEntity = userService.loginUser(id, password);
            if (userEntity == null) {
                return new ResponseEntity("id and password not correct", HttpStatus.OK);
            } else {
                return new ResponseEntity(userEntity, HttpStatus.OK);
            }

        } catch (Exception e) {
            return new ResponseEntity("id and password not correct", HttpStatus.CONFLICT);
        }

    }

    @DeleteMapping(value = "/User/{id}")
    public ResponseEntity deleteById(@RequestParam("id") String id) {
        try {

                userService.delete(id);
                return new ResponseEntity("Deleted success", HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity("Id not found", HttpStatus.CONFLICT);
        }

    }
}
