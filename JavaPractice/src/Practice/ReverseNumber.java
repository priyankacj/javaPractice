package Practice;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
	long reverse ;
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter the number- ");
		long num= sc.nextInt();
		while(num!=0) {
			long rem=num%10;
			reverse=0*10+rem;
			num=num/10;
			System.out.println("reverse of givrn number is ="+ " "+reverse);
		}
		
		
		
	}
	}