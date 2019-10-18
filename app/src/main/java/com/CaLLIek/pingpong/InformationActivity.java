package com.CaLLIek.pingpong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.CaLLIek.pingpong.Tutorial.TutorialFirstActivity;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        //убираем строку состояния андроида
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        LinearLayout btnBack = findViewById(R.id.information_btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainMenuActivity.class);
                startActivity(intent);
                finish();
            }
        });

        LinearLayout btnRules = findViewById(R.id.information_btn_rules);

        btnRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), TutorialFirstActivity.class);
                startActivity(intent);
                finish();
            }
        });

        LinearLayout btnShare = findViewById(R.id.information_btn_share);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ShareActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
