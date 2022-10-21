package basics.objectBasics.fr.m2i.formation.models;

public class Personnage {


    // Attributs
    private String firstName;
    private String lastName;
    private int age;

    private static int id;


    static {
        id = 0;
    }

    public Personnage() {
        this("John");
    }

    public Personnage(String firstName) {
        this(firstName, "Doe");

    }

    public Personnage(String firstname,String lastname) {
        this(firstname, lastname, 28);
    }

    public Personnage(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        id++;
    }


    public void sayHello() {
        System.out.println("Heyyyyyyyyyyyyyyyyyy !");
    }

    public void presentation() {
        System.out.println("Bonjour, je m'appelle " + this.firstName + " " + this.lastName + " et j'ai " + this.age + " ans.");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getId() {
        return id;
    }
}
