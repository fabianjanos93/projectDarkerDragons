package objects.character.playableCharacter;

import objects.character.Character;
import objects.skill.Skill;
import objects.skill.enemySkill.Bite;
import objects.skill.playableCharacterSkill.Strike;

import java.util.ArrayList;
import java.util.Collection;

public class Knight extends Character {
    public Knight(int level, ArrayList<Skill> skills) {
        super(level, skills);
    }

    private static ArrayList<Skill> possibleSkills = new ArrayList<Skill>();
    public static void fillSkills(ArrayList<Skill> skills){
        possibleSkills.addAll(skills);
    }
}

