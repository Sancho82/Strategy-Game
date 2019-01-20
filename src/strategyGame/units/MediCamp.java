package strategyGame.units;

import strategyGame.mvp.Player;
import strategyGame.interfaces.Healer;

import javax.swing.*;

public class MediCamp extends Building implements Healer {

    public MediCamp(String color) {
        super(color);
        name = "MediCamp";
        prefix = "MC";
        icon = new ImageIcon(getClass().getResource("../icons/MediCamp1_Sq.png"));
        MAX_HP = 80;
        hp = MAX_HP;
        cost = 150;
        canMove = false;
        canAttack = false;
        canCreate = false;
        createRange = 0;
    }

    public void heal(Player player){
        for (int i = 0; i < player.getUnitList().size(); i++) {
            player.getUnitList().get(i).heal();
        }
    }
}
