
package filepackage.FilterOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;


public class FilterOutputStreamClass {
    
    public static void main(String [] args) throws IOException
    {
        // Creating a File Class Object
        File file = new File("/home/jaber/Documents/JavaFileHandling/TextFiles/filteroutputstream.txt");
        if(file.exists() == false)
        {
            // then create a file with  the associate name
            file.createNewFile();
        }
        
        else
        {
            // Creating the FileOutputStream Class Object
            FileOutputStream fout = new FileOutputStream(file); // pass the File Class reference here
            // Creating the FilterOutputStream Class Object
            FilterOutputStream filterout = new FilterOutputStream(fout); // pass the FileOutStream Class reference here
            
            String message = "Java is good"; 
            byte b[] = message.getBytes(); // to gets the bytes by bytes from the string
            
            
            filterout.write(b); // writes the bytes by bytes to this filterout stream
            filterout.flush(); // to flush the old byte from the filterout stream
            
            System.out.println("File has succesfully written!");
            
            // closing the streams
            filterout.close();
            fout.close();
            
            
            
        }
    }
}
