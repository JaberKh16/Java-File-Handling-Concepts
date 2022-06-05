
package filepackage.ObjectOutputStreamAndObjectInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    ObjectOutputStream class writes primitive data types and Java Object  to an OutputStream.
    This object can be read(reconstituted) using an ObjectInputStream.
    
    ObjectOutputStream is a child class of OutputStream.
*/



public class ObjectOutputStreamClass {
    
    public static void main(String [] args) throws FileNotFoundException, IOException
    {
        // Creating the ObjectOutputStream Class Object
        FileOutputStream fout = new FileOutputStream("/home/jaber/Documents/JavaFileHandling"
                                                                                     + "/TextFiles/objectoutputstream.txt");
        
        // Creating the ObjectOutputStream Class Object
        ObjectOutputStream obj = new ObjectOutputStream(fout);
        
        // Creating the Person Class Object
        Person person = new Person("Jaber", 24, "Software Engineer");
        
        // writing the object to the ObjectOutputStream Class
        obj.writeObject(person);
        obj.close(); // to close the ObjectOutStream Class
        
        System.out.print("File has been succesfully written!");
    }
}
