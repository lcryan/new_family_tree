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

    public void setPetList(List<Pet> pets) {
        this.pets = pets;
    }

    // all methods //

    public void addParents(Person mother, Person father, Person child) {
        child.setMother();
        child.setFather();

    }

    public String addChildToChildrenList(Person child) {
        children.add();

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
