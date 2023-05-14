import java.io.*;
/*public class CopyFile{
public static void main(String args[]){
try{
FileInputStream sourcefile = new FileInputStream(args[0]);
FileOutputStream targetfile = new FileOutputStream(args[1]);
int byteValue;
while((byteValue = sourcefile.read()) != -1)
targetfile.write(byteValue);
sourcefile.close();
targetfile.close();
System.out.println("file copying is successfully done");
}
catch(IOException e){
System.out.println("Exception "+e.toString());
}
}
}*/

import java.io.*;
 
// Main Class
public class CopyFile {
 
    // Main driver method
    public static void main(String[] args)
        throws IOException
    {
 
        // Creating two stream
        // one input and other output
        FileInputStream fis = null;
        FileOutputStream fos = null;
 
        // Try block to check for exceptions
        try {
 
            // Initializing both the streams with
            // respective file directory on local machine
 
            // Custom directory path on local machine
            fis = new FileInputStream("D:\\java\\sourcefile.txt");
            // Custom directory path on local machine
            fos = new FileOutputStream("D:\\java\\targetfile.txt");
 
            int c;
 
            // Condition check
            // Reading the input file till there is input
            // present
            while ((c = fis.read()) != -1) {
 
                // Writing to output file of the specified
                // directory
                fos.write(c);
            }
 
            // By now writing to the file has ended, so
             // Display message on the console
            System.out.println("copied the file successfully");
        }
 
        // Optional finally keyword but is good practice to
        // empty the occupied space is recommended whenever
        // closing files,connections,streams
        finally {
 
            // Closing the streams
 
            if (fis != null) {
 
                // Closing the fileInputStream
                fis.close();
            }
            if (fos != null) {
 
                // Closing the fileOutputStream
                fos.close();
            }
        }
    }
}