package com.example.rishabh.clock;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Rishabh on 2/4/2018.
 */

public class tab2 extends Fragment {

    TimePicker picker;
    TextView timetextView;
    Button button,check;
    int a,b;

    /*
    Function for random time
     */
     private void SetTimer()

    {
        String time,s="";
        int d;
        Random rand=new Random();
        a=rand.nextInt(24);
        b=rand.nextInt(60);
        d=rand.nextInt(2);
        if (a<10)
        {
            s+= "0"+Integer.toString(a)+":"+Integer.toString(b);
            timetextView.setText(s);
        }
        else if(b<10)
        {
            s+=(Integer.toString(a)+":"+"0"+Integer.toString(b));
            timetextView.setText(s);
        }
        else if (a<10&&b<10)
        {
            s+=("0"+Integer.toString(a)+":"+"0"+Integer.toString(b));
            timetextView.setText(s);
        }
        else
        {
            timetextView.setText(Integer.toString(a)+":"+Integer.toString(b));
        }


    }

    /*
    Checking time set by user
     */

     @RequiresApi(api = Build.VERSION_CODES.M)
     private void checkTime()
    {
        MediaPlayer mediaPlayer;
        int hr=picker.getHour();
        int min=picker.getMinute();

        if (a==hr && b==min)
        {
            Toast.makeText(getContext(), "correct match", Toast.LENGTH_SHORT).show();
            mediaPlayer=MediaPlayer.create(getContext(),R.raw.correct);
            mediaPlayer.start();

        }
        else

        {
            Toast.makeText(getContext(), "Try Again", Toast.LENGTH_SHORT).show();
            mediaPlayer=MediaPlayer.create(getContext(),R.raw.wrong);
            mediaPlayer.start();
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

       View view=inflater.inflate(R.layout.tab2,container,false);

        timetextView=view.findViewById(R.id.time_display);
        picker=(TimePicker)view.findViewById(R.id.timePicker);
        button=(Button) view.findViewById(R.id.timeButton);
        picker.setIs24HourView(true);
        SetTimer();
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                SetTimer();
            }
        });

        check=(Button)view.findViewById(R.id.checkButton);
        check.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                checkTime();
            }
        });

       return view;
    }
}
