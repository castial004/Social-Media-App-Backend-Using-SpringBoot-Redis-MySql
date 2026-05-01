package com.messaging.socialmediaApp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @ManyToOne
    @JoinColumn()
    private Post post;



    private Long authorId;
    @Enumerated(EnumType.STRING)
    private AuthorType authorType;

    private Integer depthLevel;
    private String content;
    @CreationTimestamp
    private LocalDateTime commentCreatedAt;
}
