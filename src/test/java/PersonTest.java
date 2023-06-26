import org.example.Person;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
        Person Mirabel = new Person("Mirabel", "Conchita", 16, "female");

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
}
