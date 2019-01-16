package objects.character;

import objects.skill.DamageSkill;
import objects.skill.Skill;

import java.util.ArrayList;

public abstract class GameCharacter {
    private int level;
    private int hp;
    private int armor;
    private int physicalDmg;
    private int initiative;

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public Skill[] skills;

    public GameCharacter(int level, Skill[] skills) {
        this.hp = 10 + 2*level;
        this.armor = 3 + level/3;
        this.physicalDmg = 4 + level;
        this.level = level;
        this.skills = skills;
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
