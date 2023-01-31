package com.example.session2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    CompoundButton on_off_switch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        on_off_switch=findViewById(R.id.on_off_switch);


    }


    public void click_Here(View view) {


        Toast.makeText(this, R.string.Here_is_more_information, Toast.LENGTH_LONG).show();
    }





public  void showSnackBar(View view,CompoundButton cb, boolean b){


        if(b){

            Snackbar.make(view,R.string.The_switch_is_now_on,Snackbar.LENGTH_LONG).setAction("undo",click->cb.setChecked(!b)).show();

        }else{


            Snackbar.make(view,R.string.The_switch_is_now_off,Snackbar.LENGTH_LONG).setAction("undo",click->cb.setChecked(!b)).show();
        }




}


    public void onCheckChanged(View view) {

        showSnackBar(view,on_off_switch,on_off_switch.isChecked());

    }
}