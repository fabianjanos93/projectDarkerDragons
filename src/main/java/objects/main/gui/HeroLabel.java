package objects.main.gui;

import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;


public class HeroLabel extends JLabel {
    private String i;


    public HeroLabel(String i){
        this.i = i;
        init(i);
    }

    public void init(String number){
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.BLUE,5));
        setBackground(Color.YELLOW);

    }
}
