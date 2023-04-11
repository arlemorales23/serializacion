package ejemplo1;

import java.io.IOException;

public class PrincipalEjemplo1 {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("John", 30, "Male");
            ObjectSerializer.writeObjectToFile(p1, "person.ax");
            System.out.println("Object written to file");

            Person p2 = (Person) ObjectSerializer.readObjectFromFile("person.ax");
            System.out.println("Object read from file:");
            System.out.println(p2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
