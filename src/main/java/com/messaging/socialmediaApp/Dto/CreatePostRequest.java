package com.messaging.socialmediaApp.Dto;

import com.messaging.socialmediaApp.Entity.AuthorType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CreatePostRequest {
    private String title;
    private String content;
    private AuthorType authorType;
    private Long authorId;
}
