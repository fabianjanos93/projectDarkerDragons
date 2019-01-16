package objects.skill;

import java.util.ArrayList;

public abstract class Skill {
    private static ArrayList<Skill> allSkills = new ArrayList<Skill>();

    public static void fillSkills(ArrayList<Skill> skills){
        allSkills.addAll(skills);
    }

    public static Skill getSkillByName(String skillName) {
        for(int i = 0; i < allSkills.size(); i++)
            if (allSkills.get(i).getClass().getName().equals(skillName)) {
                return allSkills.get(i);
        }
        return null;
    }
}
