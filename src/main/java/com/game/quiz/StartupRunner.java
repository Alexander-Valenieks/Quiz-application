package com.game.quiz;

import com.game.quiz.database.entities.PlayerEntity;
import com.game.quiz.database.repositories.PlayerRepository;
import com.game.quiz.services.QuizDataService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Log
public class StartupRunner implements CommandLineRunner {
    @Autowired
    private PlayerRepository playerRepository;
    private QuizDataService quizDataService;

    public StartupRunner(QuizDataService quizDataService) {
        this.quizDataService = quizDataService;
    }

    @Override
    public void run(String...args) throws Exception {
        log.info("Executing startup actions...");
    }
}
