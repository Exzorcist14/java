package ru.mirea.lab4;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();

        System.out.println(human + "\n");

        human.setWeight(68);
        human.setHeight(179);

        human.getHead().setExpressedEmotion("happy");
        human.getLeftLeg().setState("bent");
        human.getLeftHand().setIsLeading(true);
        human.checkAndSetAmbidexter();
        human.getRightHand().setState("clenched into a fist");
        human.getRightLeg().setShoeSize(45);
        human.getHead().setHairColor("light brown");
        human.getLeftHand().setFingers(4);
        human.getHead().setVisualAcuity(2);

        System.out.println(human + "\n");

        System.out.println(human.getHead());
    }
}
