package Lesson7;

import javax.swing.*;
import java.awt.*;

public class OpenResults extends JFrame {

    private GameWindow gameWindow;
    private final int WIN_WIDTH = 300;
    private final int WIN_HEIGHT = 255;
    private int posX;
    private int posY;

    OpenResults(GameWindow gameWindow){
        this.gameWindow = gameWindow;
        setupWindow(gameWindow);
    }

    private void setupWindow(GameWindow gameWindow){
        Rectangle gameWindowBounds = gameWindow.getBounds();
        posX = (int) (gameWindowBounds.getCenterX() - WIN_WIDTH / 2);
        posY = (int) (gameWindowBounds.getCenterY() - WIN_HEIGHT / 2);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(posX, posY);
        setTitle("Results");
        setResizable(false);
    }
}
