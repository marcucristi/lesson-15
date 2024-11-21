package task;

public class Main {

    public static void main(String[] args) {
        
 
        Zoo zoo = new Zoo();

        Elefant elefant = new Elefant("Jumbo", 12, "Masculin", "Ierbivor");
        Lup lup = new Lup("Andrei", 17, "Masculin", "Vegetarian");
        Leu leu = new Leu("Petru", 23, "Se identifica ca pisica", "Soarece la grill");
        Jaguar jaguar = new Jaguar("Masina", 2018, "Nu e vie", "Combustibil");
        Zebra zebra = new Zebra("Trecere pentru pietoni", 9999999, "Nu are gen", "Vopsea");

        zoo.addAnimal(elefant);
        zoo.addAnimal(lup);
        zoo.addAnimal(leu);
        zoo.addAnimal(jaguar);
        zoo.addAnimal(zebra);

        zoo.arataAnimale();
    }
}    