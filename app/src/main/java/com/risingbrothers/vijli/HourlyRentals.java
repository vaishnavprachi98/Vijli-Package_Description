package com.risingbrothers.vijli;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class HourlyRentals extends AppCompatActivity {
    private TextView mTextMessage;
    private ImageView imview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_rentals);
        imview=(ImageView)findViewById(R.id.imageView);

        //mTextMessage = (TextView) findViewById(R.id.message);
        //BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }
    public void getSelectedRadioButton(View view)
    {
        final RadioGroup radGroup = (RadioGroup) findViewById(R.id.radioGroup1);
        int radioID = radGroup.getCheckedRadioButtonId();
        RadioButton singleButton = (RadioButton) findViewById(radioID);
        TextView myDisplay = (TextView) findViewById(R.id.textView4);
        myDisplay.setText(singleButton.getText());
    }


}
