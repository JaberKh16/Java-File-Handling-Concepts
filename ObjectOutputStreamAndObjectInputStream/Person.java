
package filepackage.ObjectOutputStreamAndObjectInputStream;

import java.io.Serializable;


public class Person implements Serializable {
    
    public String name;
    public int age;
    public String designation;
    
    Person(String name, int age, String designation)
    {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    
}
