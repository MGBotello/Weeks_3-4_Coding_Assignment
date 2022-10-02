
public class Coding_Assignment_3_4 {

	public static void main(String[] args) {
		
	    System.out.println(" ______Step 1______"+ "\n");// Cosmetic break, to separate answers
		/*1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
			//(i.e. do not use ages[7] in your code). Print the result to the console.  
        b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
        c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.*/
		
		int[] ages = new int [] {3,9,23,64,2,8,28,93};// 1) integer Array called ages created with this 8 elements/values
		
		System.out.println("***** 1a *****");// Cosmetic break, to separate answers
		
		int subtractFirstLast = (ages[ages.length - 1] - ages[0]);//a) subtract 1st element: 3 FROM last element 93
		System.out.println(subtractFirstLast);//93-3 = 90.
		
		System.out.println("***** 1b *****");
	
		ages = new int []{3,9,23,64,2,8,28,93,103};// b) added age 103 to the Ages Array.Now the array has 9 elements
		int newSubtractFirstLast = (ages[ages.length - 1] - ages[0]);
		System.out.println(newSubtractFirstLast);// 103 - 3 = 100
		
		System.out.println("***** 1c *****");
		
		int sumOfValues = 0;//Initiate variable to hold the value from the updated ages-Array added together
		for (int i = 0; i < ages.length; i++ ) {
			sumOfValues += ages[i];//Variable sumOfValues gets updated every time the loop runs until all the ages have been added. (=333)
		}
		System.out.println( "The Average age is: " + (sumOfValues / ages.length) );// This will print to the consoles the total...
							//of the values added together by the number of elements in the array, which is 9 elements: 333/9 = 37
		
		
	    System.out.println("\n"+" ______Step 2______"+ "\n");// Cosmetic break, to separate answers
	    /* 
	     *  2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result 
           to the console.
	     */
		
	    String [] names =  new String[] {"Sam","Tommy", "Tim", "Sally","Buck","Bob"};//String Array called "names" created with this names in it.
	    
	    System.out.println("***** 2a *****");
	    
	    double nameSize = 0; // initiate variable to hold the total number of letters from all names added together
	    for (int i = 0; i < names.length; i++) {
	    	nameSize += names[i].length();// this takes the length of the name on index "i" and adds it to the nameSize variable until the length of 
	    }							  //all names have been added, 3 + 5 + 3 + 5 + 4 + 3 = 23
	    System.out.println("Average number of letters per name: " + nameSize / names.length);//print to console the average by dividing the total
	    																				//number of letters by the number of words(6): 23/6 = 3.83
	    System.out.println("***** 2b *****");
	    
	    String namesTogether = "";// initiate string variable to hold the names being put together
	    for (int i = 0 ; i < names.length; i++){
	    	namesTogether = namesTogether.concat(names[i] + " ");//The string in index "i" in the names Array will be concatenated to the end of 
	    														//the string in "namesTogether" Variable.
	    }
	    System.out.println(namesTogether);
	    
	    
	    System.out.println("\n"+" ______Step 3______"+ "\n");  
	    
	    //		3) How do you access the last element of any array?
	    
	    ages = new int []{3,9,23,64,2,8,28,93,103};// integer Array ........Reuse array from Step 1 above...
	    System.out.println("Last element of the 'ages' Array is : " + ages[8]); // if the number of elements in the array is known and will not change, 
	    																		//you can call the last element directly by its index number
	    System.out.println("Last element of the 'ages' Array is : " + ages[ages.length - 1]); // If your code will be used for Arrays of 
	    // different lengths, we can access the last element by the index equal to the length of the array minus 1. minus one because the
	    // element count starts at 0. 
	    
	    
	    System.out.println("\n"+" ______Step 4______"+ "\n");
	    
	    //		4) How do you access the first element of any array?
	    
	    ages = new int []{3,9,23,64,2,8,28,93,103};// integer Array, first element is 3. 
	    System.out.println("First element in the Array is: " + ages[0]);// Array elements start count at index Zero...
	  
	    
	    System.out.println("\n"+" ______Step 5______"+ "\n");
	    
	    //		5) Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the 
	    //length of each name to the nameLengths array.
	    
	    // {"Sam","Tommy", "Tim", "Sally","Buck","Bob"}...Previously created "names" Array on line 44...Step 2
	    int[] nameLengths = new int [names.length]; // new integer Array created of length equal the the length of the "names" array: 6 elements
	   for (int i = 0; i < names.length; i++) {
	    	nameLengths[i] = names[i].length();// index "i" in Array "nameLengths" will equal the length of the word on index "i" in "names" Array
	   }
	   System.out.println("The elements of the new Array are: "); 
	   for (int i = 0 ; i < nameLengths.length; i++) {// print out the new Array to see that the above code worked.
	    	System.out.print(nameLengths[i]+ " ");
	    }
	   
	   System.out.println("\n"+" ______Step 6______"+ "\n");
	   
	   //		6) Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
	   //Print the result to the console.
	   
	   int sumOfElements = 0;// interger variable to hold the sum of the elements in the Array created in step 5
	   for (int i = 0 ; i <nameLengths.length; i++ ) {
		   sumOfElements += nameLengths[i];// sumOfElements = sumOfElements + index "i" of the "nameLengths" Array
	   }
	   System.out.println("Sum of all the elements is: " +sumOfElements);
	   
	
	   System.out.println("\n"+" ______Step 7______"+ "\n");// Method created on line 183
	   
	    //		7) Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself 
	    //n number of times.(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	   
	   System.out.println("'Hello' Concatenated 3 times is: " );
	   System.out.println(concatenatedWords("Hello", 3));// calling "concatenatedWords" Method with the arguments: "Hello" and integer 3.
	   													
	   
	   System.out.println("\n"+" ______Step 8______"+ "\n");// Method created in line 192
	   
	   //		8) Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name 
	   //should be the first and the last name as a String separated by a space).
	   
	   System.out.println("Full Name is: ");
	   System.out.println(fullName("Sam","Smith")); // print out the called method with the provided arguments.
	   												
	   
	   System.out.println("\n"+" ______Step 9______"+ "\n");// Method in line 199
	   
	   //		9) Write a method that takes an array of int and returns true if the sum of all the ints in the 
	   //array is greater than 100.
	   
	   int[] arrOne = new int [] {20,20,10,51};// : 101, Array with the sum of integers greater than 100
	   int[] arrTwo = new int [] {20,20,10,50}; //: 100, Array with the sum of integers NOT GREATER than 100
	   
	   System.out.println("Case One: " + sum100(arrOne));// case one: 101 > 100 true
	   System.out.println("Case Two: " + sum100(arrTwo));// case Two: 100 > 100 false
	   
	   System.out.println("\n"+" ______Step 10______"+ "\n");// Method in line 212
	   
	   //		10) Write a method that takes an array of double and returns the average of all the elements in the array.
	   
	   double[] arrThree = new double [] {1.99, 2.99, 3.99, 4.99};//Array of double data type(total = 13.96)
	   System.out.println("Average of all the elements in the array: ");
	   System.out.println(elementAverage(arrThree));// Run the " elementAverage" method with arr-Three Array as the argument
	   						//   13.96/4= 3.49
	   
	   System.out.println("\n"+" ______Step 11______"+ "\n");//Method in line 223
	   
	   //		11) Write a method that takes two arrays of double and returns true if the average of the elements in the first 
	   //array is greater than the average of the elements in the second array.
	   
	   
	   double [] arrFour = new double [] {0.99, 1.99, 2.99, 3.99}; // total= 9.96
	   System.out.println(compareAverage(arrThree, arrFour)); // (step 10 array) Is array three:13.96 greater than array four: 9.96 = True
	   
	   
	   System.out.println("\n"+" ______Step 12______"+ "\n");// Method in line 242
	   
	   //		12) Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns 
	   //true if it is hot outside and if moneyInPocket is greater than 10.50.
	   
	   boolean isHotOutside = true; // Its hot outside
	   double moneyInPocket = 15.99;  // $15.99 > $10.50
	   System.out.println(willBuyDrink(isHotOutside, moneyInPocket));// true
	   
	   
	   System.out.println("\n"+" ______Step 13______"+ "\n"); //Method in line 251
	   
	   //		13) Create a method of your own that solves a problem. In comments, write what the method does and why you created it. 
	   
	   
	   
	   // Arguments (is the tire low, is the tire punctured)
	   System.out.println("case1: " + tireLight(true, true)); // Tire is low and tire is punctured.
	   System.out.println("case2: " + tireLight(true, false));// Tire is low and tire is not punctured.
	   System.out.println("case3: " + tireLight(false, false));// Tire is not low or punctured. 
	   
	   }// End of the Main method
	
	
	
						//Step 7 Method: 
	public static String concatenatedWords (String word, int n) {// Method Signature, returning a String, Arguments are a String and Integer
		String result = "";// Start empty string variable to hold the concatenated words.
		for ( int i = 0 ; i < n; i++) {
			result += word;        //after every iteration, add the chosen word to the end of the string in the variable "result"
		}return result;
	}// end of the "concatenatedWords" Method
	
	
						//Step 8 Method:
	public static String fullName (String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
	return fullName;
	}// end of the "fullName" Method
	
	
						//Step 9 Method:
	public static boolean sum100 (int num1[]) {// boolean method
		int sumInteger = 0; // 1st is a for loop to determine the sum of the integers in the array
		for (int number : num1) {
			sumInteger += number;
		}
		if ( sumInteger > 100 ) {// if true, return true; otherwise return false.
			return true;
		}
		return false;
	}// end of the "sum100" Method
	
	
						//Step 10 Method:  // able to reuse variable names, since values are not shared between Methods...
	public static double elementAverage (double num1[]) { // takes an Array of double type as an argument
		double sumInteger = 0;
		for ( double number : num1) {
			sumInteger += number;//total sum of elements in the Array
		}double integerAverage = (sumInteger / num1.length); // sum of elements divided by the number of...
															//...elements in the array = Average
		return integerAverage;
	}// end of the "elementAverage" Method
	
	
						//Step 11 Method:
	public static boolean compareAverage (double num1[], double num2[]) {// Arguments are of type double, but will return a boolean
		double sumInteger = 0;                            //
		for ( double number : num1) {					  // This calculates the average of the first Array
			sumInteger += number;						  //
		}double num1Average = (sumInteger / num1.length); //
		
		double sumInteger2 = 0;							  //
		for ( double number : num2) {					  //This calculates the average of the second Array
			sumInteger2 += number;						  //
		}double num2Average = (sumInteger2 / num2.length);//
		
		if (num1Average > num2Average) {
			return true;       // true if the average from 1st Array is greater then average from 2nd Array.        
		}return false;		   // false otherwise
	}// end of the "compareAverage" Method
	
	
						//Step 12 Method:
	public static boolean willBuyDrink (boolean hot, double num1) {//takes a boolean and an integer as arguments, but returns a boolean
		if (hot== true && (num1 > 10.50)) {
			return true;
		}return false;
	}// end of the "willBuyDrink" Method
	
	
					   
					  //Step 13 Method:
	
	// This method recommends the action needed after your vehicle's Tire pressure light turns on
	
	public static String tireLight (boolean lowAir, boolean punctured) {//Returns a String, Arguments are boolean
		String answer = "";  // Initialize variable to hold the action needed
		if (lowAir == false && punctured == false) {
			answer += "Tires are OK. Diagnosis is required";
		}else if(lowAir = true && punctured == true){
			answer += "Tire patch recommended";
		}else if(lowAir = true && punctured == false) {
			answer += "Tire is OK, only needs air";
		}
		return answer;
		
	}
	
	
	

}
