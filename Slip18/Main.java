import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;

class Main {
  public static void main(String[] args) {
    try {

      // Creates a FileInputStream
      FileInputStream file = new FileInputStream("abc.txt");
      FileWriter writer = new FileWriter("a.txt");

      // Creates a BufferedInputStream
      BufferedInputStream input = new BufferedInputStream(file);

      // Reads first byte from file
      int i = input .read();
      int U;

      while (i != -1) {

        U=Character.toUpperCase(i); 
               writer.write(U);
       
        System.out.print((char) U);

        // Reads next byte from the file
        i = input.read();
        // System.out.print((char) i);
      }
      writer.close(); 
      input.close();
    }

    catch (Exception e) 
    {
      e.getStackTrace();
    }
  }
}