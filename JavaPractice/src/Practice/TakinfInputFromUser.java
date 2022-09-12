package Practice;

import java.util.Scanner;

public class TakinfInputFromUser {
  public static void main(String[] args) {
   Scanner readme = new Scanner(System.in);
   System.out.println("Enter Two Numbers (Press Enter after each):");
   //two variables to hold numbers
   int n1, n2, n3;
   n1 = readme.nextInt();
   n2 = readme.nextInt();
   n3 = n1 + n2;
   System.out.println("Total = " + n3);
  }
}
