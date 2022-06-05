
package filepackage.ByteArrayOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


/*
    To get a byte by byte oriented data we can use ByteArrayOutputStream Class.
*/
public class ByteArrayOutputStreamClass {
    
    public static void main(String [] args)
    {
        try {
            // Creating an ByteArrayOutputStream Class Object
            ByteArrayOutputStream bs = new ByteArrayOutputStream(); // by default this class constructor takes 32 bytes
            
            // size() to get the size for the ByteArrayOutStream reference
            while (bs.size()!=4)
            {
                bs.write('c');
                System.out.println("Byte is: " + " " + bs);
            }
            
            bs.close();// to close the ByteArrayOutputStream
        } 
        catch (IOException io) 
        {
            System.out.println("Error is:" + io.getMessage());
          
        }
    }
    
}
