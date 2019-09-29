package com.example.birthdaycardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String receiver_text,sender_text,message_text;
    EditText receiver, sender, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        receiver = findViewById(R.id.receiver_edittext);
        sender = findViewById(R.id.sender_edittext);
        message = findViewById(R.id.message_edittext);

        Button card_button = findViewById(R.id.make_card_button);
        card_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                receiver_text = receiver.getText().toString();
                sender_text = sender.getText().toString();
                message_text = message.getText().toString();

                Intent cardIntent = new Intent(MainActivity.this, CardActivity.class);
                cardIntent.putExtra("receiver_text", receiver_text);
                cardIntent.putExtra("sender_text", sender_text);
                cardIntent.putExtra("message_text", message_text);
                startActivity(cardIntent);
            }
        });
    }
}
