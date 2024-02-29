import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Animal some_animal = new Animal("Barsik", 3);
        some_animal.grow();
        some_animal.move("East");
        some_animal.make_sound();
        some_animal.findFood();
        some_animal.eatPlant();

        Plant tree = new Plant("Tree", 5);
        tree.grow();
        tree.photosynthesize();

        some_animal.interact(tree);

        OrganismBehavior some_Organism = new Organism("Person", 2);
        some_Organism.move("South");

    }

}
interface OrganismBehavior {
    void grow();
    void reproduce(Organism partner);
    void move(String direction);
    void interact(Organism target);
}

class Plant extends Organism{
    public Plant(String organismType, int age) {
        super(organismType, age);
    }

    public void photosynthesize() {

        System.out.println("Plant is undergoing photosynthesis.");
    }

}
