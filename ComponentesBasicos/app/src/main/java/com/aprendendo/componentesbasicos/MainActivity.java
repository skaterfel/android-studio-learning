package com.aprendendo.componentesbasicos;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private EditText nomeEdit;
    private TextInputEditText emailEdit;
    private TextView res;
    private CheckBox cor1, cor2, cor3;
    private RadioButton radioButtonMasc, radioButtonFem;
    private RadioGroup radioGroup;

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


        nomeEdit        = findViewById(R.id.editName);
        emailEdit       = findViewById(R.id.editEmail);
        res             = findViewById(R.id.resTxt);

        //Radio Button and Group
        radioButtonMasc = findViewById(R.id.radioButtonMasc);
        radioButtonFem  = findViewById(R.id.radioButtonFem);
        radioGroup      = findViewById(R.id.radioGroupSexo);

        radiobutton();


        //CheckBox
        cor1 = findViewById(R.id.cor1);
        cor2 = findViewById(R.id.cor2);
        cor3 = findViewById(R.id.cor3);
    }

    public void checkbox(){
        String txt = "";
        if (cor1.isChecked()){
        //    String corSelecionada = cor1.getText().toString();
        //    txt = corSelecionada;
            txt = "Verde selecionado - ";
        }
        if(cor2.isChecked()){
            txt = txt + "Azul selecionado - ";
        }
        if(cor3.isChecked()){
            txt = txt +"Amarelo selecionado ";
        }

        res.setText(txt);
    }
    public void radiobutton(){

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonMasc){
                    res.setText("Masculino");
                } else if (checkedId == R.id.radioButtonFem){
                    res.setText("Feminino");

                }
            }
        });

        /*

        if (radioButtonFem.isChecked()){
            res.setText(radioButtonFem.getText().toString() + " Selecionado");
        } else if (radioButtonMasc.isChecked()){
            res.setText(radioButtonMasc.getText().toString() + " Selecionado");
        } else {
            res.setText("Erro na aplicação favor informar ao TI - (11) 3032-0209");
        }

         */

    }


    public void enviar(View v){
        // checkbox();
        //radiobutton();


        /*String nome = nomeEdit.getText().toString();
        String email = emailEdit.getText().toString();
        res.setText(nome + " | " + email);
         */


    }

    public void limpar( View view){
        nomeEdit.setText("");
        emailEdit.setText("");
    }
}