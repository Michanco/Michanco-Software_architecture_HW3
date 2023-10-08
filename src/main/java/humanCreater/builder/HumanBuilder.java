package humanCreater.builder;

import humanCreater.factory.Skills;

public class HumanBuilder {
    private Skills skill1;
    private Skills skill2;

    public HumanBuilder setSkill1(Skills skill1) {
        this.skill1 = skill1;
        return this;
    }

    public HumanBuilder setSkill2(Skills skill2) {
        this.skill2 = skill2;
        return this;
    }

    public Human create (){
        return new Human(skill1,skill2);
    }
}
