package Lesson7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame {

    private GameWindow gameWindow;
    private final int WIN_WIDTH = 350;
    private final int WIN_HEIGHT = 250;
    private int posX;
    private int posY;
    private final String MAP_SIZE_PREFIX = "Map size is ";
    private final String WIN_LEN_PREFIX = "Win length is ";
    private final int MIN_MAP_SIZE = 3;
    private final int MAX_MAP_SIZE = 10;
    private final int MIN_WIN_LEN = 3;
    private JRadioButton pve;
    private JRadioButton pvp;
    private JSlider sliderMapSize;
    private JSlider sliderWinLen;
    private JButton saveSettings;

    Settings(GameWindow gameWindow){
        this.gameWindow = gameWindow;
        setupWindow(gameWindow);
        addGameMode();
        addFields();
        addButton();
    }

    private void setupWindow(GameWindow gameWindow){
        Rectangle gameWindowBounds = gameWindow.getBounds();
        posX = (int) (gameWindowBounds.getCenterX() - WIN_WIDTH / 2);
        posY = (int) (gameWindowBounds.getCenterY() - WIN_HEIGHT / 2);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(posX, posY);
        setTitle("Settings");
        setResizable(false);
        setLayout(new GridLayout(10, 1));
    }

    private void addGameMode(){
        add(new JLabel("Choose game mode"));
        pve = new JRadioButton("PVE", true);
        pvp = new JRadioButton("PVP");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pve);
        buttonGroup.add(pvp);
        add(pve);
        add(pvp);
    }

    private void addFields(){
        JLabel lbMapSize = new JLabel(MAP_SIZE_PREFIX + MIN_MAP_SIZE);
        JLabel lbWinLen = new JLabel(WIN_LEN_PREFIX + MIN_WIN_LEN);
        sliderMapSize = new JSlider(MIN_MAP_SIZE, MAX_MAP_SIZE, MIN_MAP_SIZE);
        sliderMapSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = sliderMapSize.getValue();
                lbMapSize.setText(MAP_SIZE_PREFIX + currentValue);
                sliderWinLen.setMaximum(currentValue);
            }
        });
        sliderWinLen = new JSlider(MIN_WIN_LEN, MIN_MAP_SIZE, MIN_MAP_SIZE);
        sliderWinLen.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbWinLen.setText(WIN_LEN_PREFIX + sliderWinLen.getValue());
            }
        });
        add(new Label("Choose map size"));
        add(lbMapSize);
        add(sliderMapSize);
        add(new Label("Choose win length"));
        add(lbWinLen);
        add(sliderWinLen);
    }

    private void addButton(){
        saveSettings = new JButton("Save & Start Game");
        saveSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collectAllSettings();
            }
        });
        add(saveSettings);
    }

    private void collectAllSettings(){
        int gameMode;
        int mapSize;
        int winLen;
        if(pve.isSelected()){
            gameMode = GameMap.GM_PVE;
        }else if (pvp.isSelected()){
            gameMode = GameMap.GM_PVP;
        }else {
            throw new RuntimeException("Incorrect game mode");
        }
        mapSize = sliderMapSize.getValue();
        winLen = sliderWinLen.getValue();
        gameWindow.startGameWithUserSettings(gameMode, mapSize, mapSize, winLen);
        setVisible(false);
    }
}
