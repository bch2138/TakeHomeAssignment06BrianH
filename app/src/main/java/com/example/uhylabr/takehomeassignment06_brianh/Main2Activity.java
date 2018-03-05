package com.example.uhylabr.takehomeassignment06_brianh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView yourreceipt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        yourreceipt = (TextView) findViewById(R.id.yourreceipt);



        Intent intent = getIntent();

        Bundle b = getIntent().getExtras();
        double mTotalBillAmount2 = b.getDouble("Total Bill Amount");
        double mTaxPercentage2 = b.getDouble("Tax Percentage");
        double mTipPercentage2 =b.getDouble("Tip Percentage");


        double percentageOfTip = (mTotalBillAmount2 * mTipPercentage2) / 100;
        double totalAmountForTheBill = mTotalBillAmount2 + percentageOfTip;
        double percentageOfTax = (mTaxPercentage2 * mTotalBillAmount2) / 100;
        double totalAmount = mTotalBillAmount2 + percentageOfTip + percentageOfTax;
        yourreceipt.setText("Your Receipt:"+"%.2f"+
                totalAmountForTheBill+"%.2f"+percentageOfTax+"%.2f"+percentageOfTip+"%.2f"+totalAmount);

    }}
