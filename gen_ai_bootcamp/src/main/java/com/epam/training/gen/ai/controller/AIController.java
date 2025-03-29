package com.epam.training.gen.ai.controller;

import com.epam.training.gen.ai.model.Chat;
import com.epam.training.gen.ai.model.ChatBotResponse;
import com.epam.training.gen.ai.service.promt.ChatService;
import com.epam.training.gen.ai.service.promt.SimplePromptService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/azure/ai")
public class AIController {

    @Autowired
    private final SimplePromptService simplePromptService;
    private final ChatService chatService;
    /**
     * Get response for a chat query.
     *
     * @param input the user input to send to AI.
     * @return the AI-generated response.
     */
    @GetMapping("/query")
    public String getResponse(@RequestParam String input) {
        return simplePromptService.getChatCompletionsHistory(input);
    }


    @PostMapping("/store")
    public ChatBotResponse storeChatEntry(@RequestBody Chat chat) {
        return Optional.ofNullable(chatService)
                .map(chatService ->chatService.processWithHistory(chat))
                .orElseGet(ChatBotResponse::new);

    }
}
