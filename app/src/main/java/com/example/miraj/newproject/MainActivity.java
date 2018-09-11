package com.example.miraj.newproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShopping,btnHospital,btnComputer,btnEmergency,btnTourist,btnSports,btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShopping=findViewById(R.id.btn_shoping);
        btnHospital=findViewById(R.id.btn_hospital);
        btnComputer=findViewById(R.id.btn_computer);
        btnEmergency=findViewById(R.id.btn_emergency);
        btnTourist=findViewById(R.id.btn_tourist);
        btnSports=findViewById(R.id.btn_sports);
        btnAbout=findViewById(R.id.btn_about);

        btnShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("name","shoping");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "SHOPPING MALL", Toast.LENGTH_SHORT).show();
            }
        });
        btnHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("name","hospital");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "HOSPITAL AND CLINIC", Toast.LENGTH_SHORT).show();
            }
        });

        btnComputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("name","computer");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "COMPUTER SHOP", Toast.LENGTH_SHORT).show();
            }
        });

        btnEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("name","emergency");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "EMERGENCY SERVICES", Toast.LENGTH_SHORT).show();
            }
        });

        btnTourist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("name","tourist");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "TOURIST SPOT", Toast.LENGTH_SHORT).show();
            }
        });

        btnSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("name","sports");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "SPORTS SHOP", Toast.LENGTH_SHORT).show();
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("name","about");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "ABOUT APPS", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
