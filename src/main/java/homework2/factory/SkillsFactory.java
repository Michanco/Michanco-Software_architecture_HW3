package homework2.factory;

public class SkillsFactory {

    public Skills createSkills (int skillNum){
        switch (skillNum){
            case 1: return new Kindness();
            //break;
            case 2: return new Strength();
            //break;
            case 3: return new Intellect();
            //break;
            default:
                throw new IllegalArgumentException("Incorrect number");
        }
    }
}
