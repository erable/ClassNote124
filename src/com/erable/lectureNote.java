package com.erable;
/* Lecture 2 January 6th 
 * topic 2 basix javaI;
 * file I/O;
 * Java tool: BlueJ;JDK plus text editor; Eclipse;
 * semi-colon  (;) is for separate but not the new line and the space;
 * i++ is means adding up 1 for i, int means integer --> for (int i = 1; i < n; i++ );
 * dynamic typing: must run program to determine the types of expressions 
 * java use static typing: declared with a type --> int x = 14;
 * a variable must be declared before you use !! (the variable would not compile until you declare)
 * 
 * 
 */

// create a new class, same as the name in file 
public class lectureNote { 
	// create the method named main 
	public static void main(String[] args) {
		// indentation problem 
		
		if ( n > 10){ 
			a = 1;b = 2;
		} // the whole brace { } is the group of statement 
		// c = 3; 
		 * 
		 */

	} // end main 


/* question from lecture 2:
 * 1. what is file I/O --> input and output file 
 */
 

 /* Lecture 3 January 8 th;
  * 45
  * topc 2 basic java II;
  * basic type used mostly: int and double 
  * final(ketword): Pi is constant and it is not a variable; 
  *  result of 1/3 results is int, which is 0 --> put it in the end of multiplication / let it *1.0 / (double)1/3;
  *  type string: string is object in java 
  *  string is not the list/arrays of character
  *  'a' are type char, single character, unicode from america; "a" is type string;
  *  double equal: it is not equal --> if (s1 == s2) changes into: if (s1.equals(s2));
  *  single euqal: mathematic equal;
  *  
  */
	public static void mainSec(String[] args){
		String month = "January";
		char c = month.charAt(2);
		
		String sub = month.charAt(2,5);
		
		String x = "abc";
		String y = "def";
		// value of x + y? yes, connotation 
		
		// output as string even it is int+ string 
		int a = 6;
		int b = 9;
		System.out.println("The total is:" + a + b ); // The total is 96
		System.out.println(a + b + "The total is:"); // 15 The total is, run from left to right
		
		String a = "apple";
		String b = "banana";
		int val  a.compareTo(b); // come out as the boolean answer if two output, but there are three in returns here < = >;
		
		import java.util.*;
		
		Scanner keyword = new Scanner(System.in); // create a Scanner object;
		System.out.print("enter yout name(first and last):" ) // why it just the print, not println;
		keyword.next(): String ;
		keyword.nextline();
		
		//???? unfinish 
		keyword.hasNextInt(); // true it is an int;
		
		if (!Keyin.hasNext()){
			Stsrem.out.println("no first name");
			return;
			
		for (;;){// infinity, exit until break 
			
		}
		}
		
/* lecture 4 Jan 12th, Tuesday 
 * method:function, procedure, subprogram, subroutine (same)
 * the reason why we use method:1. avoide duplicate code,2. modulize, improve readability;
 * abstraction: what it does (preface) concrete/implementation view: how it works (implementation) 
 * break: ends the current innermost loop;
 * scope of variable = where it can be used 
 * scope of java variable: from declaration to the end, the variable can be used out of its own } 
 * if you have " int b " before, you cannot have "double b", illegal 
 * global variable: variable can be use outside of method but not outside of program 
 * arrays: arrays are not lists !!!,
 * java arrays: size is specified at creation time, never changes;  all values must have same type (homogeneous); 
 * java array: all you can do is change the value of existing elements; all array elements initialized zero/null array 
 * python list: can grow& shrink; can mix many types o'values (heterogeneous); language features for adding&deleting at any position; 
 * type[]name = new type[size]   or type name[] = new type[size]
 * eg. (double) variable: force variable in the double 
 * 
 */
		
// function of the method do 
// what does the result may or will shown if any condition happens 
	
	public static boolean leapYear(int year){ // boolean here means return boolean in the end 	
	System.exit(n);
	// n = 0 menas normal exit, nor means error abort 
}
	
public static double m(double a, double b) {// a and b can be int because java can convert int to double 
	int marks[] = new int[20]; // 20 zero in the arrays named marks 
	String[] names = new String[10] // ten string array
	return a+b; 
	}
		
		
		
/* Questionfor lecture 5 :
 * why n = 0 means nomal exit?--> system define it; 
 * int marks[] = new int[20]-->  index from 1 to 19, 20 zero and blank item in array;
 * print --> print at the same line; println --> print on the new line 
 */
		
/* lecture 6 Jan.13th, wednesday
 * for (int i = 0; i < 20; i++) --> ; here is and
 * set the variable for the size of array so that we don't need to change all the #o'size o'array;
 * <array name>.lenth --> get the length o'the array;
 * new: create the new object in the property -- new type variable array_name[]
 * two demensional array: int scores[] [] =  new int [20][9]
 * scores[4] is 5th row; scores[4][7] is an int; 
 * score.length is the height of the array, which is row 
 * scores[0].length --> column of the array, or array width;
 * three way to use scanner: by java.util package; 
 * in array, each row can have different number of column; 
 * System .out --> System is the package, out is the class to put output; 
 * java.lang package--> Math, System, string; string is the object of class; 
 *  use any API class or package unless specifically asked not to use it;
 * don't use non-standard classes&package from Internet or supplied with Eclipse;
 * standard API comes with java or javax --> java.io / javax.swing;
 * cannot use org. in eclipse;
 * 
 */
	
	public static string array(int size){
		int array_name[] = new int [10];
		int x = array_name[0]; // ok
		array_name[8] = 42; // ok
		int z = array_name[5]; // exception, end at 9, -1 
		for (int i = 0 ; i++; i < array_name.length){
			
		}
		 int scores[][] =  new int [20][9];// two demintion table, 20rows, 9columns  	
	}
	
	public class Import{
		public static void main(String arg[]{
			java.util.Scanner ketboard = new Scanner(System.in);
			String name = keyboard.nextLine();
			
		}
	import java.util.Scanner; //import java.util.*; import all class in java 
	
	
	}
		
		
		
		
		
		
		
				
	}
	
	
} // end class lectureNote