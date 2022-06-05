
package filepackage.FilterInputStream.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    Java BufferedInputStream class is used to read information from stream. It is internally uses
    buffer mechanism to make the performance fast.

    BufferedInputStream class is a child class of FilterInputStream Class.
*/

public class BufferedInputStreamClass {
    
    public static void main(String [] args) throws FileNotFoundException, IOException
    {
        // Creating the FileInputStream Class Object
        FileInputStream fin = new FileInputStream("/home/jaber/Documents/JavaFileHandling"
                                                                         + "/TextFiles/bufferedoutputstream.txt");
        
        // Creating the BufferedInputStream Class Object
        BufferedInputStream bin = new BufferedInputStream(fin);
        
        int data = 0;
        while((data = bin.read()) != -1)
        {
            System.out.print((char)data);
        }
        
    }

}
