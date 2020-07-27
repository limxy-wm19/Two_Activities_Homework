package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    TextView currentCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        currentCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void sayHello(View view) {

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("currentCount", currentCount.getText().toString());
        startActivity(intent);
    }
}