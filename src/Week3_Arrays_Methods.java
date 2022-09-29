
public class Week3_Arrays_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Problem 1 solution */
		// initialize array ages and assign values to it
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 50};
		
		// subtract value of the first element of array ages from the last element and print the result
		int subtractionResult = ages[ages.length-1] - ages[0];
		System.out.println("Result for problem 1 is " + subtractionResult);
		
		// calculate the average age of the array and print the result
		int sum = 0;
		int average = 0;
		for (int i = 0; i < ages.length; i++)
		{
			sum += ages[i];
		}
		average = sum / ages.length;
		System.out.println("Average is " + average);
		
		/* Problem 2 solution */
		// initialize array names and populate it with given values
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// calculate average number of letters and print results
		int averageNumberOfLetters = 0;
		int wordLength = 0;
		
		for (int i = 0; i < names.length; i++)
		{
			wordLength += names[i].length();
			
		}
		averageNumberOfLetters = wordLength / names.length;
		System.out.println("Average number of letters per name is " + averageNumberOfLetters);

		// concatenate all names into one String separated by spaces
		String allNames = "";
		
		for (String name: names)
		{
			allNames = allNames + name + " ";
		}
		
		System.out.println("Result of concatenating all strings: " + allNames);
		
		/* Problems 5, 6 solution*/
		// create an array and assign the length of each word in the previous array to the new one
		
		int[] nameLengths = new int [6];
		
		for (int i = 0; i < nameLengths.length; i++)
		{
			nameLengths[i] = names[i].length();
		}
		
		// calculate the sum of the elements of nameLengths array
		int sumOfLengths = 0;
		for (int i = 0; i < nameLengths.length; i++)
		{
			sumOfLengths += nameLengths[i];
		}
		
		System.out.println("The sum of all elements of nameLengths array is: " + sumOfLengths);
		
		//Test concatenateWords method
		System.out.println("Concatenated String is: " + concatenateWords("Hello", 3));
		
		//Test getFullName method
		System.out.println("Full Name is: " + getFullName("Iroda", "Narzullaeva"));
		
		//Test checkSum method
		int[] testArray = {10, 30, 45, 5};
		System.out.println("Is sum of all elements in array greater than 100? " + checkSum(testArray));
		
		//Test calculateAverage method
		double[] arr1 = {3.5, 5.5, 6.2, 8.6};
		System.out.println("Average of the elements of array is " + calculateAverage(arr1));
		
		//Test compareAverage method
		double[] testArr1 = {5.0, 6.2, 3.4, 1.4, 2.0}; //4
		double[] testArr2 = {1.5, 3.5, 6.0, 1.0, 3.0}; //3
		System.out.println("Average of first array is greater than average of the second: " + compareAverage(testArr1, testArr2));
		
		//Test willBuyDrink method
		System.out.println("Will I buy drink? " + willBuyDrink(true, 12.00));
		
		//Test isEven method
		isEven(26700);
		isEven(333333);
		
	} //end main
	
	/**
	 * This method concatenates the user entered word to itself n number of times and returns 
	 * a new String
	 * @param word - user word 
	 * @param n - number of times
	 */
	public static String concatenateWords (String word, int n)
	{
		String finalResult = "";
		for (int i = 0; i < n; i++)
		{
			finalResult += word;
		}
		
		return finalResult;
	} //end concatenateWords
	
	/**
	 * This method concatenates the first name and last name  
	 * and returns full name separated by space.
	 */
	public static String getFullName (String firstName, String lastName)
	{
		return firstName + " " + lastName;
	} //end getFullName
	
	/**
	 * This method takes an array of integers and checks if the sum of all elements
	 * is greater than 100. It will return true if sum is greater than 100 and false 
	 * otherwise.
	 */
	public static boolean checkSum (int[] integerArray)
	{
		int sum = 0; 
		for (int i = 0; i < integerArray.length; i++)
		{
			sum += integerArray[i];
		}
		
		return sum > 100;
	} //end checkSum
	
	/**
	 * This method calculates and returns an average of all elements of an array
	 */
	public static double calculateAverage (double[] arrayOfDouble)
	{
		double sum = 0;
		for (int i = 0; i < arrayOfDouble.length; i++)
		{
			sum += arrayOfDouble[i];
		}
		
		return sum / arrayOfDouble.length;
	} //end calculateAverage
	
	/**
	 * This method calculates and compares average of elements of two arrays. 
	 * @return true if the average of elements of first array is greater than 
	 * average of the elements of the second array.
	 */
	public static boolean compareAverage (double[] array1, double[] array2)
	{
		double sumOfFirstArray = 0.0;
		double sumOfSecondArray = 0.0;
		double averageOfFirstArray = 0.0;
		double averageOfSecondArray = 0.0;
		
		for (int i = 0; i < array1.length; i++)
		{
			sumOfFirstArray += array1[i];
		}
		
		averageOfFirstArray = sumOfFirstArray / array1.length;
		
		for (int j = 0; j < array2.length; j++)
		{
			sumOfSecondArray += array2[j];
		}
		
		averageOfSecondArray = sumOfSecondArray / array2.length;
		
		return averageOfFirstArray > averageOfSecondArray;
	} //end compareAverage method
	
	/**
	 * 
	 * @param isHotOutside
	 * @param moneyInPocket
	 * @return true if it is hot outside and moneyInPocket is greater than 10.50
	 */
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket)
	{
		return ((isHotOutside == true) && (moneyInPocket > 10.50));
	} //end willBuyDrink
	
	/**
	 * This method checks if the number is even and prints to console if the number 
	 * is even or odd.
	 * @param number
	 */
	public static void isEven (int number)
	{
		if (number % 2 == 0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	} //end isEven

}
