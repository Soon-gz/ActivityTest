package com.abings.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button sharedElement;
    private Button custom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedElement = (Button) findViewById(R.id.sharedElement);
        custom = (Button) findViewById(R.id.custom);
    }
    public void onClick(View v) {
        if (v == sharedElement) {
            Intent intent = new Intent(this, SharedElementActivity.class);
            startActivity(intent);
        } else if (v == custom) {
            Intent intent = new Intent(this, CustomTransitionActivity.class);
            startActivity(intent);
        }
    }
}
