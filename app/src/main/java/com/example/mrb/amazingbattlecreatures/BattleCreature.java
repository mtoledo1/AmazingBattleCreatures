package com.example.mrb.amazingbattlecreatures;

/**
 * Created by mrb on 16-03-02.
 */
public class BattleCreature
{
    private String strName;
    private int intHitPoints;
    private int intDefenceRating;
    private int intOffenceRating;
    private boolean blnIsDefeated;
    private boolean blnHasWon;

    public BattleCreature(String strName_PARAM,
                               int intHitPoints_PARAM,
                               int intDefenceRating_PARAM,
                               int intOffenceRating_PARAM)
    {
        this.strName = strName_PARAM;
        this.intHitPoints = intHitPoints_PARAM;
        this.intDefenceRating = intDefenceRating_PARAM;
        this.intOffenceRating = intOffenceRating_PARAM;
    }

    public void attack(BattleCreature battcreatOpponent_PARAM)
    {
        battcreatOpponent_PARAM.defend(intOffenceRating);

        if(battcreatOpponent_PARAM.isDefeated())
        {
            blnHasWon = true;
        }
        else
        {
            blnHasWon = false;
        }
    }

    public void defend(int intOffenceAmount_PARAM)
    {
        if (intOffenceAmount_PARAM >= intHitPoints)
        {
            intHitPoints = 0;
            blnIsDefeated = true;
        }
        else if (intOffenceAmount_PARAM > intDefenceRating)
        {
            intHitPoints = intHitPoints - (intOffenceAmount_PARAM - intDefenceRating);
            blnIsDefeated = false;
        }
        else
        {
            // No change in intHitPoints
            blnIsDefeated = false;
        }
    }

    public String getName()
    {
        return strName;
    }

    public boolean isDefeated()
    {
        return blnIsDefeated;
    }

    public boolean hasWon()
    {
        return blnHasWon;
    }


}
