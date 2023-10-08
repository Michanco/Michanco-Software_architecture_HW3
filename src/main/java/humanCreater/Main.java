package humanCreater;

import humanCreater.builder.Human;
import humanCreater.builder.HumanBuilder;
import humanCreater.factory.Skills;
import humanCreater.factory.SkillsFactory;

public class Main {
    public static void main(String[] args) {
        SkillsFactory skillsFactory = new SkillsFactory();
        Skills skill1 = skillsFactory.createSkills(1);
        Skills skill2 = skillsFactory.createSkills(3);
        Human human = new HumanBuilder()
                .setSkill1(skill1)
                .setSkill2(skill2)
                .create();
        System.out.println("I new human!!! I'm " + human);

    }
}
