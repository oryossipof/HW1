package com.example.minesweeper;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.Button;

public class MineSweeperMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_sweeper_main);

        Button ib = (Button) findViewById(R.id.records_button);
        Button b2 = (Button) findViewById(R.id.play_button);
        Button b3 = (Button) findViewById(R.id.exit_bt);
        aniMate(ib);
        aniMate(b2);
        aniMate(b3);
        
        
        final Button play =(Button) findViewById(R.id.play_button);
        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MineSweeperMainActivity.this,level.class);
                startActivity(intent);
            }
        });


        final Button records =(Button) findViewById(R.id.records_button);
        records.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

               // Intent intent = new Intent(MineSweeperMainActivity.this,level.class);
                /*startActivity(intent);*/
            }
        });



        final Button exit =(Button) findViewById(R.id.exit_bt);
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            //System.exit(0);

                finish();
                moveTaskToBack(true);
            }
        });

    }

    private void aniMate(Button b) {
        /*ObjectAnimator animY = ObjectAnimator.ofFloat(b, "translationY", -1000f, 0f);
        animY.setDuration(1000);
        animY.setInterpolator(new BounceInterpolator());
        animY.setRepeatCount(0);
        animY.start();*/

        float bottomOfScreen = getResources().getDisplayMetrics()
                .heightPixels - (b.getHeight() * 4);
        //bottomOfScreen is where you want to animate to

     /*   b.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setInterpolator(new BounceInterpolator())
                .setDuration(10000);*/

    }


}
