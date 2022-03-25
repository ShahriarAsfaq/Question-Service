package com.example.questionservice.repository;

import com.example.questionservice.entity.Questions;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends MongoRepository<Questions, String> {
    Questions findQuestionById(String questionId);
}
