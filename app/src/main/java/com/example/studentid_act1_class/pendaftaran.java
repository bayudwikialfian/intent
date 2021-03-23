package com.example.studentid_act1_class;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class pendaftaran extends AppCompatActivity {
EditText enama,eemail,epass,erepass,ealamat;

FloatingActionButton fabSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        fabSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enama.getText().toString().isEmpty() ||
                        eemail.getText().toString().isEmpty() ||
                        epass.getText().toString().isEmpty() ||
                        erepass.getText().toString().isEmpty() ||
                        ealamat.getText().toString().isEmpty())
                {
                    Snackbar.make(v, "data harus di isi", Snackbar.LENGTH_SHORT).show();
                }
                else
                {
                    if(erepass.getText().toString().equals(epass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(),"daftar berhasil",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                    else {
                        Snackbar.make(v,"password dan repasword harus sama ",Snackbar.LENGTH_SHORT).show();
                    }
                }
            }

        });
    }
}