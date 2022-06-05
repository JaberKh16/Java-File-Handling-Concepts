
package filepackage.ObjectOutputStreamAndObjectInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*
    ObjectInputStream class deserializes primitive data and objects previously written using 
    an ObjectInputStream.

    ObjectInputStream is a child class of OutputStream Class.
*/

public class ObjectInputStreamClass {
    
    public static void main(String [] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        
        // Creating the ObjectOutputStream Class Object
        FileOutputStream fout = new FileOutputStream("/home/jaber/Documents/JavaFileHandling"
                                                                                     + "/TextFiles/objectoutputstream.txt");
        
        // Creating the ObjectOutputStream Class Object
        ObjectOutputStream objOutput = new ObjectOutputStream(fout);
        
        // Creating the Person Class Object
        Person person = new Person("Jaber", 24, "Software Engineer");
        
        // writing the object to the ObjectOutputStream Class
        objOutput.writeObject(person);
        objOutput.close(); // to close the ObjectOutStream Class
        
        
        
        // Creating the FileOutputStream Class Object
        FileInputStream fin = new FileInputStream("/home/jaber/Documents/JavaFileHandling"
                                                                                    + "/TextFiles/objectoutputstream.txt");
        
        // Creating the ObjectOutputStream Class Object
        ObjectInputStream objInput = new ObjectInputStream(fin);
        
        // Creating the Person Class Object 
        Person personInput = (Person)objInput.readObject(); // converted to Class
        objInput.close(); // to close the ObjectInputStream Class
        
        System.out.println("Name:" + "  " + personInput.name);
        System.out.println("Age:" + "  " + personInput.age);
        System.out.println("Designation:" + "  " + personInput.designation);
        
        
    }
}
