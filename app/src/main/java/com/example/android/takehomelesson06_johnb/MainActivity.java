package com.example.android.takehomelesson06_johnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enterButton = findViewById(R.id.total_button);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editAmount = findViewById(R.id.edit_text_amount);
                double subtotal = Double.parseDouble(editAmount.getText().toString());

                EditText editTax = findViewById(R.id.edit_text_tax);
                double tax = Double.parseDouble(editTax.getText().toString());

                EditText editTip = findViewById(R.id.edit_text_tip);
                double tip = Double.parseDouble(editTip.getText().toString());

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra(Keys.KEY_AMOUNT, subtotal);
                intent.putExtra(Keys.KEY_TAX, tax);
                intent.putExtra(Keys.KEY_TIP, tip);

                startActivity(intent);


            }
        });
    }


}
