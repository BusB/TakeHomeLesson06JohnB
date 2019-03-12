package com.example.android.takehomelesson06_johnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Double subtotal = intent.getDoubleExtra(Keys.KEY_AMOUNT, 0);
        Double taxPercent = intent.getDoubleExtra(Keys.KEY_TAX, 0);
        Double tax = subtotal * (taxPercent * .01);
        Double tipPercent = intent.getDoubleExtra(Keys.KEY_TIP, 0);
        Double tip = subtotal * (tipPercent * .01);
        Double total = subtotal + tax + tip;
        DecimalFormat twoD = new DecimalFormat("#,###.00");
        DecimalFormat noD = new DecimalFormat("#,###.##");
        TextView textView = findViewById(R.id.text_view_receipt);
        textView.setText("Subtotal: " + twoD.format(subtotal) + "\nTax (" + noD.format(taxPercent) + "%): " + twoD.format(tax) + "\nTip (" + noD.format(tipPercent) + "%): " + twoD.format(tip) + "\nTotal: " + twoD.format(total));


    }
}
