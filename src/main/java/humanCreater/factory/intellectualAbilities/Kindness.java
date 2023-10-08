package humanCreater.factory.intellectualAbilities;

import humanCreater.factory.Skills;

public class Kindness extends Skills implements IntellectualAbilities{
    @Override
    public String text() {
        return " Kind";
    }

    @Override
    public void IntellectMethod() {
        System.out.println("help");
    }
}
