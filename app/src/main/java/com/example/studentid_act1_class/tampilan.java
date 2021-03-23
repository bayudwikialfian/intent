package com.example.studentid_act1_class;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tampilan extends AppCompatActivity {
Button keluar;
EditText Etnama,Etnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);
        keluar = findViewById(R.id.keluar);
        Etnama = findViewById(R.id.Etnama);
        Etnim = findViewById(R.id.Etnim);


        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("a");
        String password = bundle.getString("b");

        Etnim.setText(username);
        Etnama.setText(password);


        keluar.setOnClickListener(new View.OnClickListener() {
            private View v;

            @Override
            public void onClick(View v) {
                this.v = v;
                //perintah untuk mengakhiri aplikasi
                finish();
            }
        });
    }
}