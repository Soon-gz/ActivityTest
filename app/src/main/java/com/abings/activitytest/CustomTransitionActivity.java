package com.abings.activitytest;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CustomTransitionActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_transition);


    }

    public void onClick(View v) {
        Intent intent = new Intent(this, SecondCustomTransActivity.class);
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation
                (this, v, "transition_morph_view");
        startActivity(intent, options.toBundle());
    }
}
