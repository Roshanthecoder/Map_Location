package com.example.maplocation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.maplocation.databinding.ActivityCalenderBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Calender extends AppCompatActivity {
ActivityCalenderBinding calenderBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calenderBinding=ActivityCalenderBinding.inflate(getLayoutInflater());
        setContentView(calenderBinding.getRoot());
        calenderBinding.textView.setText("Current Date:"+getcurrentdate());
        calenderBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calenderBinding.textView.setText("Current Date:"+getcurrentdate());
            }
        });

      /*  List arrList = new ArrayList();
        SimpleDateFormat format1 = new SimpleDateFormat("dd-M-yyyy");
        Date date = null;
        Calendar cal = Calendar.getInstance();

        for (int i = 0; i <= 51; i++)
        {
            try
            {
                cal.add(Calendar.WEEK_OF_YEAR, +1);
                cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
                String formatted = format1.format(cal.getTime());
                date = format1.parse(formatted);
                arrList.add(date);
                Toast.makeText(this, ""+date, Toast.LENGTH_SHORT).show();
                Toast.makeText(this, ""+arrList, Toast.LENGTH_SHORT).show();

            } catch (Exception e) {
                e.printStackTrace();
            }*/
        }

    private String getcurrentdate() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(calenderBinding.datePicker.getDayOfMonth()+"/").append(calenderBinding.datePicker.getMonth()+"/").append(calenderBinding.datePicker.getYear());
        return stringBuilder.toString();
    }
}
