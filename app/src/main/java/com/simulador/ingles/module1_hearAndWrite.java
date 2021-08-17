package com.simulador.ingles;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.developer.kalert.KAlertDialog;

public class module1_hearAndWrite extends AppCompatActivity {
    private Button validarRespuestaDeSonidos, btnSound1, btnSound2, btnSound3, btnSound4, btnSound5, btnSound6, btnSound7, btnSound8, btnSound9, btnSound10, btnSound11, btnSound12;
    private EditText editTextSound1, editTextSound2, editTextSound3, editTextSound4, editTextSound5, editTextSound6, editTextSound7, editTextSound8, editTextSound9, editTextSound10, editTextSound11, editTextSound12;
    MediaPlayer bear, birds, buho, cabra, cow, elefante, foca, gallo, grillo, lobos, mono, pato, pig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_hear_and_write);
        btnSound1 = findViewById(R.id.btnSound1);
        btnSound2 = findViewById(R.id.btnSound2);
        btnSound3 = findViewById(R.id.btnSound3);
        btnSound4 = findViewById(R.id.btnSound4);
        btnSound5 = findViewById(R.id.btnSound5);
        btnSound6 = findViewById(R.id.btnSound6);
        btnSound7 = findViewById(R.id.btnSound7);
        btnSound8 = findViewById(R.id.btnSound8);
        btnSound9 = findViewById(R.id.btnSound9);
        btnSound10 = findViewById(R.id.btnSound10);
        btnSound11 = findViewById(R.id.btnSound11);
        btnSound12 = findViewById(R.id.btnSound12);
        validarRespuestaDeSonidos = findViewById(R.id.validarRespuestaDeSonidos);


        editTextSound1 = findViewById(R.id.editTextSound1);
        editTextSound2 = findViewById(R.id.editTextSound2);
        editTextSound3 = findViewById(R.id.editTextSound3);
        editTextSound4 = findViewById(R.id.editTextSound4);
        editTextSound5 = findViewById(R.id.editTextSound5);
        editTextSound6 = findViewById(R.id.editTextSound6);
        editTextSound7 = findViewById(R.id.editTextSound7);
        editTextSound8 = findViewById(R.id.editTextSound8);
        editTextSound9 = findViewById(R.id.editTextSound9);
        editTextSound10 = findViewById(R.id.editTextSound10);
        editTextSound11 = findViewById(R.id.editTextSound11);
        editTextSound12 = findViewById(R.id.editTextSound12);

        bear = MediaPlayer.create(this, R.raw.bear);
        birds = MediaPlayer.create(this, R.raw.birds);
        buho = MediaPlayer.create(this, R.raw.buho);
        cabra = MediaPlayer.create(this, R.raw.cabra);
        cow = MediaPlayer.create(this, R.raw.cow);
        elefante = MediaPlayer.create(this, R.raw.elefante);
        foca = MediaPlayer.create(this, R.raw.foca);
        gallo = MediaPlayer.create(this, R.raw.gallo);
        grillo = MediaPlayer.create(this, R.raw.grillo);
        lobos = MediaPlayer.create(this, R.raw.lobos);
        mono = MediaPlayer.create(this, R.raw.mono);
        pato = MediaPlayer.create(this, R.raw.pato);
        pig = MediaPlayer.create(this, R.raw.pig);


        btnSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pig.start();
            }
        });

        btnSound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                birds.start();
            }
        });
        btnSound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buho.start();
            }
        });
        btnSound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cabra.start();
            }
        });
        btnSound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cow.start();
            }
        });
        btnSound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elefante.start();
            }
        });
        btnSound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foca.start();
            }
        });
        btnSound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gallo.start();
            }
        });
        btnSound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grillo.start();
            }
        });
        btnSound10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lobos.start();
            }
        });
        btnSound11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mono.start();
            }
        });
        btnSound12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pato.start();
            }
        });
        validarRespuestaDeSonidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valorUno = editTextSound1.getText().toString().toLowerCase();
                String valorDos = editTextSound2.getText().toString().toLowerCase();
                String valorTres = editTextSound3.getText().toString().toLowerCase();
                String valorCuatro = editTextSound4.getText().toString().toLowerCase();
                String valorCinco = editTextSound5.getText().toString().toLowerCase();
                String valorSeis = editTextSound6.getText().toString().toLowerCase();
                String valorSiete = editTextSound7.getText().toString().toLowerCase();
                String valorOcho = editTextSound8.getText().toString().toLowerCase();
                String valorNueve = editTextSound9.getText().toString().toLowerCase();
                String valorDiez = editTextSound10.getText().toString().toLowerCase();
                String valorOnce = editTextSound11.getText().toString().toLowerCase();
                String valorDoce = editTextSound12.getText().toString().toLowerCase();

                String aciertoValorUno = "pig";
                String aciertoValorDos = "bird";
                String aciertoValorTres = "owl";
                String aciertoValorCuatro = "goat";
                String aciertoValorCinco = "cow";
                String aciertoValorSeis = "elephant";
                String aciertoValorSiete = "seal";
                String aciertoValorOcho = "rooster";
                String aciertoValorNueve = "cricket";
                String aciertoValorDiez = "wolf";
                String aciertoValorOnce = "monkey";
                String aciertoValorDoce = "duck";

                if (
                        aciertoValorUno.equals(valorUno)
                                && aciertoValorDos.equals(valorDos)
                                && aciertoValorTres.equals(valorTres)
                                && aciertoValorCuatro.equals(valorCuatro)
                                && aciertoValorCinco.equals(valorCinco)
                                && aciertoValorSeis.equals(valorSeis)
                                && aciertoValorSiete.equals(valorSiete)
                                && aciertoValorOcho.equals(valorOcho)
                                && aciertoValorNueve.equals(valorNueve)
                                && aciertoValorDiez.equals(valorDiez)
                                && aciertoValorOnce.equals(valorOnce)
                                && aciertoValorDoce.equals(valorDoce)
                )
                {
                    //*OPCIONAL> EJECUTAR ALGUN TIPO DE CONSULTA PARA GUARDAR DATOS
                    new KAlertDialog(module1_hearAndWrite.this, KAlertDialog.SUCCESS_TYPE)
                            .setTitleText("Good Job!")
                            .setContentText("You write the right answers!")
                            .show();
                } else {
                    new KAlertDialog(module1_hearAndWrite.this, KAlertDialog.WARNING_TYPE)
                            .setTitleText("Hear again?")
                            .setContentText("Check your answers!")
                            .setConfirmText("Ok")
                            .show();
                }
            }
        });
    }
}