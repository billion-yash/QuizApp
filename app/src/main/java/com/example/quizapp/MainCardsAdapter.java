package com.example.quizapp;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainCardsAdapter extends RecyclerView.Adapter<MainCardsAdapter.myViewHolder> {
    List<QuizInfo> quizInfo ;

    public MainCardsAdapter(List<QuizInfo> quizInfo) {
        this.quizInfo = quizInfo;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.main_recylcerview_adpter_card , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.name.setText(quizInfo.get(position).getQuizName());
        holder.num.setText(Integer.toString(quizInfo.get(position).getQuestions().size()));
    }

    @Override
    public int getItemCount() {
        return quizInfo.size();
    }

    public class  myViewHolder extends RecyclerView.ViewHolder{
        TextView name,num;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.quizNameCard);
            num = itemView.findViewById(R.id.noOfQueCard);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext() , "Quiz Started" , Toast.LENGTH_SHORT ).show();
                    itemView.getContext().startActivity(new Intent(v.getContext() , QuizActivity.class).putExtra("quiz ID" , quizInfo.get(getAdapterPosition()).getQuizID()));

                }
            });
        }
    }
}
