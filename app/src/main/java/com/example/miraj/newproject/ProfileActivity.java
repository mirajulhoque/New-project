package com.example.miraj.newproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textView=findViewById(R.id.textView);

        String getName=getIntent().getExtras().getString("name");
        if (getName.equals("shoping")){
            textView.setText(R.string.Shoping_centere);
        }
        if (getName.equals("hospital")){
            textView.setText(R.string.txt_hospital);
        }
        if (getName.equals("computer")){
            textView.setText(R.string.txt_computer);
        }
        if (getName.equals("emergency")){
            textView.setText(R.string.txt_emergency);
        }
        if (getName.equals("tourist")){
            textView.setText(R.string.txt_tourist);
        }
        if (getName.equals("sports")){
            textView.setText(R.string.txt_Sports);
        }
        if (getName.equals("about")){
            textView.setText(R.string.txt_about);
        }









    }
    }

