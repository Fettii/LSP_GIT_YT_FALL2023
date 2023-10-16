package org.howard.edu.lsp.assignment4;
/**
 * The `Driver` class is used to test the functionality of the `IntegerSet` class.
 *
 * @author Yafet Tedla
 * @version 10/16/2023
 */
public class Driver { 
    /**
     * The main method for testing the `IntegerSet` class.
     *
     * @param args The command-line arguments (not used in this context).
     */	
	public static void main(String[] args) {
	
		// Test the clear() method
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.clear();
        System.out.println("Set1 is empty after clearing: " + set1.isEmpty());

        // Test the length() method
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(5);
        System.out.println("Size of Set2 is: " + set2.length());

        // Test the equalsTo() method
        IntegerSet set3 = new IntegerSet();
        set3.add(1);
        set3.add(2);
        IntegerSet set4 = new IntegerSet();
        set4.add(2);
        set4.add(1);
        System.out.println("Set3 is equal to Set4: " + set3.equalsto(set4));

        // Test the contains() method
        IntegerSet set5 = new IntegerSet();
        set5.add(10);
        set5.add(20);
        System.out.println("Set5 contains 10: " + set5.thiscontains(10));
        System.out.println("Set5 contains 15: " + set5.thiscontains(15));

        // Test the largest() and smallest() methods
        IntegerSet set6 = new IntegerSet();
        set6.add(30);
        set6.add(15);
        System.out.println("Largest value in Set6: " + set6.largest());
        System.out.println("Smallest value in Set6: " + set6.smallest());

        // Test the union() method
        IntegerSet set7 = new IntegerSet();
        set7.add(1);
        set7.add(2);
        IntegerSet set8 = new IntegerSet();
        set8.add(2);
        set8.add(3);
        set7.union(set8);
        System.out.println("Union of Set7 and Set8: " + set7.toString());

        // Test the intersect() method
        IntegerSet set9 = new IntegerSet();
        set9.add(1);
        set9.add(2);
        IntegerSet set10 = new IntegerSet();
        set10.add(2);
        set10.add(3);
        set9.intersect(set10);
        System.out.println("Intersection of Set9 and Set10: " + set9.toString());

        // Test the diff() method
        IntegerSet set11 = new IntegerSet();
        set11.add(1);
        set11.add(2);
        IntegerSet set12 = new IntegerSet();
        set12.add(2);
        set12.add(3);
        set11.diff(set12);
        System.out.println("Difference of Set11 and Set12: " + set11.toString());

        // Test the complement() method
        IntegerSet set13 = new IntegerSet();
        set13.add(1);
        set13.add(2);
        IntegerSet set14 = new IntegerSet();
        set14.add(2);
        set14.add(3);
        set13.complement(set14);
        System.out.println("Complement of Set13 with respect to Set14: " + set13.toString());
}
	
}