
package filepackage.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;


public class FileInputStreamUsingSkippingCharacter {
    
     public static void main(String [] args) throws IOException
    {
        // Creating the FileInputStream reference
        FileInputStream fis = null;
        // Creating the FIleChannel reference
        FileChannel fc = null;
        
        try {
            // creating the object for the FileInputStream Class
            fis = new FileInputStream("/home/jaber/Documents/JavaFileHandling/TextFiles/arrayofbytes.txt");
            
            int cursor_points = 0;
        
            // fis.read() reads a byte of data from this input stream and returns integer value 
            //  if can read a byte then return 1 otherwise -1
             while((cursor_points = fis.read()) != -1)
            {
                // to get the unique FileChannel object associated with this file input stream "fis"
                fc = fis.getChannel();
                long postion = fc.position(); // to store the cursor position
                
                fis.skip(1); // to skip the position at places 1 at a time
                
                // this will returns the ascii value for the written characters in the file , so need type cast into char
                System.out.println("Postion at : " + postion + "\t" + "Character Read: " + " " + cursor_points);
                System.out.println("Converting the ASCII value to a character");
                System.out.println("Postion at : " + postion + "\t" + "Character Read: " + " " + (char)cursor_points);
                
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error is:" + e.getMessage());
        }
        
        finally
        {
            if(fis != null)
            {
                fis.close(); // to close the FileInputStream
            }
            
            if(fc !=null)
            {
                fc.close(); // to close the FileChannel
            }
        }
        
        
    }
    
}
