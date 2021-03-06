package com.olusayo.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

/**
 * Created by OLUSAYO on 01-Nov-17.
 */

public class Converter extends AppCompatActivity {
    private TextView ethTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        TextView textView = (TextView) findViewById(R.id.convertText);
        ethTextview = (TextView) findViewById(R.id.resulteth);
        String name = "Conversion From ";
        name += getIntent().getExtras().getString("name") + " To BTC & ETH";
        textView.setText(name);
        Button button = (Button) findViewById(R.id.buttonConvert);
        final EditText editText = (EditText) findViewById(R.id.userInput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float bth = Float.parseFloat(getIntent().getExtras().getString("value"));
                float eth = Float.parseFloat(getIntent().getExtras().getString("ethValue"));

                String b = editText.getText().toString();
                if (TextUtils.isEmpty(b)) {
                    Toast.makeText(Converter.this, "Enter A Value", Toast.LENGTH_SHORT).show();
                } else {
                    TextView textView = (TextView) findViewById(R.id.result);
                    TextView textView1 = (TextView) findViewById(R.id.resulteth);
                    bth = Float.parseFloat(b) / bth;
                    eth = Float.parseFloat(b) / eth;
                    DecimalFormat decimalFormat = new DecimalFormat("0.0000000");
                    String result = decimalFormat.format(bth);
                    String result1 = decimalFormat.format(eth);
                    textView.setText(result);
                    textView1.setText(result1);
                }

            }
        });
    }
}
