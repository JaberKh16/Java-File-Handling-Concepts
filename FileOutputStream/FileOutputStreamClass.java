package filepackage.FileOutputStream;

import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.io.IOException;

public class FileOutputStreamClass {

    public static void main(String[] args) throws IOException 
    {
        
        // creating the necessary classes references 
        FileOutputStream fos = null; // FileOutStream reference
        FileChannel fc = null; // FileChannel reference
        
        try 
        {
            // creating the FileOutputStreamClass Class Object
            fos = new FileOutputStream("/home/jaber/Documents/JavaFileHandling/TextFiles/fileoutputstream.txt");
            fos.write('b');
            fos.flush(); // to flush the stream

            // This method returns the unique FileChannel Object associated with this FileOutputStream
            fc = fos.getChannel();
            System.out.println("Channel is:" + "  " + fc);

            long postion = fc.position(); // to get the postion of the cursor currently now
            System.out.println("Get the postion of cursor after writing:" + "  " + postion);
        } 
        
        catch (Exception e) 
        {
            System.out.println("Error is:" + e.getMessage());
        } 
        
        finally {
            if (fos != null) 
            {
                fos.close(); // to close the FileOutputStream
            }

            if (fc != null) 
            {
                fc.close();  // to close the FileChannel
            }
            
        }
        
    }
}
