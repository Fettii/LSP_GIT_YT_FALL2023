package org.howard.edu.assignment5;
/**
 * @author Yafet Tedla
 * @version 10/16/2023
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet {
    /**
     * Holds the elements of the set.
     */

	private List<Integer> set = new ArrayList<Integer>();
	   /**
     * Default constructor for creating an empty `IntegerSet`.
     */
	public IntegerSet() {
	}
    /**
     * Constructor that initializes an `IntegerSet` with an existing list of integers.
     *
     * @param set An ArrayList of integers to initialize the `IntegerSet`.
     */	
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
    /**
     * Clears the internal representation of the set, making it empty.
     */
	public void clear() {
		set.clear();
		
	}
	
    /**
     * Returns the number of elements in the set.
     *
     * @return The number of elements in the set.
     */
	public int length() {
		
		return set.size();
		
	}
	
    /**
     * Compares this `IntegerSet` with another object for equality.
     * Two `IntegerSet` objects are equal if they contain the same values in any order.
     *
     * @param o The object to compare with this `IntegerSet`.
     * @return `true` if the objects are equal, `false` otherwise.
     */
	public boolean equalsto(Object o) {
		if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        IntegerSet that = (IntegerSet) o;

        if (set == null && that.set == null) {
            return true;
        }
        if (set == null || that.set == null || set.size() != that.set.size()) {
            return false;
        }

        List<Integer> setCopy = new ArrayList<>(set);
        List<Integer> oCopy = new ArrayList<>(that.set);

        Collections.sort(setCopy);
        Collections.sort(oCopy);

        return setCopy.equals(oCopy);
		
	}
	
    /**
     * Checks if the set contains a specific value.
     *
     * @param value The value to check for in the set.
     * @return `true` if the set contains the value, `false` otherwise.
     */
	public boolean thiscontains(int value) {
		return set.contains(value);
	}
	
    /**
     * Returns the largest item in the set.
     *
     * @return The largest item in the set.
     * @throws IllegalArgumentException If the set is empty.
     */
	public int largest(){
		if(set.isEmpty()) {
			throw new IllegalArgumentException("Set is empty");
		}
		
		int biggest = Collections.max(set);
		return biggest;
	}
	
    /**
     * Returns the smallest item in the set.
     *
     * @return The smallest item in the set.
     * @throws IllegalArgumentException If the set is empty.
     */
	public int smallest() {
		if(set.isEmpty()) {
			throw new IllegalArgumentException("Set is empty");
		}
		
		int smallest = Collections.min(set);
		return smallest;
		
		
		
	}
	
    /**
     * Adds an item to the set if it is not already present.
     *
     * @param item The item to add to the set.
     */
	public void add(int item) {
		if(!set.contains(item)) {
			set.add(item);
		}
		
	}
	
	/**
	 *  Removes an item from the set or does nothing if not there
	 * @param item
	 */
	public void remove(int item) {
		if(!set.contains(item)) {
			set.remove(item);
		}

	}
	
	/**
	 *  Set union
	 * @param intSetb
	 */
	public void union(IntegerSet intSetb) {
		for(Integer item : intSetb.set) {
			if(!set.contains(item)) {
				set.add(item);
			}
		}
	}
	
	/**
	 *  Set intersection, all elements in s1 and s2
	 * @param intSetb
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> intersection = new ArrayList<Integer>();
		
		for (Integer item: set) {
			if(intSetb.set.contains(item)) {
				intersection.add(item);
			}
		}
		set = intersection;
	}
	
	/**
	 *  Set difference, i.e., s1 –s2
	 * @param intSetb
	 */
	public void diff(IntegerSet intSetb) {
		
		List<Integer> difference = new ArrayList<Integer>();

        for (Integer item : set) {
            if (!intSetb.set.contains(item)) {
                difference.add(item);
            }
        }
        set = difference;
		
	}; 
	
	/**
	 *  Set complement, all elements not in s1
	 * @param intSetb
	 */
	public void complement(IntegerSet intSetb) {
		
		List<Integer> complement = new ArrayList<Integer>();

        for (Integer item : set) {
            if (!intSetb.set.contains(item)) {
                complement.add(item);
            }
        }
        
        set = complement;
	};
	
	/**
	 *  Returns true if the set is empty, false otherwise
	 * @return
	 */
	boolean isEmpty() {
		return set.isEmpty();
	}; 
	
    /**
     * Returns a string representation of the set.
     *
     * @return A string representation of the set.
     */
	public String toString() {
		return set.toString();
	};









	





	
	

}
