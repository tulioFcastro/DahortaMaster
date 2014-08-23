
package com.br.les.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.br.les.util.Menu;
import com.br.les.util.HttpURLConnectionPOST;
import com.br.les.util.SubItem;
import com.dahorta.master.R;
import com.google.gson.Gson;

public class DahortaMaster extends Activity {

    private Menu cardapio;
    private EditText qtd_arroz, qtd_batata_doce, qtd_macarrao, qtd_lentilha,
            qtd_mostarda, qtd_tartaro, qtd_iogurte, qtd_tropical,
            qtd_tradicional, qtd_dahorta, qtd_carne, qtd_frango, qtd_queijo,
            qtd_panqueca;
    private EditText desc_arroz, desc_batata_doce, desc_macarrao,
            desc_lentilha, desc_mostarda, desc_tartaro, desc_iogurte,
            desc_tropical, desc_tradicional, desc_dahorta, desc_carne,
            desc_frango, desc_queijo, desc_panqueca;
    private ImageView btCamera_arroz, btCamera_batataDoce, btCamera_macarrao,
            btCamera_lentilha, btCamera_mostarda, btCamera_tartaro,
            btCamera_iogurte, btCamera_tropical, btCamera_tradicional,
            btCamera_dahorta, btCamera_carne, btCamera_frango, btCamera_queijo,
            btCamera_panqueca;
    private Bitmap mImage_arroz, mImage_batataDoce, mImage_macarrao,
            mImage_lentilha, mImage_mostarda, mImage_tartaro, mImage_iogurte,
            mImage_tropical, mImage_tradicional, mImage_dahorta, mImage_carne,
            mImage_frango, mImage_queijo, mImage_panqueca;
    private Bitmap tempBitmap;
    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_ti);
        Button bt = (Button) findViewById(R.id.button_send);
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
        initializeCams();
    }

    @Override
    public final void onActivityResult(final int requestCode,
            final int resultCode, final Intent data) {
        if (data != null) {
            final Bundle extras = data.getExtras();
            System.out.println("##### CAM: " + extras);

            final Bitmap imageBitmap = (Bitmap) extras.get("data");
            tempBitmap = imageBitmap;
            System.out.println("##tempBitmap: " + tempBitmap);
        }
        System.out.println("##### TEMP: "+tempBitmap);
    }

    private void initializeCams() {
        btCamera_arroz = (ImageView) findViewById(R.id.camera_arroz);
        btCamera_arroz.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_batataDoce = (ImageView) findViewById(R.id.camera_batata_doce);
        btCamera_batataDoce.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_macarrao = (ImageView) findViewById(R.id.camera_macarrao);
        btCamera_macarrao.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_lentilha = (ImageView) findViewById(R.id.camera_lentilha);
        btCamera_lentilha.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_mostarda = (ImageView) findViewById(R.id.camera_mostarda);
        btCamera_mostarda.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_tartaro = (ImageView) findViewById(R.id.camera_tartaro);
        btCamera_tartaro.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();
                System.out.println("##tempBitmapbt: " + tempBitmap);
                if (tempBitmap != null) {
                    btCamera_tartaro.setImageBitmap(tempBitmap);
                    // tempBitmap = null;
                }
            }
            
        });
        
        btCamera_iogurte = (ImageView) findViewById(R.id.camera_iogurte);
        btCamera_iogurte.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_tropical = (ImageView) findViewById(R.id.camera_tropical);
        btCamera_tropical.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_tradicional = (ImageView) findViewById(R.id.camera_tradicional);
        btCamera_tradicional.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_dahorta = (ImageView) findViewById(R.id.camera_dahorta);
        btCamera_dahorta.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_carne = (ImageView) findViewById(R.id.camera_carne);
        btCamera_carne.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_frango = (ImageView) findViewById(R.id.camera_frango);
        btCamera_frango.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_queijo = (ImageView) findViewById(R.id.camera_queijo);
        btCamera_queijo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
        btCamera_panqueca = (ImageView) findViewById(R.id.camera_panqueca);
        btCamera_panqueca.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                dispatchTakePictureIntent();

            }
        });
    }

    private void initializeFields() {
        // Guarnicao
        this.qtd_arroz = (EditText) findViewById(R.id.qtd_arroz);
        this.desc_arroz = (EditText) findViewById(R.id.desc_arroz);
        this.qtd_batata_doce = (EditText) findViewById(R.id.qtd_batata_doce);
        this.desc_batata_doce = (EditText) findViewById(R.id.desc_batata_doce);
        this.qtd_macarrao = (EditText) findViewById(R.id.qtd_macarrao);
        this.desc_macarrao = (EditText) findViewById(R.id.desc_macarrao);
        this.qtd_lentilha = (EditText) findViewById(R.id.qtd_lentilha);
        this.desc_lentilha = (EditText) findViewById(R.id.desc_lentilha);
        // Molho
        this.qtd_mostarda = (EditText) findViewById(R.id.qtd_mostarda);
        this.desc_mostarda = (EditText) findViewById(R.id.desc_mostarda);
        this.qtd_tartaro = (EditText) findViewById(R.id.qtd_tartaro);
        this.desc_tartaro = (EditText) findViewById(R.id.desc_tartaro);
        this.qtd_iogurte = (EditText) findViewById(R.id.qtd_iogurte);
        this.desc_iogurte = (EditText) findViewById(R.id.desc_iogurte);
        // Salada
        this.qtd_tropical = (EditText) findViewById(R.id.qtd_tropical);
        this.desc_tropical = (EditText) findViewById(R.id.desc_tropical);
        this.qtd_tradicional = (EditText) findViewById(R.id.qtd_tradicional);
        this.desc_tradicional = (EditText) findViewById(R.id.desc_tradicional);
        this.qtd_dahorta = (EditText) findViewById(R.id.qtd_dahorta);
        this.desc_dahorta = (EditText) findViewById(R.id.desc_dahorta);
        // Acompanhamento
        this.qtd_carne = (EditText) findViewById(R.id.qtd_carne);
        this.desc_carne = (EditText) findViewById(R.id.desc_carne);
        this.qtd_frango = (EditText) findViewById(R.id.qtd_frango);
        this.desc_frango = (EditText) findViewById(R.id.desc_frango);
        this.qtd_queijo = (EditText) findViewById(R.id.qtd_queijo);
        this.desc_queijo = (EditText) findViewById(R.id.desc_queijo);
        this.qtd_panqueca = (EditText) findViewById(R.id.qtd_panqueca);
        this.desc_panqueca = (EditText) findViewById(R.id.desc_panqueca);
    }

    private Menu initializeCardapio() {
        initializeFields();
        cardapio = new Menu();

        SubItem temp1 = new SubItem("Arroz", null, Integer.valueOf(qtd_arroz
                .getText().toString()), desc_arroz.getText().toString());
        cardapio.addSubItem("Guarnicao", temp1);
        SubItem temp2 = new SubItem("Batata Doce", null,
                Integer.valueOf(qtd_batata_doce.getText().toString()),
                desc_batata_doce.getText().toString());
        cardapio.addSubItem("Guarnicao", temp2);
        SubItem temp3 = new SubItem("Macarrao", null,
                Integer.valueOf(qtd_macarrao.getText().toString()),
                desc_macarrao.getText().toString());
        cardapio.addSubItem("Guarnicao", temp3);
        SubItem temp4 = new SubItem("Lentilha", null,
                Integer.valueOf(qtd_lentilha.getText().toString()),
                desc_lentilha.getText().toString());
        cardapio.addSubItem("Guarnicao", temp4);

        SubItem temp5 = new SubItem("Mostarda", null,
                Integer.valueOf(qtd_mostarda.getText().toString()),
                desc_mostarda.getText().toString());
        cardapio.addSubItem("Molho", temp5);
        SubItem temp6 = new SubItem("Tartaro", null,
                Integer.valueOf(qtd_tartaro.getText().toString()), desc_tartaro
                        .getText().toString());
        cardapio.addSubItem("Molho", temp6);
        SubItem temp7 = new SubItem("Iogurte", null,
                Integer.valueOf(qtd_iogurte.getText().toString()), desc_iogurte
                        .getText().toString());
        cardapio.addSubItem("Molho", temp7);

        SubItem temp8 = new SubItem("Tropical", null,
                Integer.valueOf(qtd_tropical.getText().toString()),
                desc_tropical.getText().toString());
        cardapio.addSubItem("Salada", temp8);
        SubItem temp9 = new SubItem("Tradicional", null,
                Integer.valueOf(qtd_tradicional.getText().toString()),
                desc_tradicional.getText().toString());
        cardapio.addSubItem("Salada", temp9);
        SubItem temp10 = new SubItem("Dahorta", null,
                Integer.valueOf(qtd_dahorta.getText().toString()), desc_dahorta
                        .getText().toString());
        cardapio.addSubItem("Salada", temp10);

        SubItem temp11 = new SubItem("Carne", null, Integer.valueOf(qtd_carne
                .getText().toString()), desc_carne.getText().toString());
        cardapio.addSubItem("Acompanhamento", temp11);
        SubItem temp12 = new SubItem("Frango", null, Integer.valueOf(qtd_frango
                .getText().toString()), desc_frango.getText().toString());
        cardapio.addSubItem("Acompanhamento", temp12);
        SubItem temp13 = new SubItem("Queijo", null, Integer.valueOf(qtd_queijo
                .getText().toString()), desc_queijo.getText().toString());
        cardapio.addSubItem("Acompanhamento", temp13);
        SubItem temp14 = new SubItem("Panqueca", null,
                Integer.valueOf(qtd_panqueca.getText().toString()),
                desc_panqueca.getText().toString());
        cardapio.addSubItem("Acompanhamento", temp14);

        return cardapio;
    }

    /**
     * Create a intent of cam.
     */
    private void dispatchTakePictureIntent() {
        final Intent takePictureIntent =
                new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
    }

}
