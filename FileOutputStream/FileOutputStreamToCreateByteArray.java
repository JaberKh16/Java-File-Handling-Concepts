
package filepackage.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;


public class FileOutputStreamToCreateByteArray {
    
    public static void main(String [] args)
    {
        try 
        {
            // Creating the FileOutputStream Class Object
            FileOutputStream fos = new FileOutputStream("/home/jaber/Documents/JavaFileHandling/TextFiles/arrayofbytes.txt");
            // Creating the FileChannel Class Object
            FileChannel fc =  null;
            
            // creating the bytes of the array
            byte  b[] = new byte[9];
            
            for (int i = 0; i < b.length; i++)
            {
                if(i == 0){
                    b[i] = 'J';
                }
                
                if(i == 1){
                    b[i] = 'A';
                }
       
                if(i == 2){
                    b[i] = 'B';
                }
                
                if(i == 3){
                    b[i] = 'E';
                }
                
                if(i == 4){
                    b[i] = 'R';
                }
                
                if(i == 5){
                    b[i] = 'K';
                }
                
                if(i == 6){
                    b[i] = 'H';
                }
                
                if(i == 7){
                    b[i] = 'A';
                }
                
                if(i == 8){
                    b[i] = 'N';
                }
                
               
            }
            
            fos.write(b); // to write the byte [] array to the file using write(byte[] b)
            
            // This method returns the unique FileChannel Object associated with this FileOutputStream
            fc = fos.getChannel(); 
            System.out.println("Channel is :" + "  " + fc);
            
            long size = fc.size();
            System.out.println("File Size is : " + " " + size + " bytes");
            
            long position = fc.position();
            System.out.println("Cursor Postion at : " + "  " + position);
            
            // now close all the necessary Stream classes u have opened to free the allocated resources
            fos.close(); // to close the FileOutputStream
            fc.close(); // to close the FileChannel
            
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("Error is:" + ex.getMessage());
        } 
        catch (IOException io) 
        {
            System.out.println("Error is:" + io.getMessage());
        }
       
        
    }
}
