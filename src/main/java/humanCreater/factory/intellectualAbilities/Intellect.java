package humanCreater.factory.intellectualAbilities;

import humanCreater.factory.Skills;

public class Intellect extends Skills implements IntellectualAbilities{
    @Override
    public String text() {
        return " Intelligent";
    }

    @Override
    public void IntellectMethod() {
        System.out.println("education");
    }
}
