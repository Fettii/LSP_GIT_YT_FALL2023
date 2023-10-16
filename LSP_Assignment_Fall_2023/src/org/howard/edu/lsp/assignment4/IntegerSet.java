package org.howard.edu.lsp.assignment4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet {
	
// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}
	
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	// Clears the internal representation of the set
	public void clear() {
		set.clear();
		
	}
	
	// Returns the length of the set
	public int length() {
		
		return set.size();
		
	}
	
	/*
     * Returns true if the 2 sets are equal, false otherwise;
* Two sets are equal if they contain all of the same values in ANY order.  This overrides
* the equal method from the Object class.
*/

	
	public boolean equals(Object o) {
		Collections.sort(set);
		
		if(set == o) {
			return true;
		
		}
		return false;
		
	}
	
	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return this.contains(value);
	}
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest(){
		if(set.isEmpty()) {
			throw new IllegalArgumentException("Set is empty");
		}
		
		int biggest = Collections.max(set);
		return biggest;
	}
	
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() {
		if(set.isEmpty()) {
			throw new IllegalArgumentException("Set is empty");
		}
		
		int smallest = Collections.min(set);
		return smallest;
		
		
		
	}
	
	// Adds an item to the set or does nothing it already there	
	public void add(int item) {
		if(!set.contains(item)) {
			set.add(item);
		}
		
	}
	
	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		if(!set.contains(item)) {
			set.remove(item);
		}

	}
	
	// Set union
	public void union(IntegerSet intSetb) {
		for(Integer item : intSetb.set) {
			if(!set.contains(item)) {
				set.add(item);
			}
		}
	}
	
	// Set intersection, all elements in s1 and s2
	public void intersect(IntegerSet intSetb) {
		List<Integer> intersection = new ArrayList<Integer>();
		
		for (Integer item: set) {
			if(intSetb.set.contains(item)) {
				intersection.add(item);
			}
		}
		set = intersection;
	}
	
	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {
		
		List<Integer> difference = new ArrayList<Integer>();

        for (Integer item : set) {
            if (!intSetb.set.contains(item)) {
                difference.add(item);
            }
        }
        set = difference;
		
	}; 
	
	// Set complement, all elements not in s1
	public void complement(IntegerSet intSetb) {
		
		List<Integer> complement = new ArrayList<Integer>();

        for (Integer item : set) {
            if (!intSetb.set.contains(item)) {
                complement.add(item);
            }
        }
        
        set = complement;
	};
	
	// Returns true if the set is empty, false otherwise
	boolean isEmpty() {
		return set.isEmpty();
	}; 
	
	// Return String representation of your set
	public String toString() {
		return set.toString();
	};









	





	
	

}
