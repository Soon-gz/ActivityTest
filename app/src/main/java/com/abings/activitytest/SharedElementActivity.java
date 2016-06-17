package com.abings.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class SharedElementActivity extends AppCompatActivity {
    private View firstSharedView;
    private View secondSharedView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element);
        getSupportActionBar().setTitle("第一个Activity");

        firstSharedView = findViewById(R.id.firstSharedView);
        secondSharedView = findViewById(R.id.secondSharedView);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() != MotionEvent.ACTION_DOWN) return true;

        Intent intent = new Intent(this, SecondShareElemActivity.class);

//        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this, firstSharedView, "sharedView").toBundle());

        Pair first = new Pair<>(firstSharedView, ViewCompat.getTransitionName(firstSharedView));
        Pair second = new Pair<>(secondSharedView, ViewCompat.getTransitionName(secondSharedView));

        ActivityOptionsCompat transitionActivityOptions =
                ActivityOptionsCompat.makeSceneTransitionAnimation(
                        this, first, second);

        ActivityCompat.startActivity(this,
                intent, transitionActivityOptions.toBundle());
        return super.onTouchEvent(event);
    }
}
