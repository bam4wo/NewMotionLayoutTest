package com.example.newmotionlayouttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MotionLayout motionLayout;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        motionLayout = findViewById(R.id.motionLayout);
        textView = findViewById(R.id.tv_lock);
        textView.setText("右滑解鎖");
        //textView.setTextColor(Color.parseColor("#00a94f"));

        motionLayout.setTransitionListener(new MotionLayout.TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {
                textView.setTextColor(Color.parseColor("#00a94f"));
            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {
                if (v <= 0.5f){
                    textView.setTextColor(Color.parseColor("#00a94f"));
                }else {
                    textView.setTextColor(Color.parseColor("#ffffff"));
                }
            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int i) {

            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {

            }
        });

    }
}