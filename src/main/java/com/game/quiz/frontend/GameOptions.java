package com.game.quiz.frontend;
import lombok.Data;

@Data
public class GameOptions {
    private int numberOfQuestions;
    private Difficulty difficulty;
    private int categoryId;
}
