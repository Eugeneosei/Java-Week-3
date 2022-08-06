package codingAssignment;

public class Assignemnt {

	// Start main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercise 1
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int firstNum = ages[0];
		int lastNum = ages[ages.length - 1];
		int difference = firstNum - lastNum;
		
		System.out.println("The first num minus second num is " + difference);
		
		
		int newArr[] = new int[ages.length + 1]; 
		for (int i = 0; i < ages.length; i++) {
			newArr[i] = ages[i];
		}
		newArr[newArr.length - 1] = 56;
		
		int sumOfNums = 0;

		for (int num : newArr) {
			sumOfNums += num;
		}

		int average = sumOfNums / newArr.length;
		System.out.println("The average is " + average);
		
		// Exercise 2
		int sumOfLetters = 0;
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		for (String name : names) {
			sumOfLetters += name.length(); 
		}
		int averageletter = sumOfLetters / names.length;
		System.out.println("Average letter per name is " + sumOfLetters / names.length);
		
		String allNames = "";  
		for (String name : names) { 
			allNames = allNames + name + " ";
//			allNames +=  name + " ";  // alternate way to the above code
		}   System.out.println( "Names Seperated is " + allNames);
		
		
		int nameLengths[] = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}	
		
	    int sumOfElements =	0;
	    for (int i = 0; i < nameLengths.length; i++);
	    sumOfElements = sumOfElements + nameLengths[averageletter];
	    System.out.println("Sum of all elements in the nameLength array is " + sumOfElements);
	   
	    
	    System.out.println(fullName("Zion" , "Osei"));
	    System.out.println(helloMessage("Hello", 3));
	    System.out.println(isGreaterThan(ages));
	   
	    double[] array = {1.2,2.2,3.2};
	    System.out.println(averageDouble(array));
	    
	    double[] t1 = {67.7, 7.5, 11.3};
	    double[] t2 = {13.5, 6.9, 8.2};
	    System.out.println(isGreaterAverage(t1, t2));
	    
	   
	    System.out.println(willBuyDrink(true, 11.50));
	    
	    double[] mathClass = { 70.7, 85.6, 92.4,};
	    System.out.println(grades(mathClass));
	    
		}
	
	// End main
	    
	   	public static String helloMessage(String word, int n) {
	   		String words = "";
	   		for(int i = 0; i < n; i++) {
	   			words += word;
	   		}
	   		
	   		return words;
	   	}
	
	    public static String fullName(String firstName, String lastName) {
	    	
	    String name = firstName + " " + lastName; 
	    
		return name;
	
	    }	
	    
	    public static boolean isGreaterThan(int[] numbers ) {
	    	int sumOfNums = 0;

			for (int num : numbers) {
				sumOfNums += num;
			}
			
			if (sumOfNums > 100) {
				return true;
			}
			else {
				return false;
			}
	    }
	    
	    public static double averageDouble(double[] array) {
	    	double sum = 0;
	    	for(int i = 0; i < array.length; i++) {
	    		sum += array[i];
	    	}
	    	
	    	return sum / array.length;
	    	
	    }
	    
	    public static boolean isGreaterAverage(double[] myarray, double[] myarray1 ) {
	    	// Method returns true if avg of myarray is > avg of myarray1
	    	double avg1 = averageDouble(myarray);
	    	double avg2 = averageDouble(myarray1);
	    	
	    	if (avg1 > avg2);
	    	{
	    		return true;
	
	    	}
	    		 	
	    }
	    	//willBuyDrink method
	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	  	// if it ishotoutside and moneyinpocket is greater than 10.50 return true.
	    	
	    	if (isHotOutside & moneyInPocket > 10.50);
	    	{
	    		return true;
	    	}
	    	
	    	}
			
	    // Excercise 13, grade method 
	    public static double grades(double[] arr) {
	    // returns the average grade as a double
	    	
	    	double mathGrades = 0;
	    	for (int i = 0; i < arr.length; i++) {
	    		mathGrades += arr[i];
	    	}
	
	    	 return mathGrades / arr.length;
	    		
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    
	    
	     
	    
	    
	
}




