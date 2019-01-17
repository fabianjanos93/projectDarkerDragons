package objects.main.gui;

import javax.swing.*;

public class Mainwindow  extends JFrame{
    public Mainwindow(){
        initUI();
    }


    private void initUI(){
        setTitle("Darker Dragons");
        setSize(1024,768);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
