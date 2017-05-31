package fda.christopher.galaga;

import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Game_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game__screen);
        final ImageView character = (ImageView) findViewById(R.id.imageView);
        final ImageView bullet = (ImageView) findViewById(R.id.imageView2);
        final ImageView nana = (ImageView) findViewById(R.id.imageView3);
        Button leftButton = (Button) findViewById(R.id.leftButton);
        Button rightButton = (Button) findViewById(R.id.rightButton);
        Button pewPew = (Button) findViewById(R.id.pewPew);
        final Handler handler = new Handler();
        final Runnable instructions = new Runnable() {
            @Override
            public void run() {
                bullet.setY(bullet.getY()-5);
                if(bullet.getY() > 0){
                    handler.post(this);
                }
                if((nana.getY() < bullet.getY() && nana.getY()+nana.getHeight() > bullet.getY())&&((nana.getX() < bullet.getX()) && (nana.getX()+nana.getWidth() > bullet.getX()))){
                    nana.setImageResource(android.R.color.transparent);
                }

            }
        };


        leftButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                character.setX(character.getX()-5);
            }
        });
        rightButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                character.setX(character.getX()+5);
            }
        });
        pewPew.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                bullet.setY(character.getY());
                bullet.setX(character.getX()+ character.getWidth()/2-bullet.getWidth()/2);
                handler.post(instructions);
            }
        });

    }
}
