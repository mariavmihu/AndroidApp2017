package com.example.maria.mariamihucoopculminating;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    Integer increment = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.button2) {
            EditText storeName = (EditText) findViewById(R.id.username);
            String strU = storeName.getText().toString();
            EditText storePassword = (EditText) findViewById(R.id.password);
            String strP = storePassword.getText().toString();
            String affirmative = "YES";
            String emptyPassword = "No_Password";

            String checkAccountAccess = helper.searchForAccountAccess(strU);
            if (affirmative.equals(checkAccountAccess)) {
                String test4Password = helper.searchPass(strU);
                if(strP.equals(test4Password)){
                    if(!strP.equals(emptyPassword)){
                        Intent i = new Intent(MainActivity.this, attendancePage.class);
                        i.putExtra("Senior Counsellor Name", strU);
                        startActivity(i);
                    }
                    else{
                        Intent i = new Intent(this, NewPasswordCreator.class);
                        startActivity(i);
                    }
                }
                else{
                    Toast.makeText(this, "Invalid Password", Toast.LENGTH_LONG).show();
                }
            }
            else {
                Toast.makeText(this, "You do not have access to this account.", Toast.LENGTH_LONG).show();
            }

        }
    }
    public void adminButton(View view){

        SharedPreferences timesLoggedIn = getSharedPreferences("timesLoggedIn", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = timesLoggedIn.edit();
        editor.putInt("check", increment + 1);
        editor.apply();

        Integer check = timesLoggedIn.getInt("check", 0);

        if(check == 1){
            helper.insertAdmin();
            increment = increment + 1;
            editor = timesLoggedIn.edit();
            editor.putInt("check", increment);
            editor.apply();

            Intent intent = new Intent(this, AdministrativePage.class);
            startActivity(intent);
        }
        else{
            increment = increment + 1;
            Intent intent = new Intent(this, AdministrativePage.class);
            startActivity(intent);
        }
    }
}
