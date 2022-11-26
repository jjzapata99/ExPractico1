package com.example.trivicini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_lose extends AppCompatActivity {

    Button btnJugar = findViewById(R.id.btn_volver_a_jugar);
    Button btnSalir = findViewById(R.id.btn_salir);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);

        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_lose.this, game_p.class);
                startActivity(intent);
            }
        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(activity_lose.this, MainActivity.class);
                startActivity(intent2);
            }
        });

    }
}