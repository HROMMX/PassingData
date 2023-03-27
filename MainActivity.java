package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        Intent i = new Intent("com.example.passingdata.SecondActivity");
        i.putExtra("str1", "Esta es una cadena");
        i.putExtra("age1", 25);
        Bundle extras = new Bundle();
        extras.putString("str2", "Esta es otra cadena");
        extras.putInt("age2", 35);
        i.putExtras(extras);
        startActivityForResult(i,1);
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                showMessage(data.getData().toString());
                showMessage(Integer.toString(data.getIntExtra("age3",0)));
            }
        }
    }
    public void showMessage(String message){
        Toast.makeText(this.getBaseContext(),message,Toast.LENGTH_SHORT).show();
    }
}
