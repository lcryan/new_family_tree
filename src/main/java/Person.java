import java.util.ArrayList;

public class Person {
    private final String name;
    private String middleName;
    private final String lastName;
    private final String gender;
    private int age;
    private String mother;
    private String father;

/*    private List<Sibling> siblingList = new ArrayList<>();
    private List<Child> childrenList = new ArrayList<>();
    private List<Pet> petList = new ArrayList<>();*/ //TODO : this is still giving me errors - check out why

    public Person(String name, String lastName, int age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, int age, String gender) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;

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
}


//TODO : addChild methode
//addPet methode
//addSibling methode
//getGrandChildren methode