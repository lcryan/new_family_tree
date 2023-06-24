package org.example;

public class Pet {

    final private String name;
    private int age;
    private String species;
    private String owner;

    // constructor including super //
    public Pet(String name, int age, String species) {
        super();
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // GETTERS AND SETTERS //
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

//END GETTERS AND SETTERS //