package com.example.jeansmits.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jeansmits on 8/09/15.
 */
public class PrefActivity extends AppCompatActivity{

    public void buttonFoto(View view){
        Intent intent=new Intent(this, FotoActivity.class );
        startActivity(intent);
        finish();
    }

    public final static String PREF_NAME="editTextTeamname";
    public EditText textTeamName;
    public EditText textSporthal;
    public Button buttonSave;
    public Button buttonGet;
    public Button buttonClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preference);

        textTeamName= (EditText) findViewById(R.id.editTextTeamname);
        textSporthal= (EditText) findViewById(R.id.editTextSportzaal);
        buttonSave= (Button) findViewById(R.id.buttonSave);
        buttonClear= (Button) findViewById(R.id.buttonClear);
        buttonGet= (Button) findViewById(R.id.buttonGet);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText=textTeamName.getText().toString();
                setTeamPreference(PrefActivity.this, inputText);
            }
        });

        buttonGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpuText=getTeamPreference(PrefActivity.this);
                textTeamName.setText(inpuText);
            }
        });
    }


    public static String getTeamPreference(Context context){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString(PREF_NAME, null);
    }

    public static void setTeamPreference(Context context, String name){
        SharedPreferences sharedPreferences=PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString(PREF_NAME, name);
        editor.apply();
    }

    public static void clearTeamPreference (Context context){
        SharedPreferences sharedPreferences=PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.remove(PREF_NAME);
        editor.apply();
    }




}
