package objects.character.playableCharacter;

import objects.character.GameCharacter;
import objects.skill.Skill;

import javax.swing.*;
import java.util.ArrayList;

public class Knight extends GameCharacter {
    public static final String knight = "/Testimage/knight.png";


    public Knight(int level, Skill[] skills) {
        super(level, skills);
        this.hp = 10 + 2*level;
        this.armor = 3 + level/3;
        this.physicalDmg = 4 + level;

    }

    private static ArrayList<Skill> possibleSkills = new ArrayList<Skill>();
    public static void fillSkills(ArrayList<Skill> skills){
        possibleSkills.addAll(skills);
    }

    public static String getSpirte() {
        return knight;
    }
}

