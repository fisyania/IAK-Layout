package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            textView2 = (TextView) findViewById(R.id.textView2);
            isi =(TextView) findViewById(R.id.textView3);

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent i;
                i = new Intent(getIntent().ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,isi.getText().toString());
                i.setType("text/plain");
                startActivity(i);
            }


        });

    }
}
