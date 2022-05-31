package com.cst2335.khan0440;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;



public class MainActivity extends AppCompatActivity {

    LinearLayout mainlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton = (Button) findViewById(R.id.button2);mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.Toast), Toast.LENGTH_LONG).show();
            }
        });
        mainlayout = findViewById(R.id.mainLayout);


        Switch mswitch = (Switch) findViewById(R.id.switch1);
        mswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    Snackbar snack = Snackbar.make(mainlayout, getString(R.string.snackOn), Snackbar.LENGTH_LONG);
                    snack.setAction("Undo", click -> mswitch.setChecked(!b) );
                    snack.show();
                }else{
                    Snackbar snack = Snackbar.make(mainlayout, getString(R.string.snackOff), Snackbar.LENGTH_SHORT);
                    snack.show();
                }
            }
        });



    }


}