package Q555;

import java.util.Scanner;

public class Kieun {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      String[] strX = new String[10];
      int size = strX.length;

      for (int i = 0; i < size; i++) {
         strX[i] = scanner.next();
         System.out.print(strX[i]);
      }
      scanner.close();
   }

}
