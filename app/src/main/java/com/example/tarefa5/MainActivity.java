package com.example.tarefa5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button btsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Calculator");
        getSupportActionBar().hide();

        final TextView ver_check = (TextView)findViewById(R.id.txtresult);

        final EditText kmt = (EditText) findViewById(R.id.km);
        final EditText auton = (EditText) findViewById(R.id.autonomia);
        final EditText prec = (EditText) findViewById(R.id.preco);

        btsend = (Button) findViewById(R.id.btsend);
        btsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String km = kmt.getText().toString().trim();
                String autonomia = auton.getText().toString().trim();
                String preco = prec.getText().toString().trim();

                Double custo = 0.0;

                custo = (Double.valueOf(km) / Double.valueOf(autonomia) * Double.valueOf(preco));

                ver_check.setText(custo + " R$");


            }
        });
    }
}