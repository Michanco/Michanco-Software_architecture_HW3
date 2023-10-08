package humanCreater.factory.physicalAbilities;

import humanCreater.factory.Skills;

public class Strength extends Skills implements PhysicalAbilities{
    @Override
    public String text() {
        return " Strong";
    }

    @Override
    public void PhysicMethod() {
        System.out.println("lifting weights");
    }
}
