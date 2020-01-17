package com.example.maria.mariamihucoopculminating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class adminHomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_homepage);
    }

    public void gotoEditCamper(View v){

        if(v.getId() == R.id.editCamperInfoButton)
        {
            Intent i = new Intent(this, adminDatabase.class);
            startActivity(i);
        }
    }

    public void gotoEditCounsellors(View v){

        if(v.getId() == R.id.counsellorUpdateButton)
        {
            Intent i = new Intent(this, editCounsellorInfo.class);
            startActivity(i);
        }
    }

}
