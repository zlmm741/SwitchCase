package com.droider.switchcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str1 = packedSwitch(1);
        Toast.makeText(this,
                str1,
                Toast.LENGTH_SHORT).show();
        String str2 = sparseSwitch(777);
        Toast.makeText(this,
                str2,
                Toast.LENGTH_SHORT).show();
    }


    private String packedSwitch(int i) {
        String str = null;
        switch (i) {
            case 0:
                str = "She is a baby";
                break;
            case 1:
                str = "She is a girl";
                break;
            case 2:
                str = "She is a women";
                break;
            case 3:
                str = "She is a obasan";
                break;
            default:
                str = "She is a person";
                break;
        }
        return str;
    }

    private String sparseSwitch(int age) {
        String str = null;
        switch (age) {
            case 5:
                str = "He is a baby";
                break;
            case 55555:
                str = "He is a student";
                break;
            case 1000:
                str = "He is a father";
                break;
            case 777:
                str = "He is a grandpa";
                break;
            default:
                str = "He is a person";
                break;
        }
        return str;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
