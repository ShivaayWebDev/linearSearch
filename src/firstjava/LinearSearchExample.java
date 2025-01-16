package firstjava;

public class LinearSearchExample {

	public static int  linearSearch(int[]  array, int key) {
		for(int i=0;  i<array.length;  i++) {
			if (array[i] == key){
				return i;
			}
		}
		return -1;
	}
		
		
				public static void main(String[] args) {
			        int[] array = {10, 20, 30, 40, 50}; // Array
			        int key = 50; // Dhoondhne wala element

			        int result = linearSearch(array, key);
			        if (result != -1) {
			            System.out.println("Element index: " + result);
			        } else {
			            System.out.println("Element nahi mila.");
			        }
				}
}
	
	

	

		

