package com.example.maria.mariamihucoopculminating;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class camper2 extends AppCompatActivity {

    TextView nameName2;
    TextView ageAge2;
    TextView allergyAllergy2;
    TextView siblingSibling2;
    TextView extraExtra2;
    EditText mondayMorn;
    EditText mondayEve;
    EditText tuesdayMorn;
    EditText tuesdayEve;
    EditText wednesdayMorn;
    EditText wednesdayEve;
    EditText thursdayMorn;
    EditText thursdayEve;
    EditText fridayMorn;
    EditText fridayEve;
    TextView displayMonMorn;
    TextView displayMonEve;
    TextView displayTuesMorn;
    TextView displayTuesEve;
    TextView displayWedMorn;
    TextView displayWedEve;
    TextView displayThursMorn;
    TextView displayThursEve;
    TextView displayFriMorn;
    TextView displayFriEve;

    EditText counsellorInput2;
    TextView displayingCounsellorInput2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camper1);

        counsellorInput2 = (EditText) findViewById(R.id.counsellorInput);
        displayingCounsellorInput2 = (TextView) findViewById(R.id.awaitingCOUNSELLOR);

        nameName2 = (TextView) findViewById(R.id.awaitingName1);
        ageAge2 = (TextView) findViewById(R.id.awaitingAge1);
        allergyAllergy2 = (TextView) findViewById(R.id.awaitingAllergy1);
        siblingSibling2 = (TextView) findViewById(R.id.awaitingSiblings1);
        extraExtra2 = (TextView) findViewById(R.id.awaitingADMINnotes1);

        mondayMorn = (EditText) findViewById(R.id.mondayMorn);
        mondayEve = (EditText) findViewById(R.id.mondayEve);
        tuesdayMorn = (EditText) findViewById(R.id.tuesdayMorn);
        tuesdayEve = (EditText) findViewById(R.id.tuesdayEve);
        wednesdayMorn = (EditText) findViewById(R.id.wednesdayMorn);
        wednesdayEve = (EditText) findViewById(R.id.wednesdayEve);
        thursdayMorn = (EditText) findViewById(R.id.thursdayMorn);
        thursdayEve = (EditText) findViewById(R.id.thursdayEve);
        fridayMorn = (EditText) findViewById(R.id.fridayMorn);
        fridayEve = (EditText) findViewById(R.id.fridayEve);
        displayMonMorn = (TextView) findViewById(R.id.displayMonMorn);
        displayMonEve = (TextView) findViewById(R.id.displayMonEve);
        displayTuesMorn = (TextView) findViewById(R.id.displayTuesMorn);
        displayTuesEve = (TextView) findViewById(R.id.displayTuesEve);
        displayWedMorn = (TextView) findViewById(R.id.displayWedMorn);
        displayWedEve = (TextView) findViewById(R.id.displayWedEve);
        displayThursMorn = (TextView) findViewById(R.id.displayThursMorn);
        displayThursEve = (TextView) findViewById(R.id.displayThursEve);
        displayFriMorn = (TextView) findViewById(R.id.displayFriMorn);
        displayFriEve = (TextView) findViewById(R.id.displayFriEve);

        SharedPreferences counsellorInput = getSharedPreferences("counsellorInput", Context.MODE_PRIVATE);
        String additionalNotes = counsellorInput.getString("counsellorNotes", "");
        displayingCounsellorInput2.setText(additionalNotes);

        SharedPreferences checkInMon2 = getSharedPreferences("LoginTime21", Context.MODE_PRIVATE);
        String time = checkInMon2.getString("mondayIn2", "");
        displayMonMorn.setText(time);

        SharedPreferences checkOutMon2 = getSharedPreferences("LoginTime22", Context.MODE_PRIVATE);
        String time2 = checkOutMon2.getString("mondayOut2", "");
        displayMonEve.setText(time2);

        SharedPreferences checkInTues2 = getSharedPreferences("LoginTime23", Context.MODE_PRIVATE);
        String time3 = checkInTues2.getString("tuesdayIn2", "");
        displayTuesMorn.setText(time3);

        SharedPreferences checkOutTues2 = getSharedPreferences("LoginTime24", Context.MODE_PRIVATE);
        String time4 = checkOutTues2.getString("tuesdayOut2", "");
        displayTuesEve.setText(time4);

        SharedPreferences checkInWed2 = getSharedPreferences("LoginTime25", Context.MODE_PRIVATE);
        String time5 = checkInWed2.getString("wednesdayIn2", "");
        displayWedMorn.setText(time5);

        SharedPreferences checkOutWed2 = getSharedPreferences("LoginTime26", Context.MODE_PRIVATE);
        String time6 = checkOutWed2.getString("wednesdayOut2", "");
        displayWedEve.setText(time6);

        SharedPreferences checkInThurs2 = getSharedPreferences("LoginTime27", Context.MODE_PRIVATE);
        String time7 = checkInThurs2.getString("thursdayIn2", "");
        displayThursMorn.setText(time7);

        SharedPreferences checkOutThurs2 = getSharedPreferences("LoginTime28", Context.MODE_PRIVATE);
        String time8 = checkOutThurs2.getString("thursdayOut2", "");
        displayThursEve.setText(time8);

        SharedPreferences checkInFri2 = getSharedPreferences("LoginTime29", Context.MODE_PRIVATE);
        String time9 = checkInFri2.getString("fridayIn2", "");
        displayFriMorn.setText(time9);

        SharedPreferences checkOutFri2 = getSharedPreferences("LoginTime210", Context.MODE_PRIVATE);
        String time10 = checkOutFri2.getString("fridayOut2", "");
        displayFriEve.setText(time10);

        SharedPreferences adminName2 = getSharedPreferences("adminName22", Context.MODE_PRIVATE);
        String nameAI = adminName2.getString("name2", "");
        nameName2.setText(nameAI);

        //retrieving data from SharedPreferences file and setting it to a TextView

        SharedPreferences adminAge2 = getSharedPreferences("adminAge22", Context.MODE_PRIVATE);
        String ageAI = adminAge2.getString("age2", "");
        ageAge2.setText(ageAI);

        SharedPreferences adminAllergy2 = getSharedPreferences("adminAllergy22", Context.MODE_PRIVATE);
        String allergyAI = adminAllergy2.getString("allergy2", "");
        allergyAllergy2.setText(allergyAI);

        SharedPreferences adminSiblings2 = getSharedPreferences("adminSiblings22", Context.MODE_PRIVATE);
        String siblingAI = adminSiblings2.getString("siblings2", "");
        siblingSibling2.setText(siblingAI);

        SharedPreferences adminExtra2 = getSharedPreferences("adminExtra22", Context.MODE_PRIVATE);
        String extraAI = adminExtra2.getString("extra2", "");
        extraExtra2.setText(extraAI);
    }

    public void saveCounsellorInput(View v){
        SharedPreferences counsellorInput = getSharedPreferences("counsellorInput", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = counsellorInput.edit();
        editor.putString("counsellorNotes", counsellorInput2.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveMonMorn(View v) {
        SharedPreferences checkInMon2 = getSharedPreferences("LoginTime21", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkInMon2.edit();
        editor.putString("mondayIn2", mondayMorn.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveMonEve(View v) {
        SharedPreferences checkOutMon2 = getSharedPreferences("LoginTime22", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkOutMon2.edit();
        editor.putString("mondayOut2", mondayEve.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveTuesMorn(View v) {
        SharedPreferences checkInTues2 = getSharedPreferences("LoginTime23", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkInTues2.edit();
        editor.putString("tuesdayIn2", tuesdayMorn.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveTuesEve(View v) {
        SharedPreferences checkOutTues2 = getSharedPreferences("LoginTime24", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkOutTues2.edit();
        editor.putString("tuesdayOut2", tuesdayEve.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveWedMorn(View v) {
        SharedPreferences checkInWed2 = getSharedPreferences("LoginTime25", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkInWed2.edit();
        editor.putString("wednesdayIn2", wednesdayMorn.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveWedEve(View v) {
        SharedPreferences checkOutWed2 = getSharedPreferences("LoginTime26", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkOutWed2.edit();
        editor.putString("wednesdayOut2", wednesdayEve.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveThursMorn(View v) {
        SharedPreferences checkInThurs2 = getSharedPreferences("LoginTime27", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkInThurs2.edit();
        editor.putString("thursdayIn2", thursdayMorn.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveThursEve(View v) {
        SharedPreferences checkOutThurs2 = getSharedPreferences("LoginTime28", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkOutThurs2.edit();
        editor.putString("thursdayOut2", thursdayEve.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveFriMorn(View v) {
        SharedPreferences checkInFri2 = getSharedPreferences("LoginTime29", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkInFri2.edit();
        editor.putString("fridayIn2", fridayMorn.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveFriEve(View v) {
        SharedPreferences checkOutFri2 = getSharedPreferences("LoginTime210", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkOutFri2.edit();
        editor.putString("fridayOut2", fridayEve.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }
}