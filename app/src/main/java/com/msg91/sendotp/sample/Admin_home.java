package com.msg91.sendotp.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Admin_home extends AppCompatActivity {
Button phycologist_btn,event,add_event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        phycologist_btn=findViewById(R.id.view_order);
        add_event=findViewById(R.id.addevent);
        event=findViewById(R.id.add_product);
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jj= new Intent(getApplicationContext(),Class_time_Admin.class);
                startActivity(jj );
            }
        });

        phycologist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Eventok.class);
                startActivity(i);
            }
        });
        add_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ja=new Intent(getApplicationContext(), ADD_EVENT.class);
                startActivity(ja);
            }
        });
    }

}

