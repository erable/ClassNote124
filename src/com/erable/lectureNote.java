package com.erable;
import java.util*;
/* Lecture 2 January 6th 
 * topic 2 basic javaI;
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

// 简直混乱不堪，文件多点没问题，你可以建包。
// 

// create a new class, same as the name in file 
public class lectureNote {
	// create the method named main
	public static void main(String[] args) {
		// indentation problem 
		int n;
		int a;
		int d;
		if ( n > 10){ 
			a = 1;
			d = 2;  // 因为你结构错乱，所以出莫名其妙的错误，一般的错误你应该知道，n就报错了。所以我不在本地改了，我单拎出来文件。以后你也效仿我的写法。
			// 而且因为代码混乱，根本就没法改了。
		} // the whole brace { } is the group of statement 
		// c = 3; 
		 * 
		 */

	} // end main  

	/*
	 * question from lecture 2: 1. what is file I/O --> input and output file
	 */

	/*
	 * Lecture 3 January 8; 45 Topic 2 basic java II; basic type used mostly:
	 * int and double final(keyword): Pi is constant and it is not a variable;
	 * result of 1/3 results is int, which is 0 --> put it in the end of;
	 * multiplication / let it *1.0 / (double)1/3; type string: string is object;
	 * in java string is not the list/arrays of character 'a' are type char,
	 * single character, encode from America; "a" is type string; double equal:
	 * it is not equal --> if (s1 == s2) changes into: if (s1.equals(s2));
	 * single equal: mathematics equal;
	 */
	public static void mainSec(String[] args){// 姐姐，main只能有一个，python看来你是差不离忘光了。
		String month = "January";
		char c = month.charAt(2);
		
		// String sub = month.charAt(2,5);
		
		String x = "abc";
		String y = "def";
		// value of x + y? yes 

		// output as string even it is integer + string 
		int a = 6;
		int b = 9;
		System.out.println("The total is:" + a + b ); // The total is 96
		System.out.println(a + b + "The total is:"); // 15 The total is, run from left to right

		String c1 = "apple";
		String d = "banana";
		c1.compareTo(d); // come out as the boolean answer if two output, but there are three in returns here < = >;

		import java.util*;

		Scanner keyword = new Scanner(System.in); // create a Scanner object;
		System.out.print("enter yout name(first and last):" ); // why it just the print, not println;
		keyword.next(): String;
		keyword.nextline();

		//???? un-finish 
		keyword.hasNextInt(); // true it is an int;

		if (!Keyin.hasNext()){
			Stsrem.out.println("no first name");
			return;

		// for (;;){// infinity, exit until break 
		//}
		//}

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
 * python list: can grow & shrink; can mix many types o'values (heterogeneous); language features for adding&deleting at any position; 
 * type[]name = new type[size]   or type name[] = new type[size]
 * eg. (double) variable: force variable in the double 
 * 
 */

// function of the method do 
// what does the result may or will shown if any condition happens 
	
	public static boolean leapYear(int year){ // boolean here means return boolean in the end 	
	System.exit(n); // 你这种随便写的习惯，哎，都不知道怎么说你了，n是什么？
	// n = 0 means normal exit, nor means error abort 
}

public static double m(double a, double b){// a and b can be int because java can convert int to double 
	int marks[] = new int[20]; // 20 zero in the arrays named marks 
	String[] names = new String["10"]; // ten string array
	return a+b; 
	}



/* Questionfor lecture 5 :
 * why n = 0 means nomal exit?--> system define it; 
 * int marks[] = new int[20]-->  index from 1 to 19, 20 zero and blank item in array;
 * print --> print at the same line; println --> print on the new line 
 */

/* lecture 6 Jan.13th, wednesday
 * for (int i = 0; i < 20; i++) --> i++ woudl run after once;
 * set the variable for the size of array so that we don't need to change all the #o'size o'array;
 * <array name>.lenth --> get the length o'the array;
 * new: create the new object in the property -- new type variable array_name[];
 * two demensional array: int scores[] [] =  new int [20][9];
 * scores[4] is 5th row; scores[4][7] is an int;
 * score.length is the height of the array, which is row;
 * scores[0].length --> column of the array, or array width;
 * three way to use scanner: by java.util package;
 * in array, each row can have different number of column;
 * System .out --> System is the package, out is the class to put output; 
 * java.lang package--> Math, System, string; string is the object of class; 
 * use any API class or package unless specifically asked not to use it;
 * don't use non-standard classes&package from Internet or supplied with Eclipse;
 * standard API comes with java or javax --> java.io / javax.swing;
 * cannot use org. in eclipse;
 * List listname<interger> = int ();
 * 
 */

	public static string array(int size){
		int array_name[] = new int [10];
		int x = array_name[0]; // okay
		array_name[8] = 42; // okay
		int z = array_name[5]; // exception, end at 9, -1 
		for (int i = 0 ; i++; i<array_name.length){
		}
		int scores[][] =  new int [20][9];// two demintion table, 20rows, 9columns  	
	}

	public class Import{
		public static void main(String arg[]){
			java.util.Scanner ketboard = new Scanner(System.in);
			String name = keyboard.nextLine();

		}
	import java.util.Scanner; //import java.util.*; import all class in java 
	
	
	}
		
		
/* lecture 7 friday january 15
 * Topic3: classes
 * indenting problem: indenting: method one line after the class; the condition have the same indenting 
 * comment: useful to learn about the code 
 * 
 * Topic3 Classes: 
 * -  three important elements: encapsulation(taking bunch of variale data); inheritance(class related to each other);polumorphism
 * -  
 * OOP: object-oriented programming: encapsulation(information hiding, captured all vairbale all together);inheritance(class inheriate another class); 
 * -  polymorphism(we will get there ==| -- contain how change or use the object data);
 * : bash : files need to compile before running:  javac java file. java ; java filename 
 * main class: just a class with main method 
 * output printing: System.out.println()// print out in the new line; 
 * 					System.out.print() // print out int the same line;
 * String is a predefined Jaca class - include the characters and length
 * Anthropomophize: object rememeber infor (instance variables) how to do things (instance methods) 
 * Special method: toString;
 * 
 */
// (baisc distribution of the resturant object) 
public class resteraurant{
	public String name;
	public int rating;
	public double avecost;
	public boolean hasveg; // one class per file with .java in the end
	
	public static void main(String args[]){
		Resteraurant rest = new Resteraurant(); // calling the class, constructing the resturant objectl 
		rest.name = "river"; // call from the class resturant and name method within the resturant 
		rest.rating = 5;
		rest.avecost = 4.5;
		rest hasveg = true;
	}
	
	public void	increaseRating(){
		if (rating <5){
			rating++;
		} // called by rest.increaseRating
	}
	
	// decide if it is a good resturant or not 
	public boolean good(){
		return rating >= 3;
	} // rest.good()
	
	public void changeName(String newName){
		name = newName;
	}

	public String toString(){ // take no parameter; don't actually call the toString in the object;
		return name + ", rating " + rating + ", avg.cost $ " + avgCost;
	} // automatic print out 
// String + object () --> everything would convert to string --> print out the String and the formate on to String 
	
	
/*lecture 8 tuesday january 19
 * continue Topic 3: classes 
 * constructure: same name as the class name wihout returning anyting; with the parameter can be called from the other class;
 * - if create the constructure, the parameter will be the same with the constructure have; nor default zero parameter 
 * - if don't need to input the parameter, just make specific value in the constructure;
 * - write zero parameter construcutre 
 * public: can be use and call by the function outside of its original class;
 * private: protect against mistake, only use within the same class;
 * name cannot be changes by private;
 * public class can be used, can be use other of this documents (preface)
 * the private class only inner working of the class (implementation)
 * 'this' the whole object;
 * get&set methods: get method tells us the method, set change the variable and attribute 
 * 
 */

/*Question lecture8 
 * 
 * 1.public void --> no return just the action 
 * 2.for the this? why do we use it --> don't need to reset teh variable from the paramter again 
 * 3. while(!false) --> can run the while loop here ?
 */
public boolean goood(){
	return rating >=3; // return boolean value if raning is larger than 3 
}
public Emplyee(String name, String jobTitle,double wahe){
	this.name = name;
	this.jobTitle = jobTitle;
	this.wage = wage;
	// this(name,jobTitle,wage)
}
/* lecture 9 january 20th 
 * overload construcuture: use this to get them into another name from parameter by order 
 * "final": constant
 * static changge be change and constant all the time;
 * alias: 
 * garbage collection: 
 * class is immutable: cannot change the obejct inside the class once it is create --> by private or instance variables 
 * string is immutable 
 * package: include differnt class with more than one class 
 * get is the vairable for public to use but set was set to private cannot be invoke outside of class; 
 * 
 */

/* Question in lecture 9 
 * what is the diff btw: final, static --> static is traking the variable in the method, but final is the one cannot be changes anymore, 
 * pragram --> package --> class ( or back another package again) --> method 
 * default: doesn't have a name but the main package 
 * java API has a lot lackage --> confused in name of package and class 
 * 
 * 
 */


/* lecture 10 friday january 22
 * java.lang 
 * 
 * recall the method with same features 
 * static: create another instant by return the calculation valuable 
 * final : doesn't change any value of variable 
 * euqal: == exceact the same in object, which means everything; 
 * set method and get method 
 * representation choice: 
 * defualt value: number: 0; boolean: false; char: '\0' ; object: null;
 * 
 */

/* question in lecture 10
 * 1. how to use the this because as the method only have two parameter inside it,
 *  the this can have more than three variable
 * 2. 
 * 
 */

/* 
 * lecture 11 feb 3 wednesday 
 * type conversion: type variablename = (type) newvariable
 * make sub class but the set method cannot be chanege: final 
 * muliple inheritance: a class have only one parent cannot get variable from two different method to add up into one 
 * rules of inheritance: 
 * to string: println(object.toString());
 * instance: if null them 0 
 * semantic of equal: 
 * 
 */

/* Topic5: Abstract Classes & Interfaces 
 * from chapter 8.2 (textbook)
 *  abstract class/ concrete class 
 *  get/set method 
 *  ask method into Question class --> ask method 
 *  only use abtract method in the abtract class 
 * push, pop, isEmpty <-- Stacks (by array) :
 * a class can extend only one other class, but many implement and interface 
 * 
 */
public abstract class Exam(){
	Quesion question[];
	
}

public abstract class Question{
	public abstract boolean A(){
		public abstract void one();
		public abstract int two():
	}
	public abstract class B extends A{
		public void one();
		public abstract String three; // three variable 
	}
	
	public interface Stack{
		public abstract void push(int i); // put an object on the top of the stack 
		public abstract int pop(); // remove  the last one and return the stack 
		public abstract boolean isEmpty(); // true if noting on the stack 
		// use peak to return the top but not remove 
		// all has to be public, default as public and abstarct in interface; b/c both are optional 
	}// Stack 
	public class ArrayStack implements Stack{
		
	}// Stack 
	}
}// end class Question 






























	}
} // end class lectureNote
