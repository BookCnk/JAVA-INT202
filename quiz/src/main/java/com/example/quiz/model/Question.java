package com.example.quiz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Question {
    private String title;
    private List<String> options;
    private int correctAnswerIndex;

    public boolean checkAnswer(int selectedIndex){
        return selectedIndex == correctAnswerIndex;
    }

}
