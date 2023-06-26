package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String gender;
    private int age;
    Person mother;
    Person father;

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

    public void setGender(String male) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return this.siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }


    public List<Person> getChildren() {
        return this.children;
    }

    public void setChildren(List<Person> children) {
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
        child.setMother(mother);
        child.setFather(father);

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
            for (Person persons : person.getSiblings()) { // this iterates over each org.example.Person object within the person's existing list of siblings -
                //accessed through the getSiblings() method - the loop variable persons represents each individual sibling in the loop iteration. //
                kin.add(persons); // adding existing siblings to list //
            }
            kin.add(sibling); // adding new sibling to person's siblingslist (here kin) //
            person.setSiblings(kin); // the updated kin list is set as the person's list of siblings using the setSiblings method of the person object //
        }

    }

    public List<Person> getGrandChildren(Person person) {
        List<Person> grandChildren = new ArrayList<>(); // here we store all grandchildren of org.example.Person //
        if (person.getChildren() != null) { // if person does have children, then ...//
            for (Person children : person.getChildren()) { // loop through org.example.Person's existing list of children //
                if (children.getChildren() != null) {  // if children have children
                    for (Person grandChild : children.getChildren()) { //iterates over each org.example.Person object in the list of children for the current child - accessed through the getChildren method //
                        grandChildren.add(grandChild); // adding all grandChildren to the list of grandChildren;
                    }
                }
            }
        }
        return grandChildren; // returning the list of grandChildren //
    }
}