package com.example.quizapp;

import java.util.List;

public class QuizInfo {
    private  List<Question> Questions;
    private  int QuizID;
    private  String quizName;

    public List<Question> getQuestions() {
        return Questions;
    }

    public void setQuestions(List<Question> questions) {
        Questions = questions;
    }

    public int getQuizID() {
        return QuizID;
    }

    public void setQuizID(int quizID) {
        QuizID = quizID;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public QuizInfo(List<Question> questions, int quizID, String quizName) {
        Questions = questions;
        QuizID = quizID;
        this.quizName = quizName;
    }



}
