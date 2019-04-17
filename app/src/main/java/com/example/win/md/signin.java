package com.example.win.md;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {
    private Button  next=(Button) findViewById(R.id.PhoneRegist);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
       /* next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signin.class, chat.class);
                startActivity(intent);
                signin.finish();
            }
        });*/
    }
}
