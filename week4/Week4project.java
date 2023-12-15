package week4;

import java.util.ArrayList;
import java.util.List;

public class Week4project {

	public static void main(String[] args) {
		//create an array of int
	int[] ages = {3,9,23,64,2,8,28,93};
	
	//substract first element from last element
		int result = ages[ages.length - 1] - ages[0];
	    System.out.println(result);
	    
	//new array
	    int[] ages2 = {2,4,5,6,7,10,11,12,13};
	    int result2 = ages2[ages2.length - 1] - ages2[0];
	    System.out.println(result2);
	    
	//use loop to iterate through and calculate average
	    double sum = 0;
	    for(double i = 0; i < ages.length; i++) {
	    	sum += ages [(int) i];
	    }
	    double average = sum / ages.length;
	    System.out.println(average);
	    
	//create an array of string
	    List<String> names = new ArrayList<>();
	    names.add("Sam");
	    names.add("Tommy");
	    names.add("Tim");
	    names.add("Sally");
	    names.add("Buck");
	    names.add("Bob");
	    for(String name: names)
	    System.out.println(name);
	    System.out.println(      );
	//access last element
	    System.out.println(names.get(5));
	    System.out.println(      );
	//access first element
	    System.out.println(names.get(0));
	    System.out.println(      );
	//new array
	    List<Integer> namelengths = new ArrayList<>();
	    namelengths.add(3);
	    namelengths.add(5);
	    namelengths.add(3);
	    namelengths.add(4);
	    namelengths.add(4);
	    namelengths.add(3);
	//sum of all elements
	    for(int i = 0; i < 6; i++);
	    System.out.println(namelengths);
	    
	    
	
	
	
	}
	
}
