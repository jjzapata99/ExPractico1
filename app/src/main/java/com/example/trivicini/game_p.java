package com.example.trivicini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
    int[] image = {R.drawable.trivia1,R.drawable.trivia2,R.drawable.trivia3,R.drawable.trivia4};
    Random rand = new Random();
    int contador=0;
    int tried =0;
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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img_trivia.setImageResource(image[tried]);
                txt_trivia.setText(trivia[tried]);

                btn1.setText(respuesta[tried][0]);
            }
        });
    }
    public int[] generateRandom(int n){
        int arreglo[]= new int[n];
        for(int i=0; i<=n; i++) {
            arreglo[i] = (int) (rand.nextInt(4) + 1);
        }
        return arreglo;
    }
}
