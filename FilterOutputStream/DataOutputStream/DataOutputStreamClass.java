package filepackage.FilterOutputStream.DataOutputStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    DataOutputStream class is a child class of FilterOutputStream Class.
    
    This class lets an application write primitive Java datatypes to an output stream in a portable(easy)
    way.  An application can then use a data input stream to read the data back in.

 */
public class DataOutputStreamClass {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Creating the FileOutputStream Class Object
        FileOutputStream fout = new FileOutputStream("/home/jaber/Documents/JavaFileHandling"
                + "/TextFiles/dataoutputstream.txt");

        // Creating DataOutputStream Class Object
        // takes the output stream class reference as a parameter
        DataOutputStream dout = new DataOutputStream(fout);

        String message = "I want to learn more about file handling in Java";
        byte b[] = message.getBytes(); // getting the bytes by bytes data

        dout.write(b); // write the 
        dout.flush();
        System.out.println("File has been written successfully!");
        
        // closing the necessary streams open
        dout.close();
        fout.close();

    }

}
