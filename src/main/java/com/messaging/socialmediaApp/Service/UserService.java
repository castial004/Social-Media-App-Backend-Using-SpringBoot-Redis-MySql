package com.messaging.socialmediaApp.Service;

import com.messaging.socialmediaApp.Dto.CreateUserRequest;
import com.messaging.socialmediaApp.Entity.User;
import com.messaging.socialmediaApp.Repository.UserRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User saveUser(CreateUserRequest request){
        User newUser = User.builder()
                        .username(request.getUsername())
                        .isPremium(request.getIsPremium())
                        .build();
        return userRepo.save(newUser);
    }
    public User getUser(String username){
        User user =  userRepo.findByUsername(username).orElseThrow(()-> new EntityNotFoundException("User with this username does not exists"));
        return user;
    }

    public List<User> getAllUserService(){
        return userRepo.findAll();
    }
}
