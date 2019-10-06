package strategyGame.units;

import javax.swing.*;

public class Archery extends Building {

    public Archery (String color, Icon icon) {
        super(color, icon);
        name = "Archery";
        prefix = "AR";
        MAX_HP = 100;
        hp = MAX_HP;
        cost = 150;
        canMove = false;
        canAttack = false;
        canCreate = true;
    }
}
