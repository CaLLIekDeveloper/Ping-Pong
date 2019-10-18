package com.CaLLIek.pingpong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.CaLLIek.pingpong.Tutorial.TutorialFirstActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);



        //убираем строку состояния андроида
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView btnInfo = findViewById(R.id.main_menu_btn_info);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), InformationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView btnGame = findViewById(R.id.main_menu_btn_battle);

        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), GameActitity.class);
                startActivity(intent);
            }
        });

        ImageView btnTrainee = findViewById(R.id.main_menu_btn_training);

        btnTrainee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), TraineActivity.class);
                startActivity(intent);
            }
        });
    }
}
