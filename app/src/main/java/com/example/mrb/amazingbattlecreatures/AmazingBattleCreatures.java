package com.example.mrb.amazingbattlecreatures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;

public class AmazingBattleCreatures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazing_battle_creatures);

    }

    public void duel(View vw)
    {
        boolean blnNoWinner = true;
        boolean blnFirstBCWins = false;
        boolean blnSecondBCWins = false;

        BattleCreature bcOne;
        BattleCreature bcTwo;

        bcOne = new BattleCreature("Mondoise", 100, 10, 5);
        bcTwo = new BattleCreature("Tuesachu", 100, 25, 10);

        bcOne.restore();
        bcTwo.restore();

        while(blnNoWinner)
        {
            // Thanks to Mr Hardman for the logic assist!
            if((bcTwo.isDefeated() == false) && (bcOne.isDefeated() == false))
            {
                bcOne.attack(bcTwo);
                Log.i("AmazingBattleCreatures", bcTwo.getLastAction());
                blnFirstBCWins = bcOne.hasWon();
            }
           if((bcOne.isDefeated() == false) && (bcTwo.isDefeated() == false))
           {
               bcTwo.attack(bcOne);
               Log.i("AmazingBattleCreatures", bcOne.getLastAction());
               blnSecondBCWins = bcTwo.hasWon();
           }

            blnNoWinner = !blnFirstBCWins && !blnSecondBCWins;
        }

        //Log.i("AmazingBattleCreatures", strbldrTotalResults.toString());
    }


}
