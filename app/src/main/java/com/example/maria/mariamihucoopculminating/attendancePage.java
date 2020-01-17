package com.example.maria.mariamihucoopculminating;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class attendancePage extends AppCompatActivity {

    ToggleButton filledInCamperBC;
    ToggleButton filledInCamperAC;
    ToggleButton camper1BC;
    ToggleButton camper1AC;
    ToggleButton camper2BC;
    ToggleButton camper2AC;
    CheckBox camper1BBQ;
    CheckBox camper2BBQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_page);
        String counsellorName = getIntent().getStringExtra("Senior Counsellor Name");

        TextView tv = (TextView) findViewById(R.id.counsellorName);
        tv.setText(counsellorName + "'s");

        filledInCamperBC = (ToggleButton) findViewById(R.id.bc1);
        filledInCamperAC = (ToggleButton) findViewById(R.id.ac1);
        camper1BC = (ToggleButton) findViewById(R.id.bc2);
        camper1BC.setChecked(GetState1BC());
        camper1BC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                 @Override
                                                 public void onCheckedChanged(CompoundButton compoundButton, boolean changeMade) {
                                                     SaveState1BC(changeMade);
                                                 }
                                             });

        camper1AC = (ToggleButton) findViewById(R.id.ac2);
        camper1AC.setChecked(GetState1AC());
        camper1AC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                @Override
                                                public void onCheckedChanged(CompoundButton compoundButton, boolean changeMade) {
                                                    SaveState1AC(changeMade);
                                                }
                                            });

        camper2BC = (ToggleButton) findViewById(R.id.bc3);
        camper2BC.setChecked(GetState2BC());
        camper2BC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                @Override
                                                public void onCheckedChanged(CompoundButton compoundButton, boolean changeMade) {
                                                    SaveState2BC(changeMade);
                                                }
                                            });

        camper2AC = (ToggleButton) findViewById(R.id.ac3);
        camper2AC.setChecked(GetState2AC());
        camper2AC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                @Override
                                                public void onCheckedChanged(CompoundButton compoundButton, boolean changeMade) {
                                                    SaveState2AC(changeMade);
                                                }
                                            });

        camper1BBQ = (CheckBox) findViewById(R.id.bbp2);
        camper1BBQ.setChecked(GetState1BBQ());
        camper1BBQ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                @Override
                                                public void onCheckedChanged(CompoundButton compoundButton, boolean changeMade) {
                                                    SaveState1BBQ(changeMade);
                                                }
                                            });

        camper2BBQ = (CheckBox) findViewById(R.id.bbq3);
        camper2BBQ.setChecked(GetState2BBQ());
        camper2BBQ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                @Override
                                                public void onCheckedChanged(CompoundButton compoundButton, boolean changeMade) {
                                                    SaveState2BBQ(changeMade);
                                                }
                                            });
    }

    // recording if they have brought in their BBQ forms

    private void SaveState1BBQ(boolean changeMade){
        SharedPreferences states = getSharedPreferences("checkBox1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = states.edit();
        editor.putBoolean("bbq forms1", changeMade);
        editor.apply();

        Toast.makeText(this, "Saved Changes", Toast.LENGTH_LONG).show();
    }
    public boolean GetState1BBQ(){
        SharedPreferences states = getSharedPreferences("checkBox1", Context.MODE_PRIVATE);
        return states.getBoolean("bbq forms1", false);
    }

    private void SaveState2BBQ(boolean changeMade){
        SharedPreferences states = getSharedPreferences("checkBox2", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = states.edit();
        editor.putBoolean("bbq forms2", changeMade);
        editor.apply();

        Toast.makeText(this, "Saved Changes", Toast.LENGTH_LONG).show();
    }
    public boolean GetState2BBQ(){
        SharedPreferences states = getSharedPreferences("checkBox2", Context.MODE_PRIVATE);
        return states.getBoolean("bbq forms2", false);
    }

    //saving the states of the BeforeCare and AfterCare toggle buttons

    private void SaveState1BC(boolean changeMade){
        SharedPreferences states = getSharedPreferences("ToggleState", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = states.edit();
        editor.putBoolean("state of c1", changeMade);
        editor.apply();

        Toast.makeText(this, "Saved Changes", Toast.LENGTH_LONG).show();
    }
    public boolean GetState1BC(){
        SharedPreferences states = getSharedPreferences("ToggleState", Context.MODE_PRIVATE);
        return states.getBoolean("state of c1", false);
    }

    private void SaveState1AC(boolean changeMade){
        SharedPreferences states = getSharedPreferences("ToggleState2", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = states.edit();
        editor.putBoolean("state of c2", changeMade);
        editor.apply();

        Toast.makeText(this, "Saved Changes", Toast.LENGTH_LONG).show();
    }
    public boolean GetState1AC(){
        SharedPreferences states = getSharedPreferences("ToggleState2", Context.MODE_PRIVATE);
        return states.getBoolean("state of c2", false);
    }

    private void SaveState2BC(boolean changeMade){
        SharedPreferences states = getSharedPreferences("ToggleState1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = states.edit();
        editor.putBoolean("state of c11", changeMade);
        editor.apply();

        Toast.makeText(this, "Saved Changes", Toast.LENGTH_LONG).show();
    }
    public boolean GetState2BC(){
        SharedPreferences states = getSharedPreferences("ToggleState1", Context.MODE_PRIVATE);
        return states.getBoolean("state of c11", false);
    }

    private void SaveState2AC(boolean changeMade){
        SharedPreferences states = getSharedPreferences("ToggleState22", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = states.edit();
        editor.putBoolean("state of c22", changeMade);
        editor.apply();

        Toast.makeText(this, "Saved Changes", Toast.LENGTH_LONG).show();
    }
    public boolean GetState2AC(){
        SharedPreferences states = getSharedPreferences("ToggleState22", Context.MODE_PRIVATE);
        return states.getBoolean("state of c22", false);
    }

    //opening the individual camper pages

    public void camperFilledIn(View view) {
        Intent intent = new Intent(this, filledInCamper.class);
        startActivity(intent);
    }

    public void camper1(View view) {
        Intent intent = new Intent(this, camper1.class);
        startActivity(intent);
    }

    public void camper2(View view) {
        Intent intent = new Intent(this, camper2.class);
        startActivity(intent);
    }

    public void camper3(View view) {
        Intent intent = new Intent(this, camper3.class);
        startActivity(intent);
    }

    public void camper4(View view) {
        Intent intent = new Intent(this, camper4.class);
        startActivity(intent);
    }

    public void camper5(View view) {
        Intent intent = new Intent(this, camper5.class);
        startActivity(intent);
    }

}