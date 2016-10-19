package com.example.rhdbs.chirend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by rhdbs on 2016-10-13.
 */

public class SubActivity extends AppCompatActivity {
    NumberPicker age_picker;
    RadioGroup gender_RG;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        setTitle("설문조사");


        age_picker = (NumberPicker) findViewById(R.id.age);
        age_picker.setMinValue(0);
        age_picker.setMaxValue(20);

        gender_RG = (RadioGroup) findViewById(R.id.gender);

    }

    public void showRst(View v){
        Intent intent = new Intent(this, ShowTypeRst.class);
        intent.putExtra("age", age_picker.getValue());
        RadioButton rb = (RadioButton) findViewById(gender_RG.getCheckedRadioButtonId());
        intent.putExtra("gender", rb.getText().toString());
        startActivity(intent);
    }

}
