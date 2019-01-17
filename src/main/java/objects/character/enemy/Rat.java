package objects.character.enemy;

import objects.character.GameCharacter;
import objects.skill.Skill;

import javax.swing.*;
import java.util.ArrayList;

public class Rat extends GameCharacter {
    private final static String sprite = "/Testimage/rat.png";

    public Rat(int level, Skill[] skills) {
        super(level, skills);
        this.hp = 6 + level;
        this.armor = 1 + level/2;
        this.physicalDmg = 2 + level;
        sprite.getClass().getResource(sprite);
    }

    private static ArrayList<Skill> possibleSkills = new ArrayList<Skill>();

    public static String getSprite() {
        return sprite;
    }
    public static void fillSkills(ArrayList<Skill> skills){
        possibleSkills.addAll(skills);
    }
}
