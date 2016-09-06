package com.example.lenovo.test17;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    private final static String Key_name = "Name";
    private final static String Key_id = "ID";
    private final static String PreferencesFileName = "config";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences(PreferencesFileName, MODE_PRIVATE);
        editor=sharedPreferences.edit();
    }

    public void onSaveButtonClicked(View view) {
        editor.putString(Key_name,"张思含");
        editor.putString(Key_id,"2014011363");
        editor.apply();
        Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show();
    }

    public void onLoadButtonClicked(View view) {
        String name=sharedPreferences.getString(Key_name,null);
        String id=sharedPreferences.getString(Key_id,null);
        Toast.makeText(this,"结果为："+name+" "+id,Toast.LENGTH_SHORT).show();
    }
}
