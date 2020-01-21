package com.gcme.everybarataa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by buty on 1/4/16.
 */
public  class Feedback extends AppCompatActivity {

    Button buttonSend;
    EditText textSubject;
    EditText textTo;
    EditText textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        buttonSend =  findViewById(R.id.buttonSend);
        textTo =  findViewById(R.id.editTextTo);

        textSubject =  findViewById(R.id.editTextSubject);
        textMessage =  findViewById(R.id.editTextMessage);

        buttonSend.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                String to = textTo.getText().toString();
                String subject = textSubject.getText().toString();
                String message = textMessage.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
              // email.putExtra(Intent.EXTRA_CC, new String[]{ to});
                //email.putExtra(Intent.EXTRA_BCC, new String[]{to});

                email.putExtra(Intent.EXTRA_TEXT, message);
                email.putExtra(Intent.EXTRA_SUBJECT, subject);

                //need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose  Email:"));


            }

        });
    }

}

