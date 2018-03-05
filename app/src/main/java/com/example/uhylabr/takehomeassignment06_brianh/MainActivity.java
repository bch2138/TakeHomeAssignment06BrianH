package com.example.uhylabr.takehomeassignment06_brianh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText totalBillAmount;
    private EditText tipPercentage;
    private EditText taxPercentage;
    private Button calculateTip;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalBillAmount = (EditText)findViewById(R.id.bill_amount);
        tipPercentage = (EditText)findViewById(R.id.tip_percentage);
        taxPercentage = (EditText)findViewById(R.id.tax_percentage);

        final double totalBillAmount2 = Double.parseDouble(totalBillAmount.getText().toString());
        final double tipPercentage2 = Double.parseDouble(tipPercentage.getText().toString());
        final double taxPercentage2 = Double.parseDouble(taxPercentage.getText().toString());

        calculateTip = (Button) findViewById(R.id.calculate_tip);
        calculateTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                Bundle b = new Bundle();
                b.putDouble("Total Bill", totalBillAmount2);
                b.putDouble("Tax Percentage", taxPercentage2);
                b.putDouble("Tip Percentage", tipPercentage2);
                intent.putExtras(b);
                startActivity(intent);

                    }});}}