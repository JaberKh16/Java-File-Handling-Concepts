
package filepackage.FilterInputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

/*
    FilterInputStream class contains some other input stream, which it uses as its basic source 
    of data, possibly transforming the data along the way or providing additional functionality.

    FilterInputStream class is a child class of InputStream Class.
*/
public class FilterInputStreamClass {
    
    public static void main(String [] args) throws FileNotFoundException, IOException
    {
        // Creating the File Class Object
        File file = new File("/home/jaber/Documents/JavaFileHandling"
                                                            + "/TextFiles/filteroutputstream.txt");
        
        // Creating The FileInputStream Class Object
        // takes the File class reference object
        FileInputStream fin = new FileInputStream(file);
        
        // Creating the FilterInputStrem Class Object
        // We can't take FilrerInputStream because the class is object
        FilterInputStream fs = new BufferedInputStream(fin); // creating the child class object of FilterInputStream
        
        int data = 0;
        
        while((data = fs.read()) != -1)
        {
            System.out.print((char)data);
        }
    }
    
}
