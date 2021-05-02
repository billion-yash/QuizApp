package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Question> questions1 = new ArrayList<>();
        questions1.add(new Question(
                "Which of the following is a legal identifier in java ?",
                1 ,
                "All information is to be represented as stored data in cells of tables.",
                "Primary key must not be null. Expression on NULL must give null.." ,
                "All view that are theoretically updatable should be updatable by the system." ,
                "A database should work properly regardless of its distribution across a network." ));
        QuizInfo quiz1 = new QuizInfo(questions1 ,1 , "DBMS");

        List<QuizInfo> quizInfos = new ArrayList<>();
        quizInfos.add(quiz1);
        quizInfos.add(quiz1);
        RecyclerView recyclerView = findViewById(R.id.mainRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL , false));
        recyclerView.setAdapter(new MainCardsAdapter(quizInfos));
    }
}