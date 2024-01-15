package com.quizapp.quizservice.Dao;


import com.quizapp.quizservice.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
