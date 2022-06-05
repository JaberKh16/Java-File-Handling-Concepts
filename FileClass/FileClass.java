
//package filepackage.FileClass;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    File Class have 4 different constructors ===>
        1. Parent file name and Child String
        2. Path Name
        3. Parent And Child
        4. Url pass
*/


public class FileClass {
    
    public static void main(String [] args)
    {
        
        // creating an File Class Object
        // here , i am giving the url for the file
        File file = new File("/home/jaber/Documents/JavaFileHandling/TextFiles//example.txt");
        // checking the file is exist or not using exists() which return true or false depends on exists or not
        System.out.println( "File exists or not : " + file.exists());
        
        
        if(file.exists() == false)
        {
            try 
            {
                // to create a file using the createNewFile() which creates a file if not exists and return true
                // otherwise if file is already exists then don't do any file creation and return false
                System.out.println("Creating the file:" + file.createNewFile());
                System.out.println("File has created successfully!");
                
                // to check the given absolute path of the directory
                System.out.println("File Path is: " + file.getAbsolutePath());
            } 
            catch (IOException io) 
            {
                System.out.println("Error is:" + io.getMessage());
            }
        
        }
        
        else
        {
            System.out.println("File has already been created");
        }
        
        
        
        
    }
    
}
