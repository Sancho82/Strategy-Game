package strategyGame.mvp;

import strategyGame.units.Unit;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String color;
    private int gold;
    private boolean isPlaying;
    private List<Unit> unitList;

    public Player(String color) {
        this.color = color;
        gold = 1000; //370
        isPlaying = false;
        unitList = new ArrayList<>();
    }

    //region Getters

    public String getColor() {
        return color;
    }

    public int getGold() {
        return gold;
    }

    public boolean getPlaying() {
        return isPlaying;
    }

    public List<Unit> getUnitList() {
        return unitList;
    }

    //endregion


    //region Setters

    public void increaseGold() {
        gold += 50;
    }

    public void deCreaseGold(int cost) {
        gold -= cost;
    }

    //endregion

    public String toString() {
        return "<html><font color=white><Strong>Player:&nbsp</Strong></font>" + color + "<br>" +
                "<font color=white><Strong>Gold:&nbsp</Strong></font>" + gold + "<br>" +
                "</html>";
    }
}
