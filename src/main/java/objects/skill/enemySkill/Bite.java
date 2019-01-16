package objects.skill.enemySkill;

import objects.character.Character;
import objects.skill.DamageSkill;
import objects.skill.Skill;

public class Bite extends Skill implements DamageSkill {

    public int attack(Character attacker) {
        return attacker.getPhysicalDmg() + 1;
    }
}
