package com.example.birthdaycardapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        TextView receiver=findViewById(R.id.receiver);
        TextView sender=findViewById(R.id.sender);
        TextView message=findViewById(R.id.messageText);

        String receiver_text=getIntent().getStringExtra("receiver_text");
        String sender_text=getIntent().getStringExtra("sender_text");
        String message_text=getIntent().getStringExtra("message_text");

        receiver.setText("To "+receiver_text);
        message.setText(message_text);
        sender.setText("From "+sender_text);

        Button backButton=findViewById(R.id.go_back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent=new Intent(CardActivity.this,MainActivity.class);
                startActivity(backIntent);
                finish();
            }
        });
    }
}
