package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.logging.LoggingMXBean;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        Log.i("Check", "If you see this, the app is working fine!");

        EditText editTextNumberDecimal = (EditText) findViewById(R.id.editTextNumberDecimal);

        String amountInPounds = editTextNumberDecimal.getText().toString();

        double amountInPoundsDouble= Double.parseDouble(amountInPounds);

        double amountInDollarsDouble = amountInPoundsDouble*1.26;

        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);

        Log.i("Amount in dollars", amountInDollarsString);

        Toast.makeText(this, "£" + amountInPounds + " is $" + amountInDollarsString, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}