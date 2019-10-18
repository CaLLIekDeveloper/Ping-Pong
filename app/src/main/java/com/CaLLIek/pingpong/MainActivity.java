package com.CaLLIek.pingpong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.CaLLIek.pingpong.Tutorial.TutorialFirstActivity;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sPref;

    final String FIRST_TIME = "first_time";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //убираем строку состояния андроида
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent;
                //Если игру до этого не запускали открываем туториал иначе главное меню
                if(loadText()) intent = new Intent(MainActivity.this, TutorialFirstActivity.class);
                else
                    intent = new Intent(MainActivity.this, MainMenuActivity.class);
                startActivity(intent);
                saveText();
                finish();
            }
        };

        handler.postDelayed(runnable, 3000);
    }

    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putBoolean(FIRST_TIME, false);
        ed.commit();
    }

    boolean loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        return sPref.getBoolean(FIRST_TIME, true);
    }
}
