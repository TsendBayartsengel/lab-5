public class Main {
    public static void main(String[] args) {
        Herbivore elephant = new Herbivore("Coco", "Elephant", "Uuuuunnn");
        Predator lion = new Predator("Milo", "Lion", "Arrrr");
        Predator wolf = new Predator("Duke", "Wolf", "how how");

        System.out.println(elephant.getAnimalName() + ": " + "Class " + elephant.getAnimalClass() + " ,Type " + elephant.getAnimalType());
        System.out.println(lion.getAnimalName() + ": " + "Class " + lion.getAnimalClass() + " ,Type " + lion.getAnimalType());
        System.out.println(wolf.getAnimalName() + ": " + "Class " + wolf.getAnimalClass() + " ,Type " + wolf.getAnimalType());
        System.out.println("----------------------");

        Zoo zoo = new Zoo(1);
        try {
            zoo.addAnimal(wolf, 0);
            zoo.addAnimal(wolf, 0);
            zoo.addAnimal(wolf, 0);
            zoo.addCages(2);
            zoo.addAnimal(elephant, 1);
            zoo.addAnimal(elephant, 1);
            zoo.addAnimal(lion, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        zoo.walkThroughZoo();
        System.out.println(zoo.getUniqueAnimalClasses());
        System.out.println(zoo.countAnimalTypes());
        System.out.println(zoo.getAnimalsByCount());
    }
}
