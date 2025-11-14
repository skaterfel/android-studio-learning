package com.aprendendo.trabalhandocomdatas;

import android.annotation.SuppressLint;
import android.icu.util.LocaleData;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;

import androidx.activity.EdgeToEdge;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity {

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

        TextView txtDataView = findViewById(R.id.txtId1);
        LocalDate dataActual = LocalDate.now(ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormat = dataActual.format(formatter);
        txtDataView.setText(dataFormat);
    }

    @SuppressLint("SetTextI18n")
    public void calcularDatas(View view){
        TextView txtResView = findViewById(R.id.res);
        TextView txtDigitado = findViewById(R.id.editText1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu").withResolverStyle(ResolverStyle.STRICT);

        LocalDate dataNascimento = LocalDate.of(2020,9,22);
        LocalDate dataAniversario = LocalDate.parse(txtDigitado.getText().toString(),formatter);

        long diasFaltantes = ChronoUnit.DAYS.between(LocalDate.now(),dataAniversario);
        long diasFaltantes1 = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(2026,9,22));
        txtResView.setText(Long.toString(diasFaltantes));

    }

}