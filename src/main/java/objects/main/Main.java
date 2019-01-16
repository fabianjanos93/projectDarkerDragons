package objects.main;

import objects.main.gui.Mainwindow;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("jej");

        EventQueue.invokeLater(()->{
            Mainwindow mainScreen = new Mainwindow();
            mainScreen.setVisible(true);
        });

    }
}
