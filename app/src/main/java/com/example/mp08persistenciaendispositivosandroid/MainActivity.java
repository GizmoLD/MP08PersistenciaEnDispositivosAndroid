package com.example.mp08persistenciaendispositivosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button0;

    private EditText editTextTextNom;
    private EditText editTextTextCognom;
    private EditText editTextPhone;
    private EditText editTextTextEmailAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);

        editTextTextNom = findViewById(R.id.editTextTextNom);
        editTextTextCognom = findViewById(R.id.editTextTextCognom);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);

        button0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (editTextTextNom!=null && editTextTextCognom!=null && editTextPhone!=null && editTextTextEmailAddress!=null){

                }
            }
        });
    }
}