package com.example.maria.mariamihucoopculminating;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewPasswordCreator extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    EditText changingpassName;
    EditText changingpassOld;
    EditText changingpassNew1;
    EditText changingpassNew2;

    String affirmative = "YES";
    Boolean confirmation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password_creator);
    }

    public void nameCHECK(View v){

        changingpassName = (EditText) findViewById(R.id.changingpassName);
        String nameEntered = changingpassName.getText().toString();

        changingpassOld = (EditText) findViewById(R.id.changingpassOld);
        changingpassNew1 = (EditText) findViewById(R.id.changingpassNew1);
        changingpassNew2 = (EditText) findViewById(R.id.changingpassNew2);

        if (v.getId() == R.id.nameCHECK){

            String checkForName = helper.searchForName(nameEntered);
            if(nameEntered.equals(checkForName)){
                String checkAccountAccess = helper.searchForAccountAccess(nameEntered);
                if (affirmative.equals(checkAccountAccess)){
                    String getId = helper.getCounsellorID(nameEntered);
                    Toast.makeText(this, getId, Toast.LENGTH_LONG).show();

                    SharedPreferences id = getSharedPreferences("id", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = id.edit();
                    editor.putString("id", getId);
                    editor.apply();
                }
                else{
                    Toast.makeText(this, "Invalid Name; Not a Senior.", Toast.LENGTH_LONG).show();
                }
            }
            else{
                Toast.makeText(this, "Invalid Name. Try Again.", Toast.LENGTH_LONG).show();
            }
            confirmation = true;
        }
    }

    public void saveNewPassword(View v){
        if (v.getId() == R.id.saveNewPassword){
            if(confirmation == true){
                String nameEntered = changingpassName.getText().toString();
                String oldPassEntered = changingpassOld.getText().toString();
                String newPassEntered = changingpassNew1.getText().toString();
                String newPassConfirmed = changingpassNew2.getText().toString();
                String emptyPassword = "No_Password";

                if(oldPassEntered.equals(emptyPassword)){
                    if(newPassEntered.equals(newPassConfirmed)){

                        int counsellorID;
                        SharedPreferences id = getSharedPreferences("id", Context.MODE_PRIVATE);
                        counsellorID = Integer.parseInt(id.getString("id", ""));

                        helper.updatePass(newPassConfirmed, counsellorID, emptyPassword);

                        Toast.makeText(this, "Success!", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(this, "ERROR. Try again.", Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(this, "ERROR. Try again.", Toast.LENGTH_LONG).show();
                }
            }
            else{
                Toast.makeText(this, "Name not confirmed. Try again.", Toast.LENGTH_LONG).show();
            }
        }
    }
}