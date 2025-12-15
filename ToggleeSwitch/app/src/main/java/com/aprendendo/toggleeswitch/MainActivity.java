package com.aprendendo.toggleeswitch;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private Switch switchButton;
    private CheckBox checkSenha;

    private TextView res;


    @SuppressLint("MissingInflatedId")
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

        //
        toggleButton = findViewById(R.id.toggleButton);
        switchButton = findViewById(R.id.switch1);
        checkSenha =  findViewById(R.id.checkSenha);
        res = findViewById(R.id.res);

        addListener();

    }

    public void addListener(){
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
                res.setText(
                        (switchButton.isChecked()   ?   "Ligado" :  "Desligado")
                );
            }
        });

    }

    public void enviar(View view){
        Boolean resSwitch = switchButton.isChecked();
        String resToggle = toggleButton.getText().toString();
        Boolean resCheckBox = checkSenha.isChecked();
        res.setText("Switch is:  "+ resSwitch +" | "+" Toggle is: " + resToggle);
        res.setText("CheckBox -> " + resCheckBox);
    }
}