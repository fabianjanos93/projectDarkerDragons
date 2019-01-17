package objects.main.gui;

import objects.character.playableCharacter.Knight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

import static objects.main.gui.Gamewindow.dungeon;

public class DungeonLabel extends JLabel {


    public DungeonLabel(){
        init();
    }




    public void init(){

        setLayout(new GridBagLayout());
        setVisible(true);
        GridBagConstraints cns = new GridBagConstraints();
        JLabel heroSide = new JLabel();
        heroSide.setLayout(new GridLayout(2,2));
        JLabel monsterSide = new JLabel();
        monsterSide.setLayout(new GridLayout(2,2));


        JLabel topLabel = new JLabel();
        cns.gridx=0;
        cns.gridy=0;
        cns.weighty=1;
        cns.weightx=1;
        cns.gridwidth=2;
        cns.fill = GridBagConstraints.BOTH;
        topLabel.setBackground(Color.WHITE);
        topLabel.setOpaque(true);
        topLabel.addMouseListener(new MouseAdapter() {

        });
        add(topLabel,cns);

        JLabel midLabel = new JLabel();
        cns.gridx=0;
        cns.gridy=1;
        cns.weighty=3;
        cns.weightx=10;
        cns.insets = new Insets(3,15,3,15);
        cns.fill = GridBagConstraints.BOTH;
        midLabel.setBackground(Color.BLUE);
        midLabel.setOpaque(true);
        midLabel.setLayout(new GridLayout(1,2));
        midLabel.add(heroSide);
        midLabel.add(monsterSide);

       for (int i =0; i<4; i++){
           JLabel character = new HeroLabel(Integer.toString(i));
           character.setIcon(new ImageIcon(this.getClass().getResource(Knight.getSpirte())));
           heroSide.add(character);
       }
        add(midLabel,cns);

        for (int i =0; i<4; i++){
            JLabel character = new HeroLabel(Integer.toString(i));
            monsterSide.add(character);
        }
        add(midLabel,cns);



        JLabel botLabel = new JLabel();
        cns.gridx=0;
        cns.gridy=2;
        cns.weighty=2;
        cns.weightx=2;
        cns.gridwidth=1;
        cns.insets = new Insets(0,0,0,0);
        cns.fill = GridBagConstraints.BOTH;
        botLabel.setBackground(Color.RED);
        botLabel.setOpaque(true);
        add(botLabel,cns);

        JLabel statLabel = new JLabel();
        cns.gridx=1;
        cns.gridy=2;
        cns.weighty=2;
        cns.weightx=1;
        cns.fill = GridBagConstraints.BOTH;
        statLabel.setOpaque(true);
        statLabel.setBackground(Color.YELLOW);
        add(statLabel,cns);

/*
        JButton dungeonButton = new JButton("Strike");
        dungeonButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Harrr!");
            }
        });
        add(dungeonButton, cns);


        JButton dungeonButton2 = new JButton("Strike1");

        cns.gridx=1;
        cns.gridy = 0;
        cns.weightx = 2;
        cns.weighty = 1;
        cns.fill = GridBagConstraints.BOTH;

        add(dungeonButton2,cns);


*/
        setBounds(0,0, 800,600);
        setIcon(new ImageIcon(this.getClass().getResource(dungeon)));


    }


}
