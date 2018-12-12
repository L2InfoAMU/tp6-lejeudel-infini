package model;

import javafx.scene.paint.Color;

import java.util.Random;

/**
 * {@link CellState} instances represent the possible states of a {@link CellState}.
 */
public enum CellState {
    ALIVE(true, chooseBlueOrRed()), DEAD(false, Color.WHITE);

    public final boolean isAlive;
    public final Color color;

    CellState(boolean isAlive, Color color) {
        this.isAlive = isAlive;
        this.color = color;
    }

    private static Color chooseBlueOrRed () {
        if (new Random().nextBoolean()) return Color.BLUE;
        else return Color.RED;
    }
}
