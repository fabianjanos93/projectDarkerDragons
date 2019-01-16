package objects.skill.enemySkill;

import objects.character.GameCharacter;
import objects.skill.DamageSkill;
import objects.skill.Skill;

public class Bite extends Skill implements DamageSkill {

    @Override
    public int attack(GameCharacter attacker) {
        return attacker.getPhysicalDmg() + 1;
    }
}
