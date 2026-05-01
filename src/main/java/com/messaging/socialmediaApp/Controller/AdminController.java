package com.messaging.socialmediaApp.Controller;

import com.messaging.socialmediaApp.Dto.CreateBotRequest;
import com.messaging.socialmediaApp.Entity.Bot;
import com.messaging.socialmediaApp.Entity.User;
import com.messaging.socialmediaApp.Service.BotService;
import com.messaging.socialmediaApp.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminController {
    private  final BotService botService;
    private final UserService userService;
    @PostMapping("/add/bot")
    public ResponseEntity<Bot> save_Bot_Admin_Controller(@RequestBody CreateBotRequest request){
        Bot response =  botService.saveBot(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping("/get/user/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username){
        return ResponseEntity.status(HttpStatus.FOUND).body(userService.getUser(username));
    }
    @GetMapping("/get/user")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUserService());
    }
}
