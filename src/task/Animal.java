package task;

public class Animal {
    private String nume;
    private int varsta;
    private String gender;
    private String whatEats;

    public Animal(String nume, int varsta, String gender, String whatEats) {
        this.nume = nume;
        this.varsta = varsta;
        this.gender = gender;
        this.whatEats = whatEats;
    }

    String getNume() {
        return nume;
    }

    void setNume(String nume) {
        this.nume = nume;
    }

    int getVarsta() {
        return varsta;
    }

    void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    String getGender(){
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    String getWhatEats() {
        return whatEats;
    }

    void setWhatEats(String whatEats) {
        this.whatEats = whatEats;
    }

    public String toString() {
        return "Tip: " + this.getClass().getSimpleName() +
                ", Nume: " + getNume() +
                ", Varsta: " + getVarsta() +
                ", Gen: " + getGender() +
                ", Ce consuma: " + getWhatEats();
    }
}

