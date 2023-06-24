import org.example.Pet;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String gender;
    private int age;
    private String mother;
    private String father;

    private List<Person> siblings = new ArrayList<>();
    private List<Person> children = new ArrayList<>();
    public List<Pet> pets;

    // first constructor //

    public Person(String name, String lastName, int age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        pets = new ArrayList<>();
    }

    // second constructor //
    public Person(String name, String middleName, String lastName, int age, String gender) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // constructors complete //

    // getters & setters //

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMother() {
        return mother;
    }

    public void setMother() {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather() {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblingList) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> childrenList) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    // all methods //

    public void addParents(Person mother, Person father, Person child) {
        child.setMother();
        child.setFather();

    }

    public void addChildToChildrenList(Person parent, Person child) {
        List<Person> children = new ArrayList<>();
        if (parent.getChildren() != null) {
            for (Person person : parent.getChildren()) {
                children.add(person);
            }
        }
        children.add(child);
        parent.setChildren(children);
    }

    public void addPet(Person person, Pet pet) {
        List<Pet> pets = new ArrayList<>(); // storing pets in the person's pet list here //
        if (person.getPets() != null) { // if the condition is true then:
            pets.addAll(person.getPets()); // we add all existing pets to the person pets list through the getPets method //
        }
        pets.add(pet);  // now we add a new pet to the pets list //
        person.setPets(pets); // now the updated pets list is set as the person's list of pets (with existing and new pets) - using the setSiblings method//
    }


    public void addSibling(Person person, Person sibling) {
        List<Person> kin = new ArrayList<>(); // here we store the siblings in the list of each person //
        if (person.getSiblings() != null) { // if the condition is true, the code below will be executed...//
            for (Person persons : person.getSiblings()) { // this iterates over each Person object within the person's existing list of siblings -
                //accessed through the getSiblings() method - the loop variable persons represents each individual sibling in the loop iteration. //
                kin.add(persons); // adding existing siblings to list //
            }
            kin.add(sibling); // adding new sibling to person's siblingslist (here kin) //
            person.setSiblings(kin); // the updated kin list is set as the person's list of siblings using the setSiblings method of the person object //
        }

    }

    public void getGrandChildren(Person person, Person grandChild) {
        List <Person> grandChildren = new ArrayList<>(); // here we store all grandchildren of Person //


    }
}