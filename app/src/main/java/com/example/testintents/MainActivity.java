package com.example.testintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Btn = findViewById(R.id.button);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }
public void openActivity2() {
    final RadioGroup Gg1 = findViewById(R.id.GroupF1);
    final RadioGroup Gg2 = findViewById(R.id.GroupF2);
    final RadioGroup Gg3 = findViewById(R.id.GroupF3);
    final RadioGroup Gg4 = findViewById(R.id.GroupF4);
    final RadioGroup Gg5 = findViewById(R.id.GroupF5);
    final RadioGroup Gg6 = findViewById(R.id.GroupC1);
    final RadioGroup Gg7 = findViewById(R.id.GroupC2);
    final RadioGroup Gg8 = findViewById(R.id.GroupC3);
    final RadioGroup Gg9 = findViewById(R.id.GroupC4);
    Intent intent = new Intent(this,Main2Activity.class);
    TextView editText1 = findViewById(R.id.editName);
    String textN = editText1.getText().toString();
    EditText editText2 = findViewById(R.id.editSJ);
    String textSJ = editText2.getText().toString();
    EditText editText3 = findViewById(R.id.editDT);
    String textDT = editText3.getText().toString();
    EditText editText4 = findViewById(R.id.ETC);
    String textComment = editText4.getText().toString();
    int Q1 = Gg1.getCheckedRadioButtonId();
    if(Q1 > -1){
        RadioButton A1 = findViewById(Q1);
        intent.putExtra("Answer1", A1.getText().toString());
    }else{
        intent.putExtra("Answer1","Nothing");
    }
    int Q2 = Gg2.getCheckedRadioButtonId();
    if(Q2 > -1){
        RadioButton A2 = findViewById(Q2);
        intent.putExtra("Answer2", A2.getText().toString());
    }else{
        intent.putExtra("Answer2","Nothing");
    }
    int Q3 = Gg3.getCheckedRadioButtonId();
    if(Q3 > -1){
        RadioButton A3 = findViewById(Q3);
        intent.putExtra("Answer3", A3.getText().toString());
    }else{
        intent.putExtra("Answer3","Nothing");
    }
    int Q4 = Gg4.getCheckedRadioButtonId();
    if(Q4 > -1){
        RadioButton A4 = findViewById(Q4);
        intent.putExtra("Answer4", A4.getText().toString());
    }else{
        intent.putExtra("Answer4","Nothing");
    }
    int Q5 = Gg5.getCheckedRadioButtonId();
    if(Q5 > -1){
        RadioButton A5 = findViewById(Q5);
        intent.putExtra("Answer5", A5.getText().toString());
    }else{
        intent.putExtra("Answer5","Nothing");
    }
    int Q6 = Gg6.getCheckedRadioButtonId();
    if(Q6 > -1){
        RadioButton A6 = findViewById(Q6);
        intent.putExtra("Answer6", A6.getText().toString());
    }else{
        intent.putExtra("Answer6","Nothing");
    }
    int Q7 = Gg7.getCheckedRadioButtonId();
    if(Q7 > -1){
        RadioButton A7 = findViewById(Q7);
        intent.putExtra("Answer7", A7.getText().toString());
    }else{
        intent.putExtra("Answer7","Nothing");
    }
    int Q8 = Gg8.getCheckedRadioButtonId();
    if(Q8 > -1){
        RadioButton A8 = findViewById(Q8);
        intent.putExtra("Answer8", A8.getText().toString());
    }else{
        intent.putExtra("Answer8","Nothing");
    }
    int Q9 = Gg9.getCheckedRadioButtonId();
    if(Q9 > -1){
        RadioButton A9 = findViewById(Q9);
        intent.putExtra("Answer9", A9.getText().toString());
    }else{
        intent.putExtra("Answer9","Nothing");
    }
    intent.putExtra("text1",textN);
    intent.putExtra("text2",textDT);
    intent.putExtra("text3",textSJ);
    intent.putExtra("text4",textComment);
    startActivity(intent);
}
//
//    @Override
//    public void onCreate(@androidx.annotation.Nullable Bundle savedInstanceState, @androidx.annotation.Nullable PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
//        Log.d("Activity1 ","onCreate");
//    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity1","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity1","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity1","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity1","OnRestart");
    }
}
