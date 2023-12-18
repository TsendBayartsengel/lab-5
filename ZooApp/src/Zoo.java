import java.util.Set;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


class Zoo {
    private Cage[] cages;

    public Zoo(int initialCageCount) {
        cages = new Cage[initialCageCount];
        for (int i = 0; i < initialCageCount; i++) {
            cages[i] = new Cage();
        }
    }

    public void addCages(int additionalCageCount) {
        Cage[] newCages = new Cage[cages.length + additionalCageCount];
        System.arraycopy(cages, 0, newCages, 0, cages.length);

        for (int i = cages.length; i < newCages.length; i++) {
            newCages[i] = new Cage();
        }

        cages = newCages;
    }

    public void addAnimal(Animal animal, int cageIndex) throws Exception {
        cages[cageIndex].add(animal);
    }

    public String walkThroughZoo() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cages.length; i++) {
            List<Animal> animals = cages[i].getAnimals();
            if (!animals.isEmpty()) {
                System.out.print("Cage " + (i + 1) + ": ");
                for (Animal animal : animals) {
                    System.out.print(animal.getAnimalSound() + " ");
                }
                System.out.println();
            } else {
                System.out.println("Cage " + (i + 1) + ": empty.");
            }
        }
            return result.toString();

    }
    public Set<String> getUniqueAnimalClasses() {
        Set<String> uniqueAnimalClasses = new HashSet<>();
        for (Cage cage : cages) {
            List<Animal> animals = cage.getAnimals();
            for (Animal animal : animals) {
                uniqueAnimalClasses.add(animal.getAnimalClass());
            }
        }
        return uniqueAnimalClasses;
    }
        public Map<String, Integer> countAnimalTypes() {
        Map<String, Integer> animalTypeCounts = new HashMap<>();
        for (Cage cage : cages) {
            List<Animal> animals = cage.getAnimals();
            for (Animal animal : animals) {
                String animalType = animal.getAnimalType();
                animalTypeCounts.put(animalType, animalTypeCounts.getOrDefault(animalType, 0) + 1);
            }
        }
        return animalTypeCounts;
    }
           public List<Animal> getAnimalsByCount() {
        List<Animal> allAnimals = getAllAnimals();
        allAnimals.sort(Comparator.comparingInt(animal -> Collections.frequency(allAnimals, animal)).reversed());
        return allAnimals;
    }

    private List<Animal> getAllAnimals() {
        List<Animal> allAnimals = new ArrayList<>();
        for (Cage cage : cages) {
            allAnimals.addAll(cage.getAnimals());
        }
        return allAnimals;
    }
    public void displayUniqueAnimalTypes() {
        Set<String> uniqueAnimalTypes = new HashSet<>();
        for (Cage cage : cages) {
            List<Animal> animals = cage.getAnimals();
            for (Animal animal : animals) {
                uniqueAnimalTypes.add(animal.getAnimalType());
            }
        }
        System.out.println("\n--- Unique Animal Types ---");
        System.out.println(uniqueAnimalTypes);
    }

    public void displayPredatorAndHerbivoreCount() {
        int predatorCount = 0;
        int herbivoreCount = 0;

        for (Cage cage : cages) {
            List<Animal> animals = cage.getAnimals();
            for (Animal animal : animals) {
                if ("Predator".equals(animal.getAnimalType())) {
                    predatorCount++;
                } else if ("Herbivore".equals(animal.getAnimalType())) {
                    herbivoreCount++;
                }
            }
        }

        System.out.println("\nPredator Count: " + predatorCount);
        System.out.println("Herbivore Count: " + herbivoreCount);
    }

    public void displayUniqueAnimalsDescendingOrder() {
        List<Animal> uniqueAnimals = new ArrayList<>();
        Set<String> uniqueAnimalNames = new HashSet<>(); 

        for (Cage cage : cages) {
            List<Animal> animals = cage.getAnimals();
            for (Animal animal : animals) {
                if (!uniqueAnimalNames.contains(animal.getAnimalName())) { 
                    uniqueAnimals.add(animal);
                    uniqueAnimalNames.add(animal.getAnimalName());
                }
            }
        }

        uniqueAnimals.sort(Comparator.comparing(Animal::getAnimalName).reversed());

        System.out.println("\n--- Unique Animals in Descending Order ---");
        for (Animal animal : uniqueAnimals) {
            System.out.println(animal);
        }
    }
    public Cage[] getCages() {
        return cages;
}


}