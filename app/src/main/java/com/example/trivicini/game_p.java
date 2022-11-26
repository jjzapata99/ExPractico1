package com.example.trivicini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Console;
import java.util.Random;

public class game_p extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;
    TextView txt_trivia;
    ImageView img_trivia;
    String[] trivia = {"Actor principal de la película No se aceptan devoluciones",
            "En qué año se estrenó Titanic",
            "Cómo se llama el auto rojo de Cars",
            "Actor principal de la saga Rambo"
            ,"Director de la pelicula Titanic"};
    String[][] respuesta = {
            {"-Eugenio Derbez","Leonardo DiCaprio", "Miguel Elizalde", "Vin Diesel"},
            {"1997", "2001", "1920", "1930"},
            {"Rayo McQueen", "Sally", "Doc Hudson", "Guido"},
            {"Sylvester Stallone", "Eugenio Derbez", "Miguel Elizalde", "Morgan Freeman"},
            {"James Cameron", "Steven Spielberg", "Martin Scorsese", "Quentin Tarantino"}};
    int[] image = {R.drawable.trivia1,R.drawable.trivia2,R.drawable.trivia3,R.drawable.trivia4,R.drawable.trivia5};
    Random rand = new Random();
    int contador=0;
    int tried =0;
    int[] value_rand = generateRandom(5);
    int [] value_rand_button = generateRandom(4);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_p);
        txt_trivia=findViewById(R.id.txt_trivia);
        img_trivia=(ImageView) findViewById(R.id.img_trivia);
        btn1= (Button) findViewById(R.id.btn_trivia1);
        btn2= (Button) findViewById(R.id.btn_trivia2);
        btn3= (Button) findViewById(R.id.btn_trivia3);
        btn4= (Button) findViewById(R.id.btn_trivia4);
        change(tried);
        tried++;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    change(tried);
                    tried++;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change(tried);
                tried++;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change(tried);
                tried++;
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change(tried);
                tried++;
            }
        });
    }
    public int[] generateRandom(int n){
        int arreglo[]= new int[n];
        for(int i=0; i<n; i++) {
            int num_rand = (int) (rand.nextInt(n) );
            for (int x = 0; x <= i; x++) {
                if (arreglo[x] != num_rand) {
                    arreglo[i] = num_rand;
                }
            }
        }
        return arreglo;
    }
    public void change(int verif) {
        if (verif < 5) {
            if(contador <3) {
                img_trivia.setImageResource(image[value_rand[verif]]);
                txt_trivia.setText(trivia[value_rand[verif]]);

                btn1.setText(respuesta[value_rand[verif]][value_rand_button[0]]);
                btn2.setText(respuesta[value_rand[verif]][value_rand_button[1]]);
                btn3.setText(respuesta[value_rand[verif]][value_rand_button[2]]);
                btn4.setText(respuesta[value_rand[verif]][value_rand_button[3]]);
            }
            else {
                Intent intent= new Intent(game_p.this, activity_lose.class);
                startActivity(intent);
            }
        } else {
            Intent intent= new Intent(game_p.this, activity_lose.class);
            startActivity(intent);
        }
    }
}
