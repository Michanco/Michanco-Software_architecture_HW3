package humanCreater.factory.physicalAbilities;

import humanCreater.factory.Skills;

public class Dexterity extends Skills implements PhysicalAbilities{
    @Override
    public String text() {
        return " Deft";
    }

    @Override
    public void PhysicMethod() {
        System.out.println("juggling");
    }
}
