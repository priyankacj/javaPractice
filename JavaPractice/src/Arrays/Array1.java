package Arrays;

public class Array1 {
	public static void main(String[] args) {

		// declares an Array of integers
		int[] arr;

		// allocating memory for 5 integers
		arr = new int[5];

		// initialize the elements of the array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[4] = 40;
		arr[3] = 50;
		for (int i = 0; i < arr.length; i++)
			
			// accessing the array elements
			System.out.println("Elements at index " + i + " " + arr[i]);

	}

}
