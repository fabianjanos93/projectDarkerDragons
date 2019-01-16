package objects.character;

import objects.skill.DamageSkill;
import objects.skill.Skill;

import java.util.ArrayList;

public abstract class Character {
    int level;
    int hp;
    int armor;
    int physicalDmg;
    ArrayList<Skill> skills;

    public Character(int level, ArrayList<Skill> skills) {
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

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public void attack(Character target, int skillSelected) {
        target.takeDamage(((DamageSkill)skills.get(skillSelected)).attack(this));
    }

    public void takeDamage(int damage) {
        if (damage<armor)
            hp -= 1;
        else
            this.hp -= (damage-armor);
    }
}
