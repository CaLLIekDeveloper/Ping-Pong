package com.CaLLIek.pingpong;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

public class GameActitity extends AppCompatActivity {

    PopupWindow popUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_actitity);



        FrameLayout layout = new FrameLayout(this);

        popUp = new PopupWindow(this);

        popUp.setBackgroundDrawable(new ColorDrawable(
                android.graphics.Color.TRANSPARENT));

        popUp.showAtLocation(layout, Gravity.TOP | Gravity.RIGHT,
                0, 0);
        popUp.update(30, 75, 500, 400);
    }
}
