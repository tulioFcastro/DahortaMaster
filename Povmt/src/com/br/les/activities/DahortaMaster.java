
package com.br.les.activities;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.br.les.povmt.R;
import com.br.les.util.Cardapio;
import com.br.les.util.HttpURLConnectionPOST;
import com.br.les.util.SubItem;
import com.google.gson.Gson;

public class DahortaMaster extends Activity {

    private EditText qtd_arroz, qtd_batata_doce, qtd_macarrao, qtd_lentilha,
            qtd_mostarda, qtd_tartaro, qtd_iogurte, qtd_tropical,
            qtd_tradicional, qtd_dahorta, qtd_carne, qtd_frango, qtd_queijo,
            qtd_panqueca;
    private Cardapio cardapio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_ti);
        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                cardapio = initializeCardapio();
                Gson gson = new Gson();
                String card = gson.toJson(cardapio);
                HttpURLConnectionPOST connPOST = new HttpURLConnectionPOST();
                connPOST.execute(card);
            }
        });
    }

    private void initializeQtd() {
        // Guarnicao
        this.qtd_arroz = (EditText) findViewById(R.id.qtd_arroz);
        this.qtd_batata_doce = (EditText) findViewById(R.id.qtd_batata_doce);
        this.qtd_macarrao = (EditText) findViewById(R.id.qtd_macarrao);
        this.qtd_lentilha = (EditText) findViewById(R.id.qtd_lentilha);
        // Molho
        this.qtd_mostarda = (EditText) findViewById(R.id.qtd_mostarda);
        this.qtd_tartaro = (EditText) findViewById(R.id.qtd_tartaro);
        this.qtd_iogurte = (EditText) findViewById(R.id.qtd_iogurte);
        // Salada
        this.qtd_tropical = (EditText) findViewById(R.id.qtd_tropical);
        this.qtd_tradicional = (EditText) findViewById(R.id.qtd_tradicional);
        this.qtd_dahorta = (EditText) findViewById(R.id.qtd_dahorta);
        // Acompanhamento
        this.qtd_carne = (EditText) findViewById(R.id.qtd_carne);
        this.qtd_frango = (EditText) findViewById(R.id.qtd_frango);
        this.qtd_queijo = (EditText) findViewById(R.id.qtd_queijo);
        this.qtd_panqueca = (EditText) findViewById(R.id.qtd_panqueca);
    }

    private Cardapio initializeCardapio() {
        initializeQtd();
        cardapio = new Cardapio();

        SubItem temp1 = new SubItem("Arroz", null, Integer.valueOf(qtd_arroz
                .getText().toString()));
        cardapio.addSubItem("Guarnicao", temp1);
        SubItem temp2 = new SubItem("Batata Doce", null,
                Integer.valueOf(qtd_batata_doce.getText().toString()));
        cardapio.addSubItem("Guarnicao", temp2);
        SubItem temp3 = new SubItem("Macarrao", null,
                Integer.valueOf(qtd_macarrao.getText().toString()));
        cardapio.addSubItem("Guarnicao", temp3);
        SubItem temp4 = new SubItem("Lentilha", null,
                Integer.valueOf(qtd_lentilha.getText().toString()));
        cardapio.addSubItem("Guarnicao", temp4);

        SubItem temp5 = new SubItem("Mostarda", null,
                Integer.valueOf(qtd_mostarda.getText().toString()));
        cardapio.addSubItem("Molho", temp5);
        SubItem temp6 = new SubItem("Tartaro", null,
                Integer.valueOf(qtd_tartaro.getText().toString()));
        cardapio.addSubItem("Molho", temp6);
        SubItem temp7 = new SubItem("Iogurte", null,
                Integer.valueOf(qtd_iogurte.getText().toString()));
        cardapio.addSubItem("Molho", temp7);

        SubItem temp8 = new SubItem("Tropical", null,
                Integer.valueOf(qtd_tropical.getText().toString()));
        cardapio.addSubItem("Salada", temp8);
        SubItem temp9 = new SubItem("Tradicional", null,
                Integer.valueOf(qtd_tradicional.getText().toString()));
        cardapio.addSubItem("Salada", temp9);
        SubItem temp10 = new SubItem("Dahorta", null,
                Integer.valueOf(qtd_dahorta.getText().toString()));
        cardapio.addSubItem("Salada", temp10);

        SubItem temp11 = new SubItem("Carne", null, Integer.valueOf(qtd_carne
                .getText().toString()));
        cardapio.addSubItem("Acompanhamento", temp11);
        SubItem temp12 = new SubItem("Frango", null, Integer.valueOf(qtd_frango
                .getText().toString()));
        cardapio.addSubItem("Acompanhamento", temp12);
        SubItem temp13 = new SubItem("Queijo", null, Integer.valueOf(qtd_queijo
                .getText().toString()));
        cardapio.addSubItem("Acompanhamento", temp13);
        SubItem temp14 = new SubItem("Panqueca", null,
                Integer.valueOf(qtd_panqueca.getText().toString()));
        cardapio.addSubItem("Acompanhamento", temp14);

        return cardapio;
    }

}
