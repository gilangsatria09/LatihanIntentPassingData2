package com.example.pojo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWIthObjectActivity extends AppCompatActivity {
    public static String EXTRA_PERSON = "extra_person";
    public TextView tvObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
        tvObject = (TextView)findViewById(R.id.tv_object_received);
        Person p = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : " +p.getName()+"\nAge : "+p.getAge()+"\nEmail : "+p.getEmail()+"\nCity : "+p.getCity();
        tvObject.setText(text);
    }
}
