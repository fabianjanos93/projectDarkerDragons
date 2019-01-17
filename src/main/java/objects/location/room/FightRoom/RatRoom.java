package objects.location.room.FightRoom;

import objects.character.GameCharacter;
import objects.character.enemy.Rat;
import objects.event.Fight;
import objects.skill.Skill;

import java.util.ArrayList;

public class RatRoom extends FightRoom {

    public RatRoom() {
        GameCharacter[] enemyParty = new GameCharacter[4];
        Skill[] ratSkills = new Skill[4];
        ratSkills[1] = Skill.getSkillByName("Bite");

        enemyParty[1] = new Rat(1, ratSkills);
        enemyParty[2] = new Rat(1, ratSkills);

        this.enemyParty = enemyParty;


    }
}
