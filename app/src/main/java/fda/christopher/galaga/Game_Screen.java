package fda.christopher.galaga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Game_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game__screen);
        ImageView character = (ImageView) findViewById(R.id.imageView);
        Button upButton = (Button) findViewById(R.id.upButton);
        Button downButton = (Button) findViewById(R.id.downButton);
        Button leftButton = (Button) findViewById(R.id.leftButton);
        Button rightButton = (Button) findViewById(R.id.rightButton);
    }
}
