package Lesson7;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {

    public static final int GM_PVE = 0;
    public static final int GM_PVP = 1;
    private JButton mapField;
    GameMap(){
        setBackground(Color.BLUE);
    }

    void start(int gameMode, int fieldSizeX, int fieldSizeY, int winLength){
        System.out.println("Game started");
        setLayout(new GridLayout(fieldSizeX, fieldSizeY));
        ButtonGroup buttonGroup = new ButtonGroup();
        mapField = new JButton();
        add(mapField);
        buttonGroup.add(mapField);
    }
}
