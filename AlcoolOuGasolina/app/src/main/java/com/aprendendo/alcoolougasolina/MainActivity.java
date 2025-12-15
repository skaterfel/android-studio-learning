package com.aprendendo.alcoolougasolina;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPriceAlcool, editPriveGas;
    private TextView res;

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

    editPriceAlcool     = findViewById(R.id.editTxtAlcool);
    editPriveGas        = findViewById(R.id.editTxtGas);
    res                 = findViewById(R.id.resText);

    }

    public  void calcPrice(View view){
        String priceAlcool = editPriceAlcool.getText().toString();
        String priceGas = editPriveGas.getText().toString();

        Boolean validaCampoRes = validarCampos(priceAlcool, priceGas);
        if (validaCampoRes){
            Double numPriceAlcool = Double.parseDouble(priceAlcool);
            Double numPriceGas = Double.parseDouble(priceGas);

            if ((numPriceAlcool / numPriceGas) >= 0.7){
                res.setText("Melhor usar Gasolina!");
            } else {
                res.setText("Melhor usar Álcool!");
            }


        } else {
            res.setText("Preencha todos os campos!!!");
        }




    }

    public Boolean validarCampos(String pAlcool, String pGas){
        Boolean camposValidados = true;
        if (pAlcool.isEmpty() || pAlcool == null ){
            camposValidados = false;
        } else if (pGas.isEmpty() || pGas == null ){
            camposValidados = false;
        }

        return camposValidados;
    }
}