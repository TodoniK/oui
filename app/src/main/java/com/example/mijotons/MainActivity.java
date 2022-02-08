package com.example.mijotons;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Intent intent;


    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mes_placards);

        //Navigation
        BottomNavigationView mBottomNavigationView = findViewById(R.id.navigationBar);
        mBottomNavigationView.setOnItemSelectedListener(item-> {
                switch (item.getItemId()){
                    case R.id.action_historique:
                        intent = new Intent(this, Historique.class);
                        startActivity(intent);
                        break;
                    case R.id.action_courses:
                        intent = new Intent(this, Courses.class);
                        startActivity(intent);
                        break;
                    case R.id.action_carte:
                        intent = new Intent(this, Carte.class);
                        startActivity(intent);
                        break;
                    case R.id.action_favoris:
                        intent = new Intent(this, Favoris.class);
                        startActivity(intent);
                        break;
                }
                return true;
        });

    }
}