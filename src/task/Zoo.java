package task;

import java.util.*;

public class Zoo {

    List<Animal> animals = new ArrayList<>();

    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    void arataAnimale() {
        for (Animal animal : animals) {
            System.out.println(animal);
    //        System.out.println("Tip: " + this.getClass().getSimpleName() + ", Animal: " + animal.getNume() + ", Varsta: " + animal.getVarsta() + ", Gen: " + animal.getGender() + ", Ce consuma? - " + animal.getWhatEats());
        }
    }
}
