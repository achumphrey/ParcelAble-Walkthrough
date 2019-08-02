package com.example.parcelablewalkthrough;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tv_first_name, tv_last_name, tv_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Person person = intent.getParcelableExtra(MainActivity.INTENT_MESSAGE);

        tv_first_name = findViewById(R.id.tv_first_name);
        tv_last_name = findViewById(R.id.tv_last_name);
        tv_age = findViewById(R.id.tv_age);

        tv_first_name.setText(person.getFirstName());
        tv_last_name.setText(person.getLastName());
        tv_age.setText(Integer.toString(person.getAge()));

    }
}
