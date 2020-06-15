package com.example.onurtuncproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class FinalActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.item1)
            Toast.makeText(this, "Onur Tunc 184308064", Toast.LENGTH_SHORT).show();
        return true;
    }

    TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        textView1=findViewById(R.id.name);
        textView2=findViewById(R.id.age);

        Intent i=getIntent();
        textView1.setText(i.getStringExtra("Name"));
        textView2.setText(i.getStringExtra("Age"));

    }
}
