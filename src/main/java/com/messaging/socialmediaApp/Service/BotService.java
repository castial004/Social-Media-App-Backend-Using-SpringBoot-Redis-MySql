package com.messaging.socialmediaApp.Service;

import com.messaging.socialmediaApp.Dto.CreateBotRequest;
import com.messaging.socialmediaApp.Entity.Bot;
import com.messaging.socialmediaApp.Repository.BotRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BotService {
    private final BotRepo botRepo;

    public Bot saveBot(CreateBotRequest request){
        Bot newBot = Bot.builder()
                        .name(request.getBotName())
                                .description(request.getDescription())
                                        .build();
        return botRepo.save(newBot);
    }
}
