import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DOSTest{
   public static void main(String[] args) 
          throws IOException, FileNotFoundException{

      // create FileOutputStream object
      // constructor for overidden mode
      FileOutputStream fos = new FileOutputStream("output.txt");

      // constructor for append mode
      /* FileOutputStream fos = 
           new FileOutputStream("output.txt", true); */

      // create DataOutputStream object
      DataOutputStream dos = new DataOutputStream(fos);

      // write different types of primitive data
      dos.writeInt(97); // int
      System.out.print(dos.size() + " ");

      dos.writeLong(100L); // long
      System.out.print(dos.size() + " ");

      dos.writeFloat(99.9f); // float
      System.out.print(dos.size() + " ");

      dos.writeDouble(95.5); // double
      System.out.print(dos.size() + " ");

      dos.writeChar('a'); // char
      System.out.print(dos.size() + " ");

      dos.writeBoolean(true); // boolean
      System.out.print(dos.size() + " ");

      dos.writeUTF("knowprogram.com"); // string
      System.out.print(dos.size() + " ");

      dos.writeBytes("Hello, world!"); // string
      System.out.print(dos.size() + " ");

      dos.writeChars("Java program"); // string
      System.out.print(dos.size() + " ");

      dos.write(97); // normal write() method
      System.out.println(dos.size());

      // display some message for conformation
      System.out.println("Data is saved to the file");

      // close stream
      dos.close();
   }
}
