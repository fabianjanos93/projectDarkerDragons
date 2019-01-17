package objects.main.gui;

import objects.Dungeon;
import objects.character.GameCharacter;
import objects.character.enemy.Rat;
import objects.character.playableCharacter.Knight;
import objects.event.Fight;
import objects.location.room.FightRoom.FightRoom;
import objects.skill.playableCharacterSkill.Strike;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static objects.main.gui.Gamewindow.dungeon;

public class DungeonLabel extends JLabel {

    Dungeon currentAdventure;
    Fight ratFight;
    GameCharacter spelltarget;


    public DungeonLabel(Dungeon advenutre, Fight ratFight){
        init(advenutre, ratFight);
    }




    public void init(Dungeon adventure, Fight ratFight){

        this.currentAdventure = adventure;

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
        midLabel.setLayout(new GridLayout(1,2));
        midLabel.add(heroSide);
        midLabel.add(monsterSide);

       for (GameCharacter hero : currentAdventure.getParty()){
           JLabel character = new HeroLabel();
           heroSide.add(character);
           if (hero != null) {
               character.setIcon(new ImageIcon(this.getClass().getResource(Knight.getSpirte())));
               spelltarget = hero;
           }
       }
        add(midLabel,cns);

        for (GameCharacter rat : ((FightRoom)currentAdventure.getActualRoom()).getEnemyParty()) {
            JLabel character = new HeroLabel();
            monsterSide.add(character);
            if (rat != null) {
                character.setIcon(new ImageIcon(this.getClass().getResource(rat.getSprite())));
                character.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                         spelltarget = rat;
                    }
                });
            }
        }
        add(midLabel,cns);



        JLabel botLabel = new JLabel();
        JButton skill1 = new JButton();
        skill1.setPreferredSize(new Dimension(50,50));
        skill1.setIcon(new ImageIcon(this.getClass().getResource(Strike.strike)));
        JButton skill2 = new JButton();
        skill2.setPreferredSize(new Dimension(50,50));
        JButton skill3 = new JButton();
        skill3.setPreferredSize(new Dimension(50,50));
        JButton skill4 = new JButton();
        skill4.setPreferredSize(new Dimension(50,50));

        cns.gridx=0;
        cns.gridy=2;
        cns.weighty=2;
        cns.weightx=2;
        cns.gridwidth=1;
        cns.insets = new Insets(0,0,0,0);
        cns.fill = GridBagConstraints.BOTH;
        botLabel.setBackground(Color.RED);
        botLabel.setLayout(new GridBagLayout());
        GridBagConstraints bcns = new GridBagConstraints();
        bcns.gridx=0;
        bcns.gridy=0;
        bcns.weighty=1;
        bcns.weightx=1;
        bcns.insets= new Insets(15,15,15,15);
        botLabel.add(skill1, bcns);
        bcns.gridx=1;
        bcns.gridy=0;
        botLabel.add(skill2,bcns);
        bcns.gridx=2;
        bcns.gridy=0;
        botLabel.add(skill3,bcns);
        bcns.gridx=3;
        bcns.gridy=0;
        botLabel.add(skill4, bcns);
        add(botLabel,cns);

        JLabel statLabel = new JLabel();
        cns.gridx=1;
        cns.gridy=2;
        cns.weighty=2;
        cns.weightx=1;
        cns.fill = GridBagConstraints.BOTH;
        statLabel.setBackground(Color.YELLOW);
        add(statLabel,cns);

        System.out.println(ratFight.getActiveCharacter());

        skill1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ratFight.nextTurn(1,spelltarget);
                System.out.println(spelltarget.getHp());
                System.out.println(ratFight.getActiveCharacter());

            }


            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

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
