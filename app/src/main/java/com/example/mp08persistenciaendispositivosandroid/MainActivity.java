package com.example.mp08persistenciaendispositivosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

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

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextTextNom!=null && editTextTextCognom!=null && editTextPhone!=null && editTextTextEmailAddress!=null){
                    try {
                        FileOutputStream fileOutputStream = openFileOutput("contactes.txt", MODE_APPEND);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

                        String nom = editTextTextNom.getText().toString();
                        String cognom = editTextTextCognom.getText().toString();
                        String phone = editTextPhone.getText().toString();
                        String email = editTextTextEmailAddress.getText().toString();

                        outputStreamWriter.write(nom + ",");
                        outputStreamWriter.write(cognom + ",");
                        outputStreamWriter.write(phone + ",");
                        outputStreamWriter.write( email + ";\n");

                        outputStreamWriter.close();

                        Toast.makeText(getApplicationContext(), "Datos guardados correctamente en " + getFilesDir() + "/contactes.txt", Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
    }
