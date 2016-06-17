package com.abings.activitytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondShareElemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_share_elem);
        getSupportActionBar().setTitle("第二个Activity");
    }

    public void onClick(View v) {
        finish();
    }
}
