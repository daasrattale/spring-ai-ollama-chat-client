package io.daasrattale.generalknowledge.chat;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.ai.ollama.api.OllamaApi;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatConfig {


    @Bean
    public ChatClient chatClient() {
        return new OllamaChatClient(new OllamaApi())
                .withDefaultOptions(OllamaOptions.create()
                        .withTemperature(0.9f));
    }
}
