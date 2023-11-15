package ru.mirea.lab4;

public class Human {
    class Hand {
        private boolean isLeading;
        private boolean isLeft;
        private boolean isRight;
        private int fingers;
        private String gloveSize;
        private String state;

        public Hand(boolean isLeading, String nameHand, int fingers, String gloveSize, String state) {
            this.isLeading = isLeading;

            if (nameHand == "left") {
                this.isLeft = true;
                this.isRight = false;
            }

            else {
                this.isLeft = false;
                this.isRight = true;
            }

            this.fingers = fingers;
            this.gloveSize = gloveSize;
            this.state = state;
        }

        public Hand(String nameHand) {
            if (nameHand == "left") {
                this.isLeft = true;
                this.isRight = false;
                isLeading = false;
            }

            else {
                this.isLeft = false;
                this.isRight = true;
                isLeading = true;
            }

            this.fingers = 5;
            this.gloveSize = "L";
            this.state = "uncompressed";
        }

        public boolean isLeading() {
            return isLeading;
        }

        public void setIsLeading(boolean leading) {
            isLeading = leading;
        }

        public boolean isLeft() {
            return isLeft;
        }

        public void setLeft(boolean left) {
            isLeft = left;
            isRight = !isLeft;
        }

        public boolean isRight() {
            return isRight;
        }

        public void setRight(boolean right) {
            isRight = right;
            isLeft = !isRight;
        }

        public int getFingers() {
            return fingers;
        }

        public void setFingers(int fingers) {
            this.fingers = fingers;
        }

        public String getGloveSize() {
            return gloveSize;
        }

        public void setGloveSize(String gloveSize) {
            this.gloveSize = gloveSize;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return("hand: isLeading = " + isLeading + ", isLeft = " + isLeft + ", isRight = " + isRight + ", fingers = " + fingers + ", gloveSize = " + gloveSize + ", state = " + state + "\n") ;
        }
    }

    class Head {
        private String hairType;
        private String hairColor;
        private String eyeColor;
        private String expressedEmotion;
        private float visualAcuity;

        public Head(String hairType, String hairColor, String eyeColor, String expressedEmotion, float visualAcuity) {
            this.hairType = hairType;
            this.eyeColor = eyeColor;
            this.expressedEmotion = expressedEmotion;
            this.visualAcuity = visualAcuity;

            if (hairType == "bald") {
                this.hairColor = "No hair";
            }

            else {
                this.hairColor = hairColor;
            }

        }

        public Head() {
            this.hairType = "straight";
            this.hairColor = "black";
            this.eyeColor = "brown";
            this.expressedEmotion = "neutral";
            this.visualAcuity = 1;
        }

        public String getHairType() {
            return hairType;
        }

        public void setHairType(String hairType) {
            this.hairType = hairType;
        }

        public String getHairColor() {
            return hairColor;
        }

        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }

        public String getEyeColor() {
            return eyeColor;
        }

        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }

        public String getExpressedEmotion() {
            return expressedEmotion;
        }

        public void setExpressedEmotion(String emotion) {
            this.expressedEmotion = emotion;
        }

        public float getVisualAcuity() {
            return visualAcuity;
        }

        public void setVisualAcuity(float visualAcuity) {
            this.visualAcuity = visualAcuity;
        }

        @Override
        public String toString() {
            return("head: hairType = " + hairType + ", hairColor = " + hairColor + ", eyeColor = " + eyeColor + ", expressedEmotion = " + expressedEmotion + ", visualAcuity = " + visualAcuity + "\n");
        }
    }

    class Leg {
        private boolean isLeading;
        private boolean isLeft;
        private boolean isRight;
        private int fingers;
        private double shoeSize;
        private String state;

        public Leg(boolean isLeading, String nameHand, int fingers, double shoeSize, String state) {
            this.isLeading = isLeading;

            if (nameHand == "left") {
                this.isLeft = true;
                this.isRight = false;
            }

            else {
                this.isLeft = false;
                this.isRight = true;
            }

            this.fingers = fingers;
            this.shoeSize = shoeSize;
            this.state = state;
        }

        public Leg(String nameHand) {
            if (nameHand == "left") {
                this.isLeft = true;
                this.isRight = false;
                isLeading = false;
            }

            else {
                this.isLeft = false;
                this.isRight = true;
                isLeading = true;
            }

            this.fingers = 5;
            this.shoeSize = 43.5;
            this.state = "unbent";
        }

        public boolean isLeading() {
            return isLeading;
        }

        public void setIsLeading(boolean leading) {
            isLeading = leading;
        }

        public boolean isLeft() {
            return isLeft;
        }

        public void setLeft(boolean left) {
            isLeft = left;
            isRight = !isLeft;
        }

        public boolean isRight() {
            return isRight;
        }

        public void setRight(boolean right) {
            isRight = right;
            isLeft = !isRight;
        }

        public int getFingers() {
            return fingers;
        }

        public void setFingers(int fingers) {
            this.fingers = fingers;
        }

        public double getShoeSize() {
            return shoeSize;
        }

        public void setShoeSize(float shoeSize) {
            this.shoeSize = shoeSize;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return("leg: isLeading = " + isLeading + ", isLeft = " + isLeft + ", isRight = " + isRight + ", fingers = " + fingers + ", shoeSize = " + shoeSize + ", state = " + state + "\n") ;
        }
    }

    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;

    private int age;
    private int height;
    private int weight;
    private double bodyMassIndex;
    private boolean isAmbidexter;
    private boolean isBipeds;

    public Human(Head head, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg, int age, int height, int weight) {
        this.head = head;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.age = age;
        this.height = height;
        this.weight = weight;

        checkAndSetAmbidexter();
        checkAndSetBipeds();
        this.bodyMassIndex = calculateBodyMassIndex(weight, height);
    }

    public Human() {
        this.head = new Head();
        this.leftHand = new Hand("left");
        this.rightHand = new Hand("right");
        this.leftLeg = new Leg("left");
        this.rightLeg = new Leg("right");

        this.age = 18;
        this.height = 178;
        this.weight = 76;

        checkAndSetAmbidexter();
        checkAndSetBipeds();
        this.bodyMassIndex = calculateBodyMassIndex(weight, height);
    }

    public static double calculateBodyMassIndex(int weight, int height){
        return weight / (height * height / 10000);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        this.bodyMassIndex = calculateBodyMassIndex(weight, height);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        this.bodyMassIndex = calculateBodyMassIndex(weight, height);
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public boolean isAmbidexter() {
        return isAmbidexter;
    }

    public boolean isBipeds() {
        return isBipeds;
    }

    public void checkAndSetAmbidexter() {
        this.isAmbidexter = (leftHand.isLeading() == true) && (rightHand.isLeading() == true);
    }

    public void checkAndSetBipeds() {
        this.isBipeds = (leftLeg.isLeading() == true) && (rightLeg.isLeading() == true);
    }

    @Override
    public String toString() {
        return(head.toString() + leftHand.toString() + rightHand.toString() + leftLeg.toString() + rightLeg.toString()
                + "age = " + age + ", height = " + height + ", weight = " + weight + ", bodyMassIndex = " + bodyMassIndex
                + ", isAmbidexter = " + isAmbidexter + ", isBipeds = " + isBipeds);
    }
}
