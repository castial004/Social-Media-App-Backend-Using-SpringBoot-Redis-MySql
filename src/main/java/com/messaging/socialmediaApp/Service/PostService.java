package com.messaging.socialmediaApp.Service;

import com.messaging.socialmediaApp.Dto.CreatePostRequest;
import com.messaging.socialmediaApp.Entity.AuthorType;
import com.messaging.socialmediaApp.Entity.Post;
import com.messaging.socialmediaApp.Repository.PostRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostService {
    private final PostRepo postRepo;

    public Post createPostService(CreatePostRequest request){
        if(request.getAuthorType().name().equals(AuthorType.USER.name())){
            // check user exist
        }
    }
}
