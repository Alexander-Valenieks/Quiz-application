package com.game.quiz.services;

import com.game.quiz.dto.CategoryQuestionCountInfoDto;
import com.game.quiz.frontend.Difficulty;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.game.quiz.frontend.Difficulty.*;
import static org.junit.jupiter.api.Assertions.*;

class QuizDataServiceTest3 {

    @Test
    void calculateEachDifficultyQuestionCount_basicEasy() {
        CategoryQuestionCountInfoDto categoryQuestionCount = new CategoryQuestionCountInfoDto(5, 17, 13);
        Map<Difficulty, Integer> result = QuizDataService.calculateEachDifficultyQuestionCount(20, EASY, categoryQuestionCount);

        assertEquals(5, result.get(EASY));
        assertEquals(15, result.get(MEDIUM));
        assertNull(result.get(HARD));
    }
}