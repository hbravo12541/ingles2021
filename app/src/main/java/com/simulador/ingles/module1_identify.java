package com.simulador.ingles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.developer.kalert.KAlertDialog;

public class module1_identify extends AppCompatActivity {
    private EditText uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez, once, doce;
    private ImageButton sendIdentify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_identify);

        uno = findViewById(R.id.editTextimageView1);
        dos = findViewById(R.id.editTextimageView2);
        tres = findViewById(R.id.editTextimageView3);
        cuatro = findViewById(R.id.editTextimageView4);
        cinco = findViewById(R.id.editTextimageView5);
        seis = findViewById(R.id.editTextimageView6);
        siete = findViewById(R.id.editTextimageView7);
        ocho = findViewById(R.id.editTextimageView8);
        nueve = findViewById(R.id.editTextimageView9);
        diez = findViewById(R.id.editTextimageView10);
        once = findViewById(R.id.editTextimageView11);
        doce = findViewById(R.id.editTextimageView12);

        sendIdentify = findViewById(R.id.imageButtonIdentify);
    }
    public void onClick(View view) {
        String valorUno = uno.getText().toString();
        String valorDos = dos.getText().toString();
        String valorTres = tres.getText().toString();
        String valorCuatro = cuatro.getText().toString();
        String valorCinco = cinco.getText().toString();
        String valorSeis = seis.getText().toString();
        String valorSiete = siete.getText().toString();
        String valorOcho = ocho.getText().toString();
        String valorNueve = nueve.getText().toString();
        String valorDiez = diez.getText().toString();
        String valorOnce = once.getText().toString();
        String valorDoce = doce.getText().toString();

        String aciertoValorUno = "1";
        String aciertoValorDos = "2";
        String aciertoValorTres = "3";
        String aciertoValorCuatro = "4";
        String aciertoValorCinco = "5";
        String aciertoValorSeis = "6";
        String aciertoValorSiete = "7";
        String aciertoValorOcho = "8";
        String aciertoValorNueve = "9";
        String aciertoValorDiez = "10";
        String aciertoValorOnce = "11";
        String aciertoValorDoce = "12";

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
            new KAlertDialog(this, KAlertDialog.SUCCESS_TYPE)
                    .setTitleText("Good Job!")
                    .setContentText("You write the right answers!")
                    .show();
        } else {
            new KAlertDialog(this, KAlertDialog.WARNING_TYPE)
                    .setTitleText("Are you sure?")
                    .setContentText("Check your answers again!")
                    .setConfirmText("Ok here we go again")
                    .show();
        }

    }
}