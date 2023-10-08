package humanCreater.factory;

import humanCreater.factory.physicalAbilities.Dexterity;
import humanCreater.factory.physicalAbilities.Strength;
import humanCreater.factory.intellectualAbilities.Intellect;
import humanCreater.factory.intellectualAbilities.Kindness;

public class SkillsFactory {

    public Skills createSkills (int skillNum){
        switch (skillNum){
            case 1: return new Kindness();
            //break;
            case 2: return new Intellect();
            //break;
            case 3: return new Strength();
            case 4: return new Dexterity();
            //break;
            default:
                throw new IllegalArgumentException("Incorrect number");
        }
    }
}
