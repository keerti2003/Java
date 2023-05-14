// DataInputStream class demonstration
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DISTest {
   public static void main(String[] args) 
           throws IOException, FileNotFoundException {

      // create FileInputStream object
      // constructor for overidden mode
      FileInputStream fis = 
           new FileInputStream("output.txt");

      // constructor to connect file in append mode
      /* FileInputStream fis = 
           new FileInputStream("output.txt", true); */

      // create DataInputStream object
      DataInputStream dis =  new DataInputStream(fis);

      // read int data
      int n1 = dis.readInt();
      System.out.println(n1);

      // read long
      System.out.println(dis.readLong());

      // read float
      System.out.println(dis.readFloat());

      // read double
      System.out.println(dis.readDouble());

      // read character
      System.out.println(dis.readChar());

      // read boolean
      System.out.println(dis.readBoolean());

      // read String
      System.out.println(dis.readUTF());

      // read last values
      byte[] b = new byte[100];
      System.out.println(dis.read(b));
      for(int i=0; i<b.length; i++) {
         System.out.print((char)b[i]);
      }

      // close stream
      dis.close();
   }
}
