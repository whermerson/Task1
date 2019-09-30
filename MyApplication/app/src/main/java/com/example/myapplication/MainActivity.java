package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calculaCombustivel, resultadoCalculo;
    EditText valorGasolina, valorAlcool;
    Button btnCalcular;

    double valorAlcoolDouble, valorGasolinaDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        calculaCombustivel = findViewById(R.id.calculaCombustivel);
        resultadoCalculo = findViewById(R.id.resultadoCalculo);
        valorGasolina = findViewById(R.id.valorGasolina);
        valorAlcool = findViewById(R.id.valorAlcool);
        btnCalcular = findViewById(R.id.buttonCalcular);



        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valorGasolinaDouble = Double.parseDouble(valorGasolina.getText().toString());
                valorAlcoolDouble = Double.parseDouble(valorAlcool.getText().toString());

                if(valorAlcoolDouble>(0.7*valorGasolinaDouble)) {
                    resultadoCalculo.setText(R.string.resultadoGasolina);
                } else {
                    resultadoCalculo.setText(R.string.resultadoAlcool);
                }
            }

        });

    }
}
