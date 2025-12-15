package com.aprendendo.calculadoradegorjeta;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText valorDigitado;
    private double valor;
    private TextView gorjetaPorcento;
    private SeekBar seekBar;
    private TextView valorGorjeta;
    private TextView valorTotal;

    //TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        valorDigitado = findViewById(R.id.valorConta);
        seekBar = findViewById(R.id.seekbarGorjeta);
        gorjetaPorcento = findViewById(R.id.gorjetaPorcento);
        valorGorjeta = findViewById(R.id.valorGorjeta);
        valorTotal = findViewById(R.id.valorTotal);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String valorString = valorDigitado.getText().toString();
                if (valorString.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Digite um valor no campo ", Toast.LENGTH_SHORT).show();
                } else {
                    valor = Double.parseDouble(valorString);
                    //res.setText(valor + " foi digitado. ");

                }

                gorjetaPorcento.setText( progress + " %");
                double porcentagem = (valor * progress)/100;
                valorGorjeta.setText("R$ " + porcentagem);
                valorTotal.setText("R$ " + (porcentagem + valor));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }














    // codigo funcionando com button

    public void clicou(View view){
        String valorString = valorDigitado.getText().toString();
        if (valorString.isEmpty()){
            Toast.makeText(getApplicationContext(), "Digite um valor no campo ", Toast.LENGTH_SHORT).show();
        } else {
            double valor = Double.parseDouble(valorString);
            //res.setText(valor + " foi digitado. ");

        }
    }




}