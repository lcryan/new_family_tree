import org.example.Person;
import org.example.Pet;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void getName() {

        //arrange //
        Person Luisa = new Person("Luisa", "Madrigal", 18, "female");

        //act//
        String name = Luisa.getName();

        //Assert//
        assertEquals("Luisa", name);
    }

    @Test
    public void getMiddelName() {
        //arrange//
        Person Mirabel = new Person("Mirabel", "Conchita", "Madrigal", 16, "female");

        //act//
        String middleName = Mirabel.getMiddleName();

        //assert//
        assertEquals("Conchita", middleName);
    }

    @Test
    public void getLastName() {
        //arrange//
        Person Bruno = new Person("Bruno", "Madrigal", 45, "male");
        //act//
        String lastName = Bruno.getLastName();
        //assert//
        assertEquals("Madrigal", lastName);
    }

    @Test
    public void getGender() {

        Person Miguel = new Person("Miguel", "Madrigal", 10, "male");

        String gender = Miguel.getGender();

        assertEquals("male", gender);

    }

    @Test

    public void setGender() {
        //arrange//
        Person Juanita = new Person("Juana", "Madrigal", 37, "female");
        //act//
        Juanita.setGender("male");
        String gender = Juanita.getGender();
        //assert//
        assertEquals("male", gender);
    }

    @Test
    public void getAge() {
        Person Alma = new Person("Alma", "Madrigal", 93, "female");

        int age = Alma.getAge();

        assertEquals(93, age);
    }

    @Test
    public void setAge() {
        //arrange //
        Person Marco = new Person("Marco", "Madrigal", 78, "male");
        // act //
        Marco.setAge(88);
        int age = Marco.getAge();
        //assert//
        assertEquals(88, age);

    }

    @Test

    public void getMother() {
        //arrange
        Person Dolores = new Person("Dolores", "Madrigal", 22, "female");
        Person Adessa = new Person("Adassa", "Madrigal", 55, "female");
        //act//
        Dolores.setMother(Adessa);
        Person mother = Dolores.getMother();
        //assert//
        assertEquals(Adessa, mother);
    }

    @Test
    public void getFather() {
        //arrange//
        Person Bruno = new Person("Bruno", "Madrigal", 44, "male");
        Person Pablo = new Person("Pablo", "Madrigal", 67, "male");
        //act//
        Bruno.setFather(Pablo);
        Person father = Bruno.getFather();
        //assert//
        assertEquals(Pablo, father);
    }

    @Test
    public void getSiblings() {
        //arrange//
        Person Maribel = new Person("Maribel", "Madrigal", 16, "female");
        Person sibling1 = new Person("Luisa", "Madrigal", 23, "female");
        Person sibling2 = new Person("Bella", "Maribel", 25, "female");

        List<Person> kiddies = new ArrayList<>();
        kiddies.add(sibling1);
        kiddies.add(sibling2);
        //act//
        Maribel.setSiblings(kiddies);
        List<Person> siblings = Maribel.getSiblings();
        //assert//
        assertEquals(kiddies, siblings);
    }

    @Test
    public void getChildren() {
        //arrange//
        Person Mother = new Person("Adassa", "Madrigal", 16, "female");
        Person child1 = new Person("Luisa", "Madrigal", 23, "female");
        Person child2 = new Person("Bella", "Maribel", 25, "female");
        List<Person> kids = new ArrayList<>();
        kids.add(child1);
        kids.add(child2);
        //act//
        Mother.setChildren(kids);
        List<Person> children = Mother.getChildren();
        //assert//
        assertEquals(kids, children);
    }

    @Test
    public void getPets() {
        //arrange//
        Person Maribel = new Person("Maribel", "Madrigal", 16, "female");
        Pet dog = new Pet("Chuchu", 10, "labrador");
        Pet cat = new Pet("MiauMiau", 5, "siamese");
        List<Pet> animalFriends = new ArrayList<>();
        animalFriends.add(dog);
        animalFriends.add(cat);
        //act//
        Maribel.setPets(animalFriends);
        List<Pet> pets = Maribel.getPets();
        //assert//
        assertEquals(animalFriends, pets);
    }

    @Test
    public void addChildToChildrenList() {
        //arrange//
        Person child1 = new Person("Maribel", "Madrigal", 16, "female");
        Person child2 = new Person("Anna", "Madrigal", 4, "female");

        List<Person> children = new ArrayList<>();
        children.add(child1); //adding child1//
        //act//
        child2.addChildToChildrenList(child2, child1); //adding child1
        List<Person> kiddies = child2.getChildren(); //here child1 as result//
        //assert//
        assertEquals(kiddies, children);//should both contain child1//
    }

    @Test
    public void addPet() {
        Person Bruno = new Person("Bruno", "Madrigal", 44, "male");
        Pet monkey = new Pet("Bubu", 3, "monkey");
        Pet giraffe = new Pet("Maurice", 16, "giraffe");
        List<Pet> pets = new ArrayList<>();//empty pets list//
        pets.add(monkey); //adding monkey to general petslist//
        pets.add(giraffe);// adding giraffe to general petlist - list contains monkey and giraffe//
        Bruno.addPet(Bruno, monkey); // adding monkey to Bruno's petlist//

        //act
        Bruno.addPet(Bruno, giraffe);//adding giraffe to Bruno's petlist - Brunos list should contain monkey and giraffe//

        assertEquals(pets, Bruno.getPets());// now we check if the pets list equals Bruno's petslist -if equal - test will turn green//
    }

    @Test
    public void addSibling() {
        Person Bruno = new Person("Bruno", "Madrigal", 44, "male");
        Person Dolores = new Person("Dolores", "Madrigal", 35, "female");
        Person Maria = new Person("Maria", "Madrigal", 22, "female");

        List<Person> siblings = new ArrayList<>();
        siblings.add(Bruno);
        siblings.add(Dolores);
        Maria.addSibling(Maria, Bruno);

        Maria.addSibling(Maria, Dolores);
        assertEquals(siblings, Maria.getSiblings());

    }

    @Test
    public void getGrandChildren() {
        Person Juanita = new Person("Juana", "Madrigal", 3, "female");
        Person Maribel = new Person("Maribel", "Madrigal", 34, "female");
        Person Dolores = new Person("Dolores", "Madrigal", 99, "female");

        List<Person> grandChildren = new ArrayList<>();
        grandChildren.add(Juanita);//adding Juanita as a grandChild to the list//

        Maribel.addChildToChildrenList(Maribel, Juanita);//adding Juanita(Maribels daughter and Dolores' grandChild) to Maribel's(Dolores daughter) list of children//
        Dolores.addChildToChildrenList(Dolores, Maribel);//adding Maribel(daughter Dolores) to Dolores(mother Maribel and grandMother Juanita) list of children

        List<Person> listGrandKids = Dolores.getGrandChildren(Dolores);//will give back the list of grandKids of Dolores//

        assertEquals(grandChildren, listGrandKids); //compares list of grandChildren with listGrandKids//
    }

}

//
