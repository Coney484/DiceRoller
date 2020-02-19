package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewdicy;
    private Random randNum = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewdicy = findViewById(R.id.imageView);
        imageViewdicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollBack();
            }
        });

    }
    public  void rollBack()
    {
        int myRanNum = randNum.nextInt(6)+1;
        switch (myRanNum)
        {
            case 1:
                    imageViewdicy.setImageResource(R.drawable.dice1);
                    break;
            case 2:
                    imageViewdicy.setImageResource(R.drawable.dice2);
                    break;
            case 3:
                    imageViewdicy.setImageResource(R.drawable.dice3);
                    break;
            case 4:
                    imageViewdicy.setImageResource(R.drawable.dice4);
                    break;
            case 5:
                    imageViewdicy.setImageResource(R.drawable.dice5);
                    break;
            case 6:
                    imageViewdicy.setImageResource(R.drawable.dice6);
                    break;

        }
    }
}
