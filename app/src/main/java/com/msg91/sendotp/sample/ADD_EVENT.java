package com.msg91.sendotp.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ADD_EVENT extends AppCompatActivity {
    EditText evntname,evntplace,evntdate,evnttime;
    Button addevent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__event);
        evntname=findViewById(R.id.event_name);
        evntplace=findViewById(R.id.eventPlace);
        evntdate=findViewById(R.id.event_date);
        evnttime=findViewById(R.id.event_time);
        addevent=findViewById(R.id.addevent);
        addevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
