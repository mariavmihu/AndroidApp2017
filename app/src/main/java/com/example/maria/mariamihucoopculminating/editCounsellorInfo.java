package com.example.maria.mariamihucoopculminating;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.maria.mariamihucoopculminating.R.id.spinner;



public class editCounsellorInfo extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    String affirmative = "YES";
    String negative = "NO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_counsellor_info);

        Spinner loginSpinner = (Spinner) findViewById(R.id.loginPermission);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.options_array2, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        loginSpinner.setAdapter(adapter);

        loginSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 1) {
                    SharedPreferences storagetobeusedbySQLlater = getSharedPreferences("accountAccessState", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = storagetobeusedbySQLlater.edit();
                    editor.putString("state", affirmative);
                    editor.apply();
                }
                if (position == 2) {
                    SharedPreferences storagetobeusedbySQLlater = getSharedPreferences("accountAccessState", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = storagetobeusedbySQLlater.edit();
                    editor.putString("state", negative);
                    editor.apply();
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }

    public void sendtoSQL(View v){

        if(v.getId() == R.id.sendtoSQL)
        {
            SharedPreferences storagetobeusedbySQLlater = getSharedPreferences("accountAccessState", Context.MODE_PRIVATE);
            String accountAccessStr = storagetobeusedbySQLlater.getString("state", "");

            EditText firstname = (EditText)findViewById(R.id.firstname);
            EditText lastname = (EditText)findViewById(R.id.lastname);
            EditText age = (EditText)findViewById(R.id.ageC);
            EditText position = (EditText)findViewById(R.id.positionC);
            EditText allergies = (EditText)findViewById(R.id.allergiesC);
            EditText extra = (EditText)findViewById(R.id.extraC);

            String firstnamestr = firstname.getText().toString();
            String lastnamestr = lastname.getText().toString();
            String agestr = age.getText().toString();
            String positionstr = position.getText().toString();
            String allergiesstr = allergies.getText().toString();
            String extrastr = extra.getText().toString();

            Counsellors c = new Counsellors();
            c.setCounsellorFirstName(firstnamestr);
            c.setCounsellorLastName(lastnamestr);
            c.setCounsellorAge(agestr);
            c.setCounsellorPosition(positionstr);
            c.setCounsellorAllergies(allergiesstr);
            c.setCounsellorExtraNotes(extrastr);
            c.setAccountAccess(accountAccessStr);

            helper.insertCounsellor(c);
        }
    }
}
