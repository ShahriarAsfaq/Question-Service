package com.example.questionservice.service;

import com.example.questionservice.entity.Questions;
import com.example.questionservice.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Questions saveQuestion(Questions questions) {
        return questionRepository.save(questions);
    }

    public Questions findQuestionById(String questionId) {
        return questionRepository.findQuestionById(questionId);
    }
}
