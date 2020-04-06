package com.example.eva2_2_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
Intent inSMS;
    Button btnEnviar;
    EditText edTxtTel;
    EditText edTxtSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edTxtSMS = findViewById(R.id.edTxtSMS);
        edTxtTel = findViewById(R.id.edTxtTel);
        btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String sTel = "smsto:" + edTxtTel.getText().toString();
                        String sSMS = edTxtSMS.getText().toString();
                        inSMS = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
                        inSMS.putExtra("sms_body", sSMS);
                        startActivity(inSMS);

                    }
                }

        );


    }
}
