public class Animal extends Organism{
    public Animal(String organismType, int age) {
        super(organismType, age);
    }
    public void make_sound(){
        System.out.println("Animal makes sound");
    }
    public void findFood() {
        System.out.println("Animal is searching for food.");
    }
    public void eatPlant() {
        System.out.println("Animal is eating the plant.");
    }
}
