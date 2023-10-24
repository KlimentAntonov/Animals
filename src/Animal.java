public class Animal {
    private String name;
    private String colour;
    private String gender;
    private String food;
    private int age;
    private short numberOfLegs;
    private boolean isWild;
    private string picture;
    private boolean isFed;

    Animal() {
        this.name = "";
        this.colour = "";
        this.gender = "";
        this.food = "";
        this.age = 0;
        this.numberOfLegs = 0;
        this.isWild = false;
        this picture = "";
        this.isFed = false
    }

    Animal(String name, String colour, String gender, String food, int age, short numberOfLegs, boolean isWild) {
        this.name = name;
        this.colour = colour;
        this.gender = gender;
        this.food = food;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.isWild = isWild;
        this.picture = picture;
        this.isFed = isFed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public short getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(short numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public string getPicture() {
        return picture;
    }

    public void setPicture(string picture) {
        this.picture = picture;
    }
}
