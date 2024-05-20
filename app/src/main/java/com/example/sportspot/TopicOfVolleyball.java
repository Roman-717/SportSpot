package com.example.sportspot;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TopicOfVolleyball extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_of_volleyball);
        Intent intent = getIntent();
        String topicId = intent.getStringExtra("keyId");
        TextView web = findViewById(R.id.volleyballWeb);
        TextView text = findViewById(R.id.volleyballTopicText);
        switch (topicId){
            case "1":
                web.setText(getResources().getString(R.string.first_web_v));
                text.setText(getResources().getString(R.string.first_topic_text_vb));
                break;
            case "2":
                web.setText(getResources().getString(R.string.second_web_v));
                text.setText(getResources().getString(R.string.second_topic_text_vb));
                break;
            case "3":
                web.setText(getResources().getString(R.string.third_web_v));
                text.setText(getResources().getString(R.string.third_topic_text_vb));
                break;
            case "4":
                web.setText(getResources().getString(R.string.fourth_web_v));
                text.setText(getResources().getString(R.string.fourth_topic_text_vb));
                break;
        }
    }
}