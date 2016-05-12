/**Name:Erin
 *Id:U10108079
 *Exercise:HW10_binary_sort

 */

import java.util.Scanner;

//main method
public class BinarySort {
	public static void main(String[] args) {

	  	// Create a Scanner
		Scanner input = new Scanner(System.in);

		//Enter how many numbers in the list
		int number;
		System.out.print("Enter how many numbers in the list：");
		number= input.nextInt();		

		//Create an array to store the list
		int[] list;
		list = new int[number];

		//Enter the numbers in the list
		System.out.println("Enter the numbers in the list：");
		for(int i = 0; i<list.length; i++){
			System.out.print("["+ (i+1) + "]:");
			list[i] = input.nextInt();
		}
}
