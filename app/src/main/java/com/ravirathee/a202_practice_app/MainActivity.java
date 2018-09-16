package com.ravirathee.a202_practice_app;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb;
    Button bt;
    Switch s;
    Spinner spinner;
    RatingBar rb;
    ProgressBar pb;
    DatePicker dp;
    TimePicker tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = findViewById(R.id.toggleButton);
        bt = findViewById(R.id.but);
        s =  findViewById(R.id.switch1);
        spinner = findViewById(R.id.spinner);
        rb = findViewById(R.id.ratingbar1);
        pb = findViewById(R.id.pb);
        dp = findViewById(R.id.datepicker);
        tp = findViewById(R.id.timepicker);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( tb.isChecked() ){
//                    Toast.makeText(getApplicationContext(),"On", Toast.LENGTH_SHORT).show();
                }else{
//                    Toast.makeText(getApplicationContext(),"Off", Toast.LENGTH_SHORT).show();

                }

                if( s.isChecked()){
//                    Toast.makeText(getApplicationContext(),"On", Toast.LENGTH_SHORT).show();

                }else{
//                    Toast.makeText(getApplicationContext(),"Off", Toast.LENGTH_SHORT).show();

                }

                String string = spinner.getSelectedItem().toString();
//                Toast.makeText(getApplicationContext(),string,Toast.LENGTH_SHORT).show();

                Float f = rb.getRating();
                String st = Float.toString(f);
//                Toast.makeText(getApplicationContext(),st,Toast.LENGTH_SHORT).show();

                pb.setProgress(50);
                pb.setMax(110);

                StringBuilder dateString = new StringBuilder("");

                dateString.append(dp.getMonth()+" "+ dp.getDayOfMonth()+" "+dp.getYear());

//                Toast.makeText(getApplicationContext(),dateString,Toast.LENGTH_SHORT).show();

                StringBuilder timeString = new StringBuilder("");

                timeString.append(tp.getMinute()+" "+tp.getHour());

                Toast.makeText(getApplicationContext(),timeString,Toast.LENGTH_SHORT).show();







            }
        });


    }
}
