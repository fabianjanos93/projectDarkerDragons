package objects.character.enemy;

import objects.character.GameCharacter;
import objects.skill.Skill;

import java.util.ArrayList;

public class Rat extends GameCharacter {

    public Rat(int level, Skill[] skills) {
        super(level, skills);
        this.hp = 6 + level;
        this.armor = 1 + level/2;
        this.physicalDmg = 2 + level;
    }

    private static ArrayList<Skill> possibleSkills = new ArrayList<Skill>();
    public static void fillSkills(ArrayList<Skill> skills){
        possibleSkills.addAll(skills);
    }
}
