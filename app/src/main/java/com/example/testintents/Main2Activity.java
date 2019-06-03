package com.example.testintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String text1 = intent.getStringExtra("text1");
        String text2 = intent.getStringExtra("text2");
        String text3 = intent.getStringExtra("text3");
        String text4 = intent.getStringExtra("text4");
        TextView textView1 = findViewById(R.id.editName);
        TextView textView2 = findViewById(R.id.editDT);
        TextView textView3 = findViewById(R.id.editSJ);
        TextView textView4 = findViewById(R.id.comment);
        textView1.setText("Name Of Student : "+ text1);
        textView2.setText("Member of Academic Examiners Board : "+ text2);
        textView3.setText("Evaluation of Oral Presentation : "+ text3);
        textView4.setText("Comment of Student : "+ text4);
        String Ans2 = intent.getStringExtra("Answer2");
        TextView Answer2 = findViewById(R.id.V2f);
        Answer2.setText("Answer 2 : "+Ans2);
        String Ans1 = intent.getStringExtra("Answer1");
        TextView Answer1 = findViewById(R.id.V1f);
        Answer1.setText("Answer 1 : "+Ans1);
        String Ans3 = intent.getStringExtra("Answer3");
        TextView Answer3 = findViewById(R.id.V3f);
        Answer3.setText("Answer 3 : "+Ans3);
        String Ans4 = intent.getStringExtra("Answer4");
        TextView Answer4 = findViewById(R.id.V4f);
        Answer4.setText("Answer 4 : "+Ans4);
        String Ans5 = intent.getStringExtra("Answer5");
        TextView Answer5 = findViewById(R.id.V5f);
        Answer5.setText("Answer 5 : "+Ans5);
        String Ans6 = intent.getStringExtra("Answer6");
        TextView Answer6 = findViewById(R.id.V1c);
        Answer6.setText("Answer 1 : "+Ans6);
        String Ans7 = intent.getStringExtra("Answer7");
        TextView Answer7 = findViewById(R.id.V2c);
        Answer7.setText("Answer 2 : "+Ans7);
        String Ans8 = intent.getStringExtra("Answer8");
        TextView Answer8 = findViewById(R.id.V3c);
        Answer8.setText("Answer 3 : "+Ans8);
        String Ans9 = intent.getStringExtra("Answer9");
        TextView Answer9 = findViewById(R.id.V4c);
        Answer9.setText("Answer 4 : "+Ans9);
//        textView4.setText("Comment of Student : "+ text4);
//        String text4 = intent.getStringExtra("text4");
//        TextView textView4 = findViewById(R.id.comment);
        Button Btn2 = findViewById(R.id.button2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               OpenActivity();
            }
        });
    }
    public void OpenActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
