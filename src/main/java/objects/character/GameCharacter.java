package objects.character;

import objects.skill.DamageSkill;
import objects.skill.Skill;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class GameCharacter {
    protected int level;
    protected int hp;
    protected int armor;
    protected int physicalDmg;
    protected int initiative;
    protected String sprite;

    public  String getSprite() {
        return sprite;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public Skill[] skills;

    public GameCharacter(int level, Skill[] skills) {
        this.level = level;
        this.skills= skills;
    }

    public int getHp() {
        return hp;
    }

    public int getArmor() {
        return armor;
    }

    public int getPhysicalDmg() {
        return physicalDmg;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

    public Skill getSkill(int i) {
        return skills[i];
    }

    public void attack(GameCharacter target, int skillSelected) {
        target.takeDamage(((DamageSkill)skills[skillSelected]).attack(this));
    }

    public void takeDamage(int damage) {
        if (damage<armor)
            hp -= 1;
        else
            this.hp -= (damage-armor);
    }
}
