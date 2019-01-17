package objects.main;

import objects.main.gui.Gamewindow;

import javax.swing.*;
import java.awt.*;

import objects.Dungeon;
import objects.character.GameCharacter;
import objects.character.enemy.Rat;
import objects.character.playableCharacter.Knight;
import objects.skill.Skill;
import objects.skill.enemySkill.Bite;
import objects.skill.playableCharacterSkill.Strike;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        init();
        Skill[] knightSkills = new Skill[4];
        knightSkills[1] = Skill.getSkillByName("Bite");
        GameCharacter[] party = new GameCharacter[4];
        party[1] = new Knight(1,knightSkills);
        Dungeon actualDungeon = new Dungeon(party);


        Gamewindow windowForTheGame = new Gamewindow();
    }

    public static void init(){
        ArrayList<Skill> toFill = new ArrayList<Skill>();
        toFill.add(new Strike());
        toFill.add(new Bite());
        Skill.fillSkills(toFill);

        ArrayList<Skill> ratSkills = new ArrayList<Skill>();
        ratSkills.add(Skill.getSkillByName("Bite"));
        Rat.fillSkills(ratSkills);

        ArrayList<Skill> knightSkills = new ArrayList<Skill>();
        knightSkills.add(Skill.getSkillByName("Strike"));
        Knight.fillSkills(knightSkills);
    }
}
