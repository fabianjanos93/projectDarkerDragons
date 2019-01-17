package objects.main.gui;

import objects.Dungeon;
import objects.character.GameCharacter;
import objects.character.playableCharacter.Knight;
import objects.event.Fight;
import objects.skill.Skill;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gamewindow extends JFrame{

    public static final String city = "/Testimage/hamlet.jpg";
    public static final String dungeon = "/Testimage/dungeon.jpg";
    public static final String dIcon = "/Testimage/dicon.png";

    private JFrame window;
    private JPanel mainPanel, skillPanel;
    private JLabel titleNameLabel, cityLabel, iconLabel, skillLabel;
    private JButton dungeonButton;
    private ImageIcon cityIcon = new ImageIcon(this.getClass().getResource(city));
    //public ImageIcon dungeonIcon = );
    public ImageIcon goIcon = new ImageIcon(this.getClass().getResource(dIcon));


    public Gamewindow(){
        init();
    }


    private void init(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(new FlowLayout());
        window.setVisible(true);
        window.setResizable(false);


        cityLabel = new JLabel();
        cityLabel.setBounds(0,0, 800,600);
        cityLabel.setIcon(cityIcon);
        getXY();

        iconLabel = new JLabel();
        iconLabel.setBounds(0,0,100,100);
        iconLabel.setIcon(goIcon);

        iconLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Skill[] knightSkills = new Skill[4];
                knightSkills[1] = Skill.getSkillByName("Strike");
                GameCharacter[] party = new GameCharacter[4];
                Knight hero = new Knight(1,knightSkills);
                party[1] = hero;
                Dungeon adventure = new Dungeon(party);
                Fight ratFight = adventure.startFight();
                JLabel dungeonLabel = new DungeonLabel(adventure, ratFight);
                window.remove(cityLabel);
                window.add(dungeonLabel);
                dungeonLabel.setVisible(true);
                window.revalidate();
                window.repaint();
            }
        });



        window.add(cityLabel);
        cityLabel.add(iconLabel);
        window.setVisible(true);


    }

    private void getXY() {
        cityLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX()+"x"+ e.getY()+"y");
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
    }
}
