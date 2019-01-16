package objects.character.enemy;

import objects.character.Character;
import objects.skill.Skill;

import java.util.ArrayList;

public class Rat extends Character {

    public Rat(int level, ArrayList<Skill> skills) {
        super(level, skills);
    }

    private static ArrayList<Skill> possibleSkills = new ArrayList<Skill>();
    public static void fillSkills(ArrayList<Skill> skills){
        possibleSkills.addAll(skills);
    }
}
