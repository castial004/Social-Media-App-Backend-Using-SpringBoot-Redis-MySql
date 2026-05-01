package com.messaging.socialmediaApp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private Long authorId;
    @Enumerated(value = EnumType.STRING)
    private AuthorType authorType;
    private String content;
    @CreationTimestamp
    private LocalDateTime createdAt;

//    @OneToMany(mappedBy = "post")
//    private List<Comment> comment;
}
