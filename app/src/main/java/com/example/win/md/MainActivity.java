package com.example.win.md;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button PhoneRegist=(Button) findViewById(R.id.PhoneRegist);
    private Button VistorRegist=(Button)findViewById(R.id.VictorRegist);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        PhoneRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, signin.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        VistorRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, chat.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }
}
