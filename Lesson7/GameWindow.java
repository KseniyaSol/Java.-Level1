package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    private GameMap gameMap;
    private OpenResults openResults;
    private Settings settings;
    private final int WIN_WIDTH = 500;
    private final int WIN_HEIGHT = 555;
    private JButton btnStartGame;
    private JButton btnExitGame;
    private JButton btnOpenResults;
    private JPanel panelForButtons;
    private int winPosX;
    private int winPosY;

    GameWindow(){
        setupWindow();
        setupButton();
        openResults = new OpenResults(this);
        settings = new Settings(this);
        gameMap = new GameMap();
        add(panelForButtons, BorderLayout.SOUTH);
        add(gameMap);
        setVisible(true);
    }

    private void setupWindow(){
        winPosX = 600;
        winPosY = 250;
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(winPosX, winPosY);
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void setupButton(){
        btnStartGame = new JButton("Start game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });

        btnExitGame = new JButton("Exit game");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnOpenResults = new JButton("Open results");
        btnOpenResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openResults.setVisible(true);
            }
        });

        panelForButtons = new JPanel();
        panelForButtons.setLayout(new GridLayout(3, 1));
        panelForButtons.add(btnStartGame);
        panelForButtons.add(btnOpenResults);
        panelForButtons.add(btnExitGame);
    }

    void startGameWithUserSettings(int gameMode, int fieldSizeX, int fieldSizeY, int winLength){
        gameMap.start(gameMode, fieldSizeX, fieldSizeY, winLength);
    }
}
