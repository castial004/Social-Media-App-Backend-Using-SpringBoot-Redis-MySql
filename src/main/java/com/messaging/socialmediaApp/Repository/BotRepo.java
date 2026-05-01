package com.messaging.socialmediaApp.Repository;

import com.messaging.socialmediaApp.Entity.Bot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotRepo extends JpaRepository<Bot,Long> {
}
