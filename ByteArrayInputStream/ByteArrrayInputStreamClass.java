
package filepackage.ByteArrayInputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class ByteArrrayInputStreamClass {
    
    public static void main(String [] args)
    {
        try {
            // Creating an ByteArrayOutputStream Class Object
            ByteArrayOutputStream bs = new ByteArrayOutputStream(); // by default this class constructor takes 32 bytes
            
            
            // size() to get the size for the ByteArrayOutStream reference
            while (bs.size()!=8)
            {
                // will neeed getBytes() method because there is no write() which can write a complete string
                // so will need to write bytes by bytes.
                bs.write("this".getBytes()); // getBytes() gets one byte at a time from the string
                
            }
            
            // creating an byte [] array
            byte message[] = bs.toByteArray(); // toByteArray() gets one byte at a time 
            System.out.println("Printing the content:");
            
            for(int i =0; i < message.length; i++)
            {
                System.out.print( (char)message[i] + "  ");
            }
            
            // passing the byte array message [] to the ByteArrayInputStream constructor
            ByteArrayInputStream bi = new ByteArrayInputStream(message);
            
            int value=0;
            for(int i=0; i<1; i++)
            {
                // read() method reads the next byte of the data from the InputStream and returns
                // an int as an the next byte of data , if it is the end of the file then it it returns -1
                while((value = bi.read()) != -1)
                {
                        System.out.println((char) value);
                }
            }
            
            
            //bs.close();// to close the ByteArrayOutputStream
        } 
        catch (IOException io) 
        {
            System.out.println("Error is:" + io.getMessage());
          
        }
        
      
    }
}
