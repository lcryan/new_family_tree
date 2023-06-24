import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    void getName() {

        //arrange //
        Person Luisa = new Person("Luisa", "Madrigal", 18, "female");

        //act//
        String name = Luisa.getName();

        //Assert//
        assertEquals("Luisa", name);
    }

}
