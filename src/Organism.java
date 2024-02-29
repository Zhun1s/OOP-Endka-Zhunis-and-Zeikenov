public class Organism implements OrganismBehavior {
    private String organismType;
    private int age;
    public Organism(String organismType, int age) {
        this.organismType = organismType;
        this.age = age;
    }
    public String getOrganismType() {
        return organismType;
    }
    public int getAge() {
        return age;
    }
    public void setOrganismType(String organismType) {
        this.organismType = organismType;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void grow() {
        System.out.println(organismType+" is growing.");
    }
    public void reproduce(Organism partner) {
        System.out.println(organismType+" is reproducing with another organism.");
    }
    public void move(String direction) {
        System.out.println(organismType+" is moving in the " + direction + " direction.");
    }
    public void interact(Organism target) {
        if (target instanceof Animal) {
            System.out.println(organismType + " is interacting with an animal.");
        } else if (target instanceof Plant) {
            System.out.println(organismType + " is interacting with a plant.");
        } else {
            System.out.println(organismType + " is interacting with another organism.");
        }
    }

}
