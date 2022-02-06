package com.example.msbcheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

Boolean ischecked;
ArrayList<String> language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        language=new ArrayList<>();
    }

    public void selectlanguage(View view){


    ischecked=((CheckBox)view).isChecked();



        switch (view.getId())
        {
            case R.id.java_id:
                check(view);

                break;
            case R.id.php_id:
                check(view);

                break;

            case R.id.c_id:
                check(view);
                break;
            case R.id.cPlusplus_id:
                check(view);
                break;

        }

    }
    public void update()
    {
        Toast.makeText(getApplicationContext(),language+"",Toast.LENGTH_SHORT).show();
    }
    public void check(View view)
    {
        if(ischecked)
        {
            language.add(((CheckBox) view).getText().toString());
            update();

        }
        else
        {
            int index= language.indexOf(((CheckBox) view).getText().toString());
            language.remove(index);
            update();
        }

    }
}