package com.example.sportspot;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickVolleyball(View view){
        Intent intent = new Intent(this, VolleyballMenu.class);
        startActivity(intent);
    }

    public void onClickBasketball(View view){
        Intent intent = new Intent(this, BasketballMenu.class);
        startActivity(intent);
    }
}