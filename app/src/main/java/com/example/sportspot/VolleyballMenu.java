package com.example.sportspot;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class VolleyballMenu extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volleyball_menu);

        Button button1 = findViewById(R.id.v_button1);
        Button button2 = findViewById(R.id.v_button2);
        Button button3 = findViewById(R.id.v_button3);
        Button button4 = findViewById(R.id.v_button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, TopicOfVolleyball.class);
        switch (view.getId()){
            case R.id.v_button1:
                intent.putExtra("keyId", "1");
                break;
            case R.id.v_button2:
                intent.putExtra("keyId", "2");
                break;
            case R.id.v_button3:
                intent.putExtra("keyId", "3");
                break;
            case R.id.v_button4:
                intent.putExtra("keyId", "4");
                break;
        }
        startActivity(intent);
    }
}