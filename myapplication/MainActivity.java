package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ArrayList<Player> players = new ArrayList<>();

            players.add(new Player(10, "Player1", new ArrayList<>(Arrays.asList(10, 20, 30))));
            players.add(new Player(9, "Player2", new ArrayList<>(Arrays.asList(15, 25, 35))));
            players.add(new Player(8, "Player3", new ArrayList<>(Arrays.asList(10, 20, 40))));
            players.add(new Player(7, "Player4", new ArrayList<>(Arrays.asList(20, 30, 40))));
            players.add(new Player(6, "Player5", new ArrayList<>(Arrays.asList(25, 35, 45))));
            players.add(new Player(5, "Player6", new ArrayList<>(Arrays.asList(30, 40, 50))));
            players.add(new Player(4, "Player7", new ArrayList<>(Arrays.asList(35, 45, 55))));
            players.add(new Player(3, "Player8", new ArrayList<>(Arrays.asList(40, 50, 60))));
            players.add(new Player(2, "Player9", new ArrayList<>(Arrays.asList(45, 55, 65))));
            players.add(new Player(1, "Player10", new ArrayList<>(Arrays.asList(50, 60, 70))));

            
            players.forEach(player -> System.out.println(player));


            Log.d("onCreate: ",players.toString());

    }
}