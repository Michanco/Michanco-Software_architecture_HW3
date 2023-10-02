package homework2;

import homework2.builder.Human;
import homework2.builder.HumanBuilder;
import homework2.factory.Skills;
import homework2.factory.SkillsFactory;

public class Main {
    public static void main(String[] args) {
        SkillsFactory skillsFactory = new SkillsFactory();
        Skills skill1 = skillsFactory.createSkills(1);
        Skills skill2 = skillsFactory.createSkills(2);
        Human human = new HumanBuilder()
                .setSkill1(skill1)
                .setSkill2(skill2)
                .create();
        System.out.println(human);

    }
}
