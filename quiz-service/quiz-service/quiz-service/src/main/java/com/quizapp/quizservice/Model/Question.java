package com.quizapp.quizservice.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String question_title;
    private String category;

    public Question() {
        super();
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    private String difficulty_level;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;

    public Integer getId() {
        return id;
    }

    public String getQuestion_title() {
        return question_title;
    }

    public String getCategory() {
        return category;
    }

    public String getDifficulty_level() {
        return difficulty_level;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDifficulty_level(String difficulty_level) {
        this.difficulty_level = difficulty_level;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

//    public Question(Integer id) {
//        this.id = id;
//    }





//    public String getQuestion_title() {
//        return question_title;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public String getDifficulty_level() {
//        return difficulty_level;
//    }
//
//    public String getOption1() {
//        return option1;
//    }
//
//    public String getOption2() {
//        return option2;
//    }
//
//    public String getOption3() {
//        return option3;
//    }
//
//    public String getOption4() {
//        return option4;
//    }
//
//    public String getAnswer() {
//        return answer;
//    }
//
//
//
//    public void setQuestion_title(String question_title) {
//        this.question_title = question_title;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public void setDifficulty_level(String difficulty_level) {
//        this.difficulty_level = difficulty_level;
//    }
//
//    public void setOption1(String option1) {
//        this.option1 = option1;
//    }
//
//    public void setOption2(String option2) {
//        this.option2 = option2;
//    }
//
//    public void setOption3(String option3) {
//        this.option3 = option3;
//    }
//
//    public void setOption4(String option4) {
//        this.option4 = option4;
//    }
//
//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }


}
