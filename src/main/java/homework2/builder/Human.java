package homework2.builder;

import homework2.factory.Skills;

public class Human {
    private Skills skill1;
    private Skills skill2;

    public Human(Skills skill1, Skills skill2) {
        this.skill1 = skill1;
        this.skill2 = skill2;
    }

    @Override
    public String toString() {
        return "I'm " + skill1.text() + " and" + skill2.text() +" !";
    }
}
