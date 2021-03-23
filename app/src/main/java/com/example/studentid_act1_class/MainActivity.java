package com.example.studentid_act1_class;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;



public class    MainActivity extends AppCompatActivity {

    EditText ETusername, ETpassword;
    Button btnmasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETusername = findViewById(R.id.ETusername);
        ETpassword = findViewById(R.id.ETpassword);
        btnmasuk = findViewById(R.id.masuk);




        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username="bayu dwiki alfian";
                String password="20160140003";

               username = ETusername.getText().toString();
               password = ETpassword.getText().toString();

                if (username.isEmpty() && password.isEmpty()) {
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "wajib di isi",
                            Toast.LENGTH_SHORT).show();
                } else {
                    //jika login gagal
                    if  (username.isEmpty() && password.isEmpty()){
                        Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                                Toast.LENGTH_SHORT).show();
                        Bundle b = new Bundle();
                        b.putString("a",username.trim());
                        b.putString("b",password.trim());
                        Intent i = new Intent(getApplicationContext(),tampilan.class);
                        i.putExtras(b);
                        startActivity(i);

                    }else {
                        Toast.makeText(getApplicationContext(),"login gagal",Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.mnDaftar){
            Intent i = new Intent(getApplicationContext(),pendaftaran.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

}