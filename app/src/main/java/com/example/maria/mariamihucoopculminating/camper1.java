package com.example.maria.mariamihucoopculminating;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class camper1 extends AppCompatActivity {

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
    TextView nameName;
    TextView ageAge;
    TextView allergyAllergy;
    TextView siblingSibling;
    TextView extraExtra;

    EditText counsellorInput1;
    TextView displayingCounsellorInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camper1);

        nameName = (TextView) findViewById(R.id.awaitingName1);
        ageAge = (TextView) findViewById(R.id.awaitingAge1);
        allergyAllergy = (TextView) findViewById(R.id.awaitingAllergy1);
        siblingSibling = (TextView) findViewById(R.id.awaitingSiblings1);
        extraExtra = (TextView) findViewById(R.id.awaitingADMINnotes1);

        counsellorInput1 = (EditText) findViewById(R.id.counsellorInput);
        displayingCounsellorInput = (TextView) findViewById(R.id.awaitingCOUNSELLOR);

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

        SharedPreferences checkInMon = getSharedPreferences("LoginTime", Context.MODE_PRIVATE);
        String time = checkInMon.getString("mondayIn", "");
        displayMonMorn.setText(time);
        SharedPreferences checkOutMon = getSharedPreferences("LoginTime2", Context.MODE_PRIVATE);
        String time2 = checkOutMon.getString("mondayOut", "");
        displayMonEve.setText(time2);
        SharedPreferences checkInTues = getSharedPreferences("LoginTime3", Context.MODE_PRIVATE);
        String time3 = checkInTues.getString("tuesdayIn", "");
        displayTuesMorn.setText(time3);
        SharedPreferences checkOutTues = getSharedPreferences("LoginTime4", Context.MODE_PRIVATE);
        String time4 = checkOutTues.getString("tuesdayOut", "");
        displayTuesEve.setText(time4);
        SharedPreferences checkInWed = getSharedPreferences("LoginTime5", Context.MODE_PRIVATE);
        String time5 = checkInWed.getString("wednesdayIn", "");
        displayWedMorn.setText(time5);
        SharedPreferences checkOutWed = getSharedPreferences("LoginTime6", Context.MODE_PRIVATE);
        String time6 = checkOutWed.getString("wednesdayOut", "");
        displayWedEve.setText(time6);
        SharedPreferences checkInThurs = getSharedPreferences("LoginTime7", Context.MODE_PRIVATE);
        String time7 = checkInThurs.getString("thursdayIn", "");
        displayThursMorn.setText(time7);
        SharedPreferences checkOutThurs = getSharedPreferences("LoginTime8", Context.MODE_PRIVATE);
        String time8 = checkOutThurs.getString("thursdayOut", "");
        displayThursEve.setText(time8);
        SharedPreferences checkInFri = getSharedPreferences("LoginTime9", Context.MODE_PRIVATE);
        String time9 = checkInFri.getString("fridayIn", "");
        displayFriMorn.setText(time9);
        SharedPreferences checkOutFri = getSharedPreferences("LoginTime10", Context.MODE_PRIVATE);
        String time10 = checkOutFri.getString("fridayOut", "");
        displayFriEve.setText(time10);

        SharedPreferences counsellorInput = getSharedPreferences("counsellorInput", Context.MODE_PRIVATE);
        String additionalNotes = counsellorInput.getString("counsellorNotes", "");
        displayingCounsellorInput.setText(additionalNotes);

        SharedPreferences adminName = getSharedPreferences("adminName1", Context.MODE_PRIVATE);
        String nameAI = adminName.getString("name1", "");
        nameName.setText(nameAI);

        SharedPreferences adminAge = getSharedPreferences("adminAge1", Context.MODE_PRIVATE);
        String ageAI = adminAge.getString("age1", "");
        ageAge.setText(ageAI);

        SharedPreferences adminAllergy = getSharedPreferences("adminAllergy1", Context.MODE_PRIVATE);
        String allergyAI = adminAllergy.getString("allergy1", "");
        allergyAllergy.setText(allergyAI);

        SharedPreferences adminSiblings = getSharedPreferences("adminSiblings1", Context.MODE_PRIVATE);
        String siblingAI = adminSiblings.getString("siblings1", "");
        siblingSibling.setText(siblingAI);

        SharedPreferences adminExtra = getSharedPreferences("adminExtra1", Context.MODE_PRIVATE);
        String extraAI = adminExtra.getString("extra1", "");
        extraExtra.setText(extraAI);
    }

    public void saveCounsellorInput(View v){
        SharedPreferences counsellorInput = getSharedPreferences("counsellorInput", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = counsellorInput.edit();
        editor.putString("counsellorNotes", counsellorInput1.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveMonMorn(View v) {
        SharedPreferences checkInMon = getSharedPreferences("LoginTime", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkInMon.edit();
        editor.putString("mondayIn", mondayMorn.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveMonEve(View v) {
        SharedPreferences checkOutMon = getSharedPreferences("LoginTime2", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkOutMon.edit();
        editor.putString("mondayOut", mondayEve.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveTuesMorn(View v) {
        SharedPreferences checkInTues = getSharedPreferences("LoginTime3", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkInTues.edit();
        editor.putString("tuesdayIn", tuesdayMorn.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveTuesEve(View v) {
        SharedPreferences checkOutTues = getSharedPreferences("LoginTime4", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkOutTues.edit();
        editor.putString("tuesdayOut", tuesdayEve.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveWedMorn(View v) {
        SharedPreferences checkInWed = getSharedPreferences("LoginTime5", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkInWed.edit();
        editor.putString("wednesdayIn", wednesdayMorn.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveWedEve(View v) {
        SharedPreferences checkOutWed = getSharedPreferences("LoginTime6", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkOutWed.edit();
        editor.putString("wednesdayOut", wednesdayEve.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveThursMorn(View v) {
        SharedPreferences checkInThurs = getSharedPreferences("LoginTime7", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkInThurs.edit();
        editor.putString("thursdayIn", thursdayMorn.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveThursEve(View v) {
        SharedPreferences checkOutThurs = getSharedPreferences("LoginTime8", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkOutThurs.edit();
        editor.putString("thursdayOut", thursdayEve.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveFriMorn(View v) {
        SharedPreferences checkInFri = getSharedPreferences("LoginTime9", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkInFri.edit();
        editor.putString("fridayIn", fridayMorn.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void saveFriEve(View v) {
        SharedPreferences checkOutFri = getSharedPreferences("LoginTime10", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = checkOutFri.edit();
        editor.putString("fridayOut", fridayEve.getText().toString());
        editor.apply();

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }
}




