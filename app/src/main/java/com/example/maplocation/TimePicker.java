package com.example.maplocation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.maplocation.databinding.ActivityTimePickerBinding;

public class TimePicker extends AppCompatActivity {
ActivityTimePickerBinding timePickerBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        timePickerBinding=ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(timePickerBinding.getRoot());
        timePickerBinding.textView.setText("Current Time:"+timerset());
        timePickerBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timePickerBinding.textView.setText("Current Time:"+timerset());
            }
        });
    }


    private String timerset() {
        StringBuilder stringBuilder=new StringBuilder();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            stringBuilder.append(timePickerBinding.timepicker.getHour()+":").append(timePickerBinding.timepicker.getMinute()+":").append(timePickerBinding.timepicker.is24HourView());

        }
        return stringBuilder.toString();
    }
}