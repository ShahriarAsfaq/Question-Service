package com.example.questionservice.controller;

import com.example.questionservice.entity.Questions;
import com.example.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/")
    public Questions saveEmployee(@RequestBody Questions questions){
        return questionService.saveQuestion(questions);
    }

    @GetMapping("/{id}")
    public Questions findQuestionById(@PathVariable("id") String questionId){
        return questionService.findQuestionById(questionId);
    }
}
