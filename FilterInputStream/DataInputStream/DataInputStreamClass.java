
package filepackage.FilterInputStream.DataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    DataInputStream class is a child class of FilterInputStream class.
    
    this class let's an application read primitive Java datatypes from an underlying input stream 
    in a machine independent way.
*/

public class DataInputStreamClass {
    
    public static void main(String [] args) throws FileNotFoundException, IOException
    {
        // Creating the FileInputStream Class Object
        FileInputStream fin = new FileInputStream("/home/jaber/Documents/JavaFileHandling/"
                                                                                + "TextFiles/dataoutputstream.txt");
        
        // Creating the DataInputStream Class Object
        // takes the input stream reference object
        DataInputStream din = new DataInputStream(fin);
        
        int available = din.available(); //  this will check for the available bytes in the DataInputStream
        byte b [] = new byte[available];  // making a byte [] using the available data
        din.read(b); // reading the data from the byte [] 
        
        // for each loop making a object  and then compare with the previous object
        for(byte message:b)
        {
            System.out.print((char)message);
        }
        
                
        
    }
    
}
