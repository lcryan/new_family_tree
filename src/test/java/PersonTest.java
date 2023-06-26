import org.example.Person;
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
        Person Mother = new Person("Adassa", "Madrigal", 16, "female");
        Person child1 = new Person("Luisa", "Madrigal", 23, "female");
        Person child2 = new Person("Bella", "Maribel", 25, "female");

        List<Person> kids = new ArrayList<>();
        kids.add(child1);
        kids.add(child2);

        Mother.setChildren(kids);

        List<Person> children = Mother.getChildren();
        assertEquals(kids, children);
    }

}
