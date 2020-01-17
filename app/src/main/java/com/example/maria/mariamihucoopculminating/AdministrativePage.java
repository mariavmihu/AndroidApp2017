package com.example.maria.mariamihucoopculminating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AdministrativePage extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrative_page);
    }

    public void signInToDatabase(View v) {
        if (v.getId() == R.id.adminSignIn) {
            EditText storeName = (EditText) findViewById(R.id.adminName);
            String str = storeName.getText().toString();
            EditText storePassword = (EditText) findViewById(R.id.adminPassword);
            String strP = storePassword.getText().toString();

            String yes = "true";

            String checkforAccess = helper.searchforADMIN(str);

            if (checkforAccess.equals(yes)) {
                String checkPassword = helper.searchPass(str);
                if (checkPassword.equals(strP)) {
                    Intent i = new Intent(this, adminHomepage.class);
                    startActivity(i);
                } else {
                    Toast.makeText(this, "Invalid", Toast.LENGTH_LONG).show();
                }
            }
            else{
                Toast.makeText(this, "No Admin User Found", Toast.LENGTH_LONG).show();
            }

        }

    }
}