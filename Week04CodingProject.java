package week04;

public class Week04CodingProject {

	public static void main(String[] args) {
		
	//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//a. Programmatically subtract the value of the first element in the array from the value in the 
		//last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		//b. Create a new array of int called ages2 with 9 elements 
		//(ages2 will be longer than the ages array, and have more elements).  
			//i. Make sure that there are 9 elements of type int in this new array.  
			//ii. Repeat the subtraction from Step 1.a. 
			//(Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
			//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};	
	System.out.println("1a): " + (ages[ages.length - 1] - ages[0]));
	
	int[] ages2 = {5, 34, 22, 9, 10, 58, 31, 48, 17};
	//biii: while the first array has 8 elements and the second has 9, the programatic method to access the final element is the same.
	System.out.println("1bii): " + (ages2[ages2.length - 1] - ages2[0]));
	
	//c: had to declare a variable to add the ages to outside of the for loop.
	int ageSum = 0;
	for(int i = 0; i < ages.length; i++) {
		ageSum += ages[i];
	}
	//Checking it with my calculator came up with 28.75, which truncates to 28.
	System.out.println("1c): " + (ageSum / ages.length));
	
	//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. 
		//Print the result to the console.
		//b. Use a loop to iterate through the array again and concatenate all the names together, 
		//separated by spaces, and print the result to the console.

	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	//As above, I first declared a variable outside of the for loop.
	int letterSum = 0;
	for (int i = 0; i < names.length; i++) {
		letterSum += names[i].length();
	}
	//The truncation here is more noticeable as 23/4 is much closer to 4 than the 3 returned.
	System.out.println("2a): " + (letterSum / names.length));
	
	String allNames = "";
	//I decided to contain an if statement in the for loop so that the final name wouldn't have an extra space on the end.
	for (int i = 0; i < names.length; i++) {
		if (i < (names.length - 1)) {
			allNames += names[i] + " ";
		} else {
			allNames += names[i];
		}
	}
	System.out.println("2b): " + allNames);
	
	
	//3. How do you access the last element of any array?

	System.out.println("3): To access the last element of any array, use array[array.length - 1]; "
			+ "as the index starts at 0, the final number is one less than the number of elements in the array.");
	
	//4. How do you access the first element of any array?

	System.out.println("4): To access the first element of any array, use array[0] as the index always starts at 0.");
		
	//5. Create a new array of int called nameLengths. 
	//Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

	//This array will have the same length as the names array, so that can be used to size it during initialization.
	int[] nameLengths = new int[names.length];
	
	//While coding, I printed each element to the console after adding it to the nameLengths array to check that it was working.
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
//		System.out.println(nameLengths[i]);
	}
	
	
	//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
	//Print the result to the console.

	int nameLengthsSum = 0;
	for (int i = 0; i < nameLengths.length; i++) {
		nameLengthsSum += nameLengths[i];
	}
	System.out.println("6): " + nameLengthsSum);
	
	//7. Write a method that takes a String, word, and an int, n, as arguments 
	//and returns the word concatenated to itself n number of times. 
	//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

	System.out.println("7): "+ repeatWord("Hello", 3));
	
	
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
	//(the full name should be the first and the last name as a String separated by a space).

	System.out.println("8): " + createFullName("Sam", "Vimes"));
	
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

	//I opted to test this method with one of the existing int arrays rather than creating another one.
	System.out.println("9): " + greaterThan100(ages));
	
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.

	//Before using the method, I needed an array of doubles, which I decided to call prices.
	double[] prices = {10.99, 4.35, 8.89, 7.50, 3.49, 4.23, 1.64, 8.20, 15.55};
	System.out.println("10): " + findAverage(prices));
	
	//11. Write a method that takes two arrays of double and returns true 
	//if the average of the elements in the first array is greater than the average of the elements in the second array.

	//I had to make a second double array. As its average is smaller, I was able to check both true and false outputs.
	double[] prices2 = {5.43, 2.89, 1.99, 5.27, 3.40, 6.15, 1.42, 9.38, 4.75, 6.84};
	System.out.println("11): " + firstAverageGreater(prices, prices2));
	
	
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

	System.out.println("12): " + willBuyDrink(false, 12.25));
	
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

	//I forgot I had to iterate through to print an array and tried to print the result of my method directly.
	//Once I realized I decided to print on a single line and separate items with spaces.
	double[] salePrices = findSalePrices(prices, .15);
	for (double price : salePrices) {
		System.out.print(price + " ");
	}
	
	
		
	}

	
	//Method 7
	//I used an outer if statement to check for a positive number first, then performed the concatenation with a for loop.
	public static String repeatWord(String word, int n) {
		String result = "";
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				result += word;
			}
			return result;
		} else {
			return "Please use a number greater than 0.";
		}
	}
	
	//Method 8
	//Without a loop or calculations needed, I didn't require a temporary variable and was able to use a single line for this method.
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//Method 9
	//I stored the sum in a method level variable and used the comparison for my return line.
	//I was able to use a for each loop as I didn't need the index value for anything.
	public static boolean greaterThan100(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum > 100;
	}
	
	//Method 10
	//I was able to use nums and sum again due to them only existing within their respective methods.
	public static double findAverage(double[] nums) {
		double sum = 0;
		for (double num : nums) {
			sum += num;
		}
		return sum / nums.length;
	}
	
	//Method 11
	//Rather than rewriting my code for finding the average of a double array, I instead called it twice in this method.
	public static boolean firstAverageGreater(double[] nums1, double[] nums2) {
		double firstAverage = findAverage(nums1);
		double secondAverage = findAverage(nums2);
		return firstAverage > secondAverage;
	}
	
	//Method 12
	//Instead of using an if statement, I was able to check for both boolean values in one line.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}
	
	//Method 13
	//As I had used prices for my double arrays, I decided to create a method for a store-wide sale.
	//This method takes a double array and a double representing the percentage of price taken off each item.
	//It iterates through the double array and adds the adjusted prices to the new array.
	public static double[] findSalePrices(double[] prices, double percentOff) {
		double[] salePrices = new double[prices.length];
		for (int i = 0; i < prices.length; i++) {
			salePrices[i] = prices[i] - (prices[i] * percentOff);
		}
		return salePrices;
	}
	
}
