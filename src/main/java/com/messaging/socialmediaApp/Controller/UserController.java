package com.messaging.socialmediaApp.Controller;

import com.messaging.socialmediaApp.Dto.CreateUserRequest;
import com.messaging.socialmediaApp.Entity.User;
import com.messaging.socialmediaApp.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseEntity<User> saveUserController(@RequestBody CreateUserRequest request){
        User response =  userService.saveUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
