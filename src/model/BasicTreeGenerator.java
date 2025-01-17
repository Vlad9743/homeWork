package model;

import java.time.LocalDate;

public class BasicTreeGenerator implements Fillable{

    @Override
    public void fillTree(FamilyTree<Human> familyTree) {
        Human human1 = new Human("O-647", LocalDate.of(2078,4,12), Gender.MALE);
        Human human2 = new Human("I-693", LocalDate.of(2079,6,17), Gender.FEMALE);
        Human human3 = new Human("K-953", LocalDate.of(2101,1,4), Gender.MALE, human1, human2);
        Human human4 = new Human("P-328", LocalDate.of(2101,1,4), Gender.FEMALE, human1, human2);
        Human human5 = new Human("L-493", LocalDate.of(2104,7,19), Gender.MALE, human1, human2);
        Human human6 = new Human("M-727", LocalDate.of(2134,11,6), Gender.FEMALE, human4, human5);
        Human human7 = new Human("U-952", LocalDate.of(2134,2,17), Gender.FEMALE, human4, human5);
        human1.addChild(human3);
        human1.addChild(human4);
        human1.addChild(human5);
        human2.addChild(human3);
        human2.addChild(human4);
        human2.addChild(human5);
        human4.addChild(human6);
        human4.addChild(human7);
        human5.addChild(human6);
        human5.addChild(human7);

        familyTree.addHuman(human1);
        familyTree.addHuman(human2);
        familyTree.addHuman(human3);
        familyTree.addHuman(human4);
        familyTree.addHuman(human5);
        familyTree.addHuman(human6);
        familyTree.addHuman(human7);
    }
}
