package com.quizapp.questionservice.Controller;

//import com.quiz.QuizApp.Model.Question;
//import com.quiz.QuizApp.service.QuestionService;
import com.quizapp.questionservice.Model.Question;
import com.quizapp.questionservice.Model.QuestionWrapper;
import com.quizapp.questionservice.Model.Response;
import com.quizapp.questionservice.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @Autowired
    Environment environment;

     @RequestMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
     // return "These are the all questions";
         return questionService.getAllQuestions();
    }
    @RequestMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
         return questionService.getQuestionsByCategory(category);

    }
    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);

    }
    @DeleteMapping("/deleteQuestion/{id}")
    public void deleteQuestion(@PathVariable("id") Integer id){
        questionService.deleteQuestion(id);
    }
    @GetMapping("/generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName,@RequestParam Integer numQuestions){
         return questionService.getQuestionForQuiz(categoryName,numQuestions);

    }
    @PostMapping("/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds){
        System.out.println(environment.getProperty("local.server.port"));
         return questionService.getQuestionsFromId(questionIds);
    }
    @PostMapping("/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
         return questionService.getScore(responses);
    }

}
