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

    private List<Person> siblingList = new ArrayList<>(); // TODO : import Sibling class later on  - how do ~I get the siblings here ?? //
    private List<Person> childrenList = new ArrayList<>(); // TODO: import Child class later on //
    public List<Pet> petList;

    // first constructor //

    public Person(String name, String lastName, int age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        petList = new ArrayList<>();
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

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public List<Person> getSiblingList() {
        return siblingList;
    }

    public void setSiblingList(List<Person> siblingList) {
        this.siblingList = siblingList;
    }

    public List<Person> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Person> childrenList) {
        this.childrenList = childrenList;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    // all methods //

    public String[] addParents(String mother, String father) {
        String[] parents = new String[2];
        parents[0] = mother;
        parents[1] = father;
        return parents;
    }

    public String addChild(String child) {
        return child;
    }

    public String addPet(String pet) {
        return pet; // not quite sure, if this will work, because this is actually a class //
    }

    public String addSibling(String sibling) {
        return sibling;
    }

    public String getGrandChildren(String grandchild) {
        return grandchild;
    }
}

// methods end //
