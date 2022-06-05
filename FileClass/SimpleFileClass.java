
package filepackage.FileClass;

import java.io.File;
import java.io.IOException;


public class SimpleFileClass {
    
    public static void main(String [] args) throws IOException
    {
        // Creating the File Class Object
        File newFile = new File("/home/jaber/Documents/JavaFileHandling/TextFiles/newfile.txt");
        
        // check the file is exists or not using exists()
        System.out.println("File is exists or not: " + "  " +newFile.exists());
        // now creating the file
        System.out.println("Creating the file: " + "  "  + newFile.createNewFile());
        // to check the file absolute path
        System.out.println("Getting the Absolute path of file: " +  "  "+ newFile.getAbsolutePath());
        // to check the canonical path
        System.out.println("Getting the Canonical path of file: " + "  "  +newFile.getCanonicalPath());
        // to check the file name
        System.out.println("Getting the Absolute path of file: " + "  "  +newFile.getName());
        System.out.println("Getting the path of file: " + "  "  +newFile.getPath());
        
        // File read , write , execution related methods
        // can write the file using canWrite() returns the write permission for the file
        System.out.println("Can write ?:" + "  " + newFile.canWrite());
        // can read the file using canRead() returns the read permission for the file 
        System.out.println("Can read ?:" + "  " + newFile.canRead());
        // can execute the file using canExecute() returns the execution permission for the file
        System.out.println("Can execute ?:" + "  " + newFile.canExecute());
        
        // checking its a file or not
        System.out.println("Is this file ?:" + "  " + newFile.isFile());
        // checking its a directory or not
        System.out.println("Is that a Directory:" + "  " + newFile.isDirectory());
        
        // checking the directory for that file using getParent() which returns in which directory the file resides
        System.out.println("Parent of the file :" + "  " + newFile.getParent());
        System.out.println( "File size is in bytes : " + "  "+ newFile.length());
        
    }
}
