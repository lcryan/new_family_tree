import org.example.Person;
import org.example.Pet;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {

    @Test
    public void getName() {
        Pet Bello = new Pet("Bello", 12, "dog");
        String name = Bello.getName();
        assertEquals("Bello", name);
    }

    @Test
    public void getAge() {
        Pet Bello = new Pet("Bello", 12, "dog");
        int age = Bello.getAge();
        assertEquals(12, age);
    }

    @Test
    public void setAge() {
        Pet Bello = new Pet("Bello", 12, "dog");
        Bello.setAge(13);
        int age = Bello.getAge();
        assertEquals(13, age);
    }

    @Test
    public void getSpecies() {
        Pet Bello = new Pet("Bello", 12, "dog");
        String species = Bello.getSpecies();
        assertEquals("dog", species);
    }

    @Test
    public void setSpecies() {
        Pet Bello = new Pet("Bello", 12, "dog");
        Bello.setSpecies("cat");
        String species = Bello.getSpecies();
        assertEquals("cat", species);
    }

    @Test
    public void getOwner() {
        Pet Bello = new Pet("Bello", 12, "dog");
        Person owner = Bello.getOwner();
        assertEquals(null, owner);
    }

    @Test
    public void setOwner() {
        Pet Bello = new Pet("Bello", 12, "dog");
        Person Michael = new Person("Michael", "Madrigal", 22, "male");

        Bello.setOwner(Michael);
        String owner = Bello.getOwner().getName();
        assertEquals("Michael", owner);

    }

}

