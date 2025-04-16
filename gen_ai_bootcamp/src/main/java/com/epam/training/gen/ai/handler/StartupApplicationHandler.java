//package com.epam.training.gen.ai.handler;
//
//import com.epam.training.gen.ai.service.promt.SimplePromptService;
//import com.epam.training.gen.ai.service.promt.SimplePromptService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.ApplicationListener;
//import reactor.util.annotation.NonNull;
//
//public class StartupApplicationHandler implements ApplicationListener<ApplicationReadyEvent> {
//    private final SimplePromptService simplePromtService;
//
//    @Autowired
//    public StartupApplicationHandler(SimplePromptService simplePromtService){
//        this.simplePromtService = simplePromtService;
//    }
//    @Override
//    public void onApplicationEvent(@NonNull ApplicationReadyEvent event){
//        simplePromtService.getChatCompletions();
//    }
//
//}
