package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonAdd, buttonSub,buttonMul,buttonDiv;
    EditText editTextN1, editTextN2;
    TextView textView;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd= findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_sub);
        buttonMul=findViewById(R.id.btn_mul);
        buttonDiv = findViewById(R.id.btn_div);
        editTextN1=findViewById(R.id.number1);
        editTextN2=findViewById(R.id.number2);
        textView=findViewById(R.id.answer);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);



    }
    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().equals("")){
            Toast.makeText(this,"Enter number",Toast.LENGTH_SHORT).show();
            return 0;

        }else
        return Integer.parseInt(editText.getText().toString());
    }


    @Override
    public void onClick(View view) {
        num1=getIntFromEditText(editTextN1);
        num2=getIntFromEditText(editTextN2);
        int id = view.getId();
        if (id == R.id.btn_add) {
            textView.setText("Answer=" + (num1 + num2));
        } else if (id == R.id.btn_sub) {
            textView.setText("Answer=" + (num1 - num2));
        } else if (id == R.id.btn_mul) {
            textView.setText("Answer=" + (num1 * num2));
        } else if (id == R.id.btn_div) {
            textView.setText("Answer=" + ((float) num1 / (float) num2));
        } else {
            textView.setText("Thank you");
        }

    }
}