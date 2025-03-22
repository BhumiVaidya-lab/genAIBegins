package com.epam.training.gen.ai.model;

import lombok.Data;

import java.util.List;
@Data
public class Chat {
    private String prompt;
    private Double temperature;
    private int maxTokens;
    private List<String> stopSequences;


}
