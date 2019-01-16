package objects.event;

import objects.character.GameCharacter;
import objects.skill.DamageSkill;
import objects.skill.Skill;

import java.util.ArrayList;
import java.util.Random;

public class Fight {
    private GameCharacter[] playerParty;
    private GameCharacter[] enemyParty;

    private ArrayList<GameCharacter> turnSequence = new ArrayList<>();
    private int activeCharacterPointer = 1;
    private int turn = 1;

    public Fight(GameCharacter[] playerParty, GameCharacter[] enemyParty) {
        this.playerParty = playerParty;
        this.enemyParty = enemyParty;
        rollInitiative(playerParty);
        rollInitiative(enemyParty);
    }

    public GameCharacter nextTurn(int skillSlot, GameCharacter target){
        GameCharacter activeCharacter = (turnSequence.get(activeCharacterPointer));
        Skill chosenSkill = activeCharacter.getSkill(skillSlot);
        if (chosenSkill instanceof DamageSkill) {
            target.takeDamage(((DamageSkill) chosenSkill).attack(activeCharacter));
        }
        if (activeCharacterPointer<turnSequence.size())
            activeCharacterPointer = 0;
        else
            activeCharacterPointer++;
        return turnSequence.get(activeCharacterPointer);
    }

    private void rollInitiative(GameCharacter[] party){
        for(int i = 0; i < 4; i++) {
            if(party[i] != null) {
                Random rand = new Random();
                party[i].setInitiative(rand.nextInt(20));
            }
            int j = 0;
            while(j < turnSequence.size()) {
                if(party[i].getInitiative() > party[j].getInitiative()) {
                    turnSequence.add(j,party[i]);
                    break;
                }
                j++;
            }
            if (j == turnSequence.size())
                turnSequence.add(party[i]);
        }
    }

    private int partySize(GameCharacter[] party) {
        int alive = 0;
        for (int i = 0; i < 4; i++) {
            if( party[i] != null)
                alive++;
        }
        return alive;
    }

    public boolean isFightEnded() {
        return partySize(playerParty) == 0 || partySize(enemyParty) == 0;
    }
}
