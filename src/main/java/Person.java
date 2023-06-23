import java.util.ArrayList;

public class Person {
    private final String name;
    private final String middleName;
    private final String lastName;
    private final String gender;
    private int age;
    private final String mother;
    private final String father;
    /*private List<Sibling> siblings = new ArrayList<>();*/

    public Person(String name, String middleName, String lastName, String gender, int age, String mother, String father) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
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

    public String getFather() {
        return father;
    }
}
