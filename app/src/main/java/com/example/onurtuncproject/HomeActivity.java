package com.example.onurtuncproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {


    EditText editText1,editText2;
    Button button;
    Integer i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        editText1=findViewById(R.id.name);
        editText2=findViewById(R.id.age);
        button=findViewById(R.id.transfer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,FinalActivity.class);
                intent.putExtra("Name",editText1.getText().toString());
                intent.putExtra("Age",editText2.getText().toString());
                i=Integer.parseInt(editText2.getText().toString());
                if (i<7)
                {
                    finish();
                    Toast.makeText(HomeActivity.this, "This App is for people over 7", Toast.LENGTH_LONG).show();
                }
                else
                {
                    startActivity(intent);

                }
            }
        });

    }
}
