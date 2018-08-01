package com.example.innove.lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by abhisheksharma on 25-Jun-2018.
 */

public class SecondActivity extends AppCompatActivity {
    String msg = "Android : ";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        Log.e(msg, "The onCreate() second event");
    }


    /**
     * Called when the activity is about to become visible.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(msg, "The onStart() second event");
    }


    /**
     * Called when the activity has become visible.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.e(msg, "The onResume() second event");
    }


    /**
     * Called when another activity is taking focus.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.e(msg, "The onPause() second event");
    }

    /**
     * Called when the activity is no longer visible.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.e(msg, "The onStop() second event");
    }

    /**
     * Called just before the activity is destroyed.
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(msg, "The onDestroy() second event");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(msg, "The onRestart() second event");
    }
}
