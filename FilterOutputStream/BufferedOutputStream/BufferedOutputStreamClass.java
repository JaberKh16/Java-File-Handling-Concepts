
package filepackage.FilterOutputStream.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    BufferOutputStream is child class of FilterOutputStream Class. 
    

    Java BufferedOutputStream class is used for buffering an output stream.It internally uses
    buffer to store data.

    It adds more efficiency than to write data directly into a stream. So it makes the performance
    fast.
*/

public class BufferedOutputStreamClass {
    
    public static void main(String [] args) throws FileNotFoundException, IOException
    {
        // Creating FileOutputStream Class Object
        FileOutputStream fout = new FileOutputStream("/home/jaber/Documents/JavaFileHandling/TextFiles"
                                                                                + "/bufferedoutputstream.txt");
        
        // Creating BufferedOutputStream Class Object
        // BufferedOutputStream takes the OutputStream class
        BufferedOutputStream bout = new BufferedOutputStream(fout); 
        
        String message="I am writing into a file using the BufferedOutputStream";
        byte b[] = message.getBytes(); // to get the bytes by bytes data
        
        bout.write(b); // pass the byte [] into the write funtion
        bout.flush(); // to flush the previous buffer data
        bout.close(); // to close the BufferedOutputStream 
        fout.close(); // to close the FileOutputStream 
        
        System.out.println("File has successfully been writen!");
        
        
    }
    
}
