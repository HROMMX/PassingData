package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        showMessage(getIntent().getStringExtra("str1"));
        showMessage(Integer.toString(getIntent().getIntExtra("age1",0)));

        Bundle bundle= getIntent().getExtras();

        showMessage(bundle.getString("str2"));
        showMessage(Integer.toString(bundle.getInt("age2")));
    }
    public void onClick(View v){
        Intent i = new Intent();
        i.putExtra("age3",45);
        i.setData(Uri.parse("Algo se mando a la Actividad Principal"));
        setResult(RESULT_OK, i);
        finish();
    }
    public void showMessage(String message){
        Toast.makeText(this.getBaseContext(),message, Toast.LENGTH_SHORT).show();
    }
}
