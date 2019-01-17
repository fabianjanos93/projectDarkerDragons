package objects.main.gui;

import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;


public class HeroLabel extends JLabel {
    private String i;


    public HeroLabel(){
        init();
    }

    public void init(){
        setBorder(BorderFactory.createLineBorder(Color.GRAY,5));
        setBackground(Color.YELLOW);

    }
}
