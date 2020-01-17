package com.example.maria.mariamihucoopculminating;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


public class adminDatabase extends AppCompatActivity {

    EditText nameInput;
    EditText ageInput;
    EditText allergyInput;
    EditText siblingInput;
    EditText extraInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_database);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);

        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter);

        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter);

        nameInput = (EditText) findViewById(R.id.name);
        ageInput = (EditText) findViewById(R.id.age);
        allergyInput = (EditText) findViewById(R.id.allergy);
        siblingInput = (EditText) findViewById(R.id.siblings);
        extraInput = (EditText) findViewById(R.id.extra);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 1) {
                    SharedPreferences adminName = getSharedPreferences("adminName1", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = adminName.edit();
                    editor.putString("name1", nameInput.getText().toString());
                    editor.apply();
                }
                if (position == 2) {
                    SharedPreferences adminName2 = getSharedPreferences("adminName22", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = adminName2.edit();
                    editor.putString("name2", nameInput.getText().toString());
                    editor.apply();
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 1) {
                    SharedPreferences adminAge = getSharedPreferences("adminAge1", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = adminAge.edit();
                    editor.putString("age1", ageInput.getText().toString());
                    editor.apply();
                }
                if (position == 2) {

                    SharedPreferences adminAge2 = getSharedPreferences("adminAge22", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = adminAge2.edit();
                    editor.putString("age2", ageInput.getText().toString());
                    editor.apply();
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 1) {
                    SharedPreferences adminAllergy = getSharedPreferences("adminAllergy1", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = adminAllergy.edit();
                    editor.putString("allergy1", allergyInput.getText().toString());
                    editor.apply();
                }
                if (position == 2) {
                    SharedPreferences adminAllergy2 = getSharedPreferences("adminAllergy22", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = adminAllergy2.edit();
                    editor.putString("allergy2", allergyInput.getText().toString());
                    editor.apply();
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 1) {
                    SharedPreferences adminSiblings = getSharedPreferences("adminSiblings1", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = adminSiblings.edit();
                    editor.putString("siblings1", siblingInput.getText().toString());
                    editor.apply();
                }
                if (position == 2) {
                    SharedPreferences adminSiblings2 = getSharedPreferences("adminSiblings22", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = adminSiblings2.edit();
                    editor.putString("siblings2", siblingInput.getText().toString());
                    editor.apply();
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 1) {
                    SharedPreferences adminExtra = getSharedPreferences("adminExtra1", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = adminExtra.edit();
                    editor.putString("extra1", extraInput.getText().toString());
                    editor.apply();
                }
                if (position == 2) {
                    SharedPreferences adminExtra2 = getSharedPreferences("adminExtra22", Context.MODE_PRIVATE);

                    SharedPreferences.Editor editor = adminExtra2.edit();
                    editor.putString("extra2", extraInput.getText().toString());
                    editor.apply();
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}


