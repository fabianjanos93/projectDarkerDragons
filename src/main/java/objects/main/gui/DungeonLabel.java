package objects.main.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static objects.main.gui.Gamewindow.dungeon;

public class DungeonLabel extends JLabel {

    public DungeonLabel(){
        init();
    }


    public void init(){
        JPanel skillPanel1 = new JPanel();
        JPanel skillPanel2  = new JPanel();
        JPanel skillPanel = new JPanel();
        JButton dungeonButton = new JButton("Strike");
        dungeonButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Harrr!");
            }
        });

        skillPanel1.setVisible(false);
        skillPanel2.setVisible(false);
        skillPanel.setLayout(new GridLayout(0,8));
        skillPanel.add(dungeonButton);
        skillPanel.setBackground(Color.BLACK);
        skillPanel.setBorder(BorderFactory.createMatteBorder(1,5,1,1,Color.YELLOW));


        setBounds(0,0, 800,600);
        setIcon(new ImageIcon(this.getClass().getResource(dungeon)));
        setLayout(new GridLayout(3,0));
        add(skillPanel1);
        add(skillPanel2);
        add(skillPanel);
        setVisible(true);
    }
}
