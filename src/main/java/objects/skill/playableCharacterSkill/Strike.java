package objects.skill.playableCharacterSkill;

import objects.character.Character;
import objects.skill.DamageSkill;
import objects.skill.Skill;

public class Strike extends Skill implements DamageSkill {

    @Override
    public int attack(Character attacker) {
        return 3 + attacker.getPhysicalDmg() * attacker.getLevel()/2;
    }
}
