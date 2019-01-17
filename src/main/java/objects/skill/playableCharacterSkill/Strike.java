package objects.skill.playableCharacterSkill;

import objects.character.GameCharacter;
import objects.skill.DamageSkill;
import objects.skill.Skill;

public class Strike extends Skill implements DamageSkill {

    @Override
    public int attack(GameCharacter attacker) {
        return 3 + attacker.getPhysicalDmg() * attacker.getLevel()/2;
    }
}
