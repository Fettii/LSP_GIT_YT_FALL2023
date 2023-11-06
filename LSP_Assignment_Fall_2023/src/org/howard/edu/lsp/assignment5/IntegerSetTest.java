package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class IntegerSetTest {
	@Test
	public void testLength() {
	    // Test with an empty set
	    IntegerSet set = new IntegerSet(new ArrayList<>());
	    assertEquals(0, set.length());

	    // Test with a set of size 1
	    set.add(1);
	    assertEquals(1, set.length());

	    // Test with a set of size 3
	    set.add(2);
	    set.add(3);
	    assertEquals(3, set.length());

	    // Test with a larger set
	    for (int i = 4; i <= 100; i++) {
	        set.add(i);
	    }
	    assertEquals(100, set.length());

	    // Test length after removing elements
	    set.remove(1);
	    set.remove(2);
	    assertEquals(98, set.length());

	    // Test length after clearing the set
	    set.clear();
	    assertEquals(0, set.length());
	}
    
	@Test
	public void testClear() {
	    // Test with an empty set
	    IntegerSet set = new IntegerSet(new ArrayList<>());
	    set.clear();
	    assertTrue(set.isEmpty());
	    assertEquals(0, set.length());

	    // Test with a set of size 1
	    set.add(1);
	    set.clear();
	    assertTrue(set.isEmpty());
	    assertEquals(0, set.length());

	    // Test with a set of size 3
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    set.clear();
	    assertTrue(set.isEmpty());
	    assertEquals(0, set.length());

	    // Test with a larger set
	    for (int i = 1; i <= 100; i++) {
	        set.add(i);
	    }
	    set.clear();
	    assertTrue(set.isEmpty());
	    assertEquals(0, set.length());

	    // Test clear after removing elements
	    set.add(1);
	    set.add(2);
	    set.remove(1);
	    set.clear();
	    assertTrue(set.isEmpty());
	    assertEquals(0, set.length());
	}
    

	@Test
	public void testEquals() {
	    // Test with two empty sets
	    IntegerSet set1 = new IntegerSet(new ArrayList<>());
	    IntegerSet set2 = new IntegerSet(new ArrayList<>());
	    assertTrue(set1.equals(set2));

	    // Test with two sets of size 1
	    set1.add(1);
	    set2.add(1);
	    assertTrue(set1.equals(set2));

	    // Test with two sets of size 3
	    set1.add(2);
	    set1.add(3);
	    set2.add(2);
	    set2.add(3);
	    assertTrue(set1.equals(set2));

	    // Test with two sets that have the same elements but in different orders
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 2, 1)));
	    assertTrue(set1.equals(set2));

	    // Test with two sets that have different elements
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(4, 5, 6)));
	    assertFalse(set1.equals(set2));

	    // Test with two sets where one is a subset of the other
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2)));
	    assertFalse(set1.equals(set2));
	}

	@Test
	public void testContains() {
	    // Test with an empty set
	    IntegerSet set = new IntegerSet(new ArrayList<>());
	    assertFalse(set.thiscontains(1));

	    // Test with a set of size 1
	    set.add(1);
	    assertTrue(set.thiscontains(1));
	    assertFalse(set.thiscontains(2));

	    // Test with a set of size 3
	    set.add(2);
	    set.add(3);
	    assertTrue(set.thiscontains(1));
	    assertTrue(set.thiscontains(2));
	    assertTrue(set.thiscontains(3));
	    assertFalse(set.thiscontains(4));

	    // Test with a larger set
	    for (int i = 4; i <= 100; i++) {
	        set.add(i);
	    }
	    for (int i = 1; i <= 100; i++) {
	        assertTrue(set.thiscontains(i));
	    }
	    assertFalse(set.thiscontains(101));

	    // Test contains after removing elements
	    set.remove(1);
	    set.remove(2);
	    assertFalse(set.thiscontains(1));
	    assertFalse(set.thiscontains(2));
	    assertTrue(set.thiscontains(3));
	}
	
	@Test
	public void testLargest() {
	    // Test with an empty set
	    IntegerSet set = new IntegerSet(new ArrayList<>());
	    try {
	        set.largest();
	        fail("Expected an IllegalArgumentException to be thrown");
	    } catch (IllegalArgumentException e) {
	        assertEquals("Set is empty", e.getMessage());
	    }

	    // Test with a set of size 1
	    set.add(1);
	    assertEquals(1, set.largest());

	    // Test with a set of size 3
	    set.add(2);
	    set.add(3);
	    assertEquals(3, set.largest());

	    // Test with a larger set
	    for (int i = 4; i <= 100; i++) {
	        set.add(i);
	    }
	    assertEquals(100, set.largest());

	    // Test largest after removing elements
	    set.remove(100);
	    set.remove(99);
	    assertEquals(98, set.largest());

	    // Test largest after clearing the set
	    set.clear();
	    try {
	        set.largest();
	        fail("Expected an IllegalArgumentException to be thrown");
	    } catch (IllegalArgumentException e) {
	        assertEquals("Set is empty", e.getMessage());
	    }
	}

	@Test
	public void testSmallest() {
	    // Test with an empty set
	    IntegerSet set = new IntegerSet(new ArrayList<>());
	    try {
	        set.smallest();
	        fail("Expected an IllegalArgumentException to be thrown");
	    } catch (IllegalArgumentException e) {
	        assertEquals("Set is empty", e.getMessage());
	    }

	    // Test with a set of size 1
	    set.add(1);
	    assertEquals(1, set.smallest());

	    // Test with a set of size 3
	    set.add(2);
	    set.add(3);
	    assertEquals(1, set.smallest());

	    // Test with a larger set
	    for (int i = 4; i <= 100; i++) {
	        set.add(i);
	    }
	    assertEquals(1, set.smallest());

	    // Test smallest after removing elements
	    set.remove(1);
	    set.remove(2);
	    assertEquals(3, set.smallest());

	    // Test smallest after clearing the set
	    set.clear();
	    try {
	        set.smallest();
	        fail("Expected an IllegalArgumentException to be thrown");
	    } catch (IllegalArgumentException e) {
	        assertEquals("Set is empty", e.getMessage());
	    }
	}

	@Test
	public void testAdd() {
	    // Test with an empty set
	    IntegerSet set = new IntegerSet();
	    assertFalse(set.thiscontains(1));
	    set.add(1);
	    assertTrue(set.thiscontains(1));

	    // Test adding multiple elements
	    set.add(2);
	    set.add(3);
	    assertTrue(set.thiscontains(1));
	    assertTrue(set.thiscontains(2));
	    assertTrue(set.thiscontains(3));

	    // Test adding the same element twice
	    set.add(1);
	    assertTrue(set.thiscontains(1));

	    // Test adding a large number of elements
	    for (int i = 4; i <= 100; i++) {
	        set.add(i);
	    }
	    for (int i = 1; i <= 100; i++) {
	        assertTrue(set.thiscontains(i));
	    }

	    // Test adding elements after clearing the set
	    set.clear();
	    assertFalse(set.thiscontains(1));
	    set.add(1);
	    assertTrue(set.thiscontains(1));
	}

	@Test
	public void testRemove() {
	    // Test with an empty set
	    IntegerSet set = new IntegerSet(new ArrayList<>());
	    assertFalse(set.thiscontains(1));
	    // Do not attempt to remove from an empty set
    

	    // Test removing an element from a set of size 1
	    set.add(1);
	    assertTrue(set.thiscontains(1));
	    set.remove(1);
	    assertFalse(set.thiscontains(1));

	    // Test removing multiple elements
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    assertTrue(set.thiscontains(1));
	    assertTrue(set.thiscontains(2));
	    assertTrue(set.thiscontains(3));
	    set.remove(1);
	    set.remove(2);
	    assertFalse(set.thiscontains(1));
	    assertFalse(set.thiscontains(2));
	    assertTrue(set.thiscontains(3));

	    // Test removing the same element twice
	    set.add(2);
	    set.remove(2);
	    assertFalse(set.thiscontains(2));
	    // Do not attempt to remove the same element twice

	    // Test removing a large number of elements
	    for (int i = 4; i <= 100; i++) {
	        set.add(i);
	    }
	    for (int i = 4; i <= 100; i++) {
	        assertTrue(set.thiscontains(i));
	        set.remove(i);
	        assertFalse(set.thiscontains(i));
	    }

	    // Test removing elements after clearing the set
	    set.add(1);
	    set.clear();
	    assertFalse(set.thiscontains(1));
	    // Do not attempt to remove from a cleared set
	}

	@Test
	public void testUnion() {
	    // Test with two empty sets
	    IntegerSet set1 = new IntegerSet(new ArrayList<>());
	    IntegerSet set2 = new IntegerSet(new ArrayList<>());
	    set1.union(set2);
	    assertTrue(set1.isEmpty());

	    // Test with one empty set
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>());
	    set1.union(set2);
	    assertTrue(set1.thiscontains(1));
	    assertTrue(set1.thiscontains(2));
	    assertTrue(set1.thiscontains(3));

	    // Test with two sets with some common elements
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
	    set1.union(set2);
	    assertTrue(set1.thiscontains(1));
	    assertTrue(set1.thiscontains(2));
	    assertTrue(set1.thiscontains(3));
	    assertTrue(set1.thiscontains(4));
	    assertTrue(set1.thiscontains(5));

	    // Test with two sets with no common elements
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(4, 5, 6)));
	    set1.union(set2);
	    assertTrue(set1.thiscontains(1));
	    assertTrue(set1.thiscontains(2));
	    assertTrue(set1.thiscontains(3));
	    assertTrue(set1.thiscontains(4));
	    assertTrue(set1.thiscontains(5));
	    assertTrue(set1.thiscontains(6));

	    // Test with two large sets
	    set1 = new IntegerSet(new ArrayList<>());
	    set2 = new IntegerSet(new ArrayList<>());
	    for (int i = 1; i <= 100; i++) {
	        set1.add(i);
	        set2.add(i + 100);
	    }
	    set1.union(set2);
	    for (int i = 1; i <= 200; i++) {
	        assertTrue(set1.thiscontains(i));
	    }
	}

	@Test
	public void testIntersect() {
	    // Test with two empty sets
	    IntegerSet set1 = new IntegerSet(new ArrayList<>());
	    IntegerSet set2 = new IntegerSet(new ArrayList<>());
	    set1.intersect(set2);
	    assertTrue(set1.isEmpty());

	    // Test with one empty set
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>());
	    set1.intersect(set2);
	    assertTrue(set1.isEmpty());

	    // Test with two sets with some common elements
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
	    set1.intersect(set2);
	    assertFalse(set1.thiscontains(1));
	    assertFalse(set1.thiscontains(2));
	    assertTrue(set1.thiscontains(3));
	    assertFalse(set1.thiscontains(4));
	    assertFalse(set1.thiscontains(5));

	    // Test with two sets with no common elements
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(4, 5, 6)));
	    set1.intersect(set2);
	    assertTrue(set1.isEmpty());

	    // Test with two large sets
	    set1 = new IntegerSet(new ArrayList<>());
	    set2 = new IntegerSet(new ArrayList<>());
	    for (int i = 1; i <= 100; i++) {
	        set1.add(i);
	        set2.add(i + 50);
	    }
	    set1.intersect(set2);
	    for (int i = 1; i <= 50; i++) {
	        assertFalse(set1.thiscontains(i));
	    }
	    for (int i = 51; i <= 100; i++) {
	        assertTrue(set1.thiscontains(i));
	    }
	}

	@Test
	public void testDiff() {
	    // Test with two empty sets
	    IntegerSet set1 = new IntegerSet(new ArrayList<>());
	    IntegerSet set2 = new IntegerSet(new ArrayList<>());
	    set1.diff(set2);
	    assertTrue(set1.isEmpty());

	    // Test with one empty set
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>());
	    set1.diff(set2);
	    assertTrue(set1.thiscontains(1));
	    assertTrue(set1.thiscontains(2));
	    assertTrue(set1.thiscontains(3));

	    // Test with two sets with some common elements
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
	    set1.diff(set2);
	    assertTrue(set1.thiscontains(1));
	    assertTrue(set1.thiscontains(2));
	    assertFalse(set1.thiscontains(3));
	    assertFalse(set1.thiscontains(4));
	    assertFalse(set1.thiscontains(5));

	    // Test with two sets with no common elements
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(4, 5, 6)));
	    set1.diff(set2);
	    assertTrue(set1.thiscontains(1));
	    assertTrue(set1.thiscontains(2));
	    assertTrue(set1.thiscontains(3));
	    assertFalse(set1.thiscontains(4));
	    assertFalse(set1.thiscontains(5));
	    assertFalse(set1.thiscontains(6));

	    // Test with two large sets
	    set1 = new IntegerSet(new ArrayList<>());
	    set2 = new IntegerSet(new ArrayList<>());
	    for (int i = 1; i <= 100; i++) {
	        set1.add(i);
	        set2.add(i + 50);
	    }
	    set1.diff(set2);
	    for (int i = 1; i <= 50; i++) {
	        assertTrue(set1.thiscontains(i));
	    }
	    for (int i = 51; i <= 100; i++) {
	        assertFalse(set1.thiscontains(i));
	    }
	}

	@Test
	public void testComplement() {
	    // Test with two empty sets
	    IntegerSet set1 = new IntegerSet(new ArrayList<>());
	    IntegerSet set2 = new IntegerSet(new ArrayList<>());
	    set1.complement(set2);
	    assertTrue(set1.isEmpty());

	    // Test with one empty set
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>());
	    set1.complement(set2);
	    assertTrue(set1.thiscontains(1));
	    assertTrue(set1.thiscontains(2));
	    assertTrue(set1.thiscontains(3));

	    // Test with two sets with some common elements
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
	    set1.complement(set2);
	    assertTrue(set1.thiscontains(1));
	    assertTrue(set1.thiscontains(2));
	    assertFalse(set1.thiscontains(3));
	    assertFalse(set1.thiscontains(4));
	    assertFalse(set1.thiscontains(5));

	    // Test with two sets with no common elements
	    set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
	    set2 = new IntegerSet(new ArrayList<>(Arrays.asList(4, 5, 6)));
	    set1.complement(set2);
	    assertTrue(set1.thiscontains(1));
	    assertTrue(set1.thiscontains(2));
	    assertTrue(set1.thiscontains(3));
	    assertFalse(set1.thiscontains(4));
	    assertFalse(set1.thiscontains(5));
	    assertFalse(set1.thiscontains(6));

	    // Test with two large sets
	    set1 = new IntegerSet(new ArrayList<>());
	    set2 = new IntegerSet(new ArrayList<>());
	    for (int i = 1; i <= 100; i++) {
	        set1.add(i);
	        set2.add(i + 50);
	    }
	    set1.complement(set2);
	    for (int i = 1; i <= 50; i++) {
	        assertTrue(set1.thiscontains(i));
	    }
	    for (int i = 51; i <= 100; i++) {
	        assertFalse(set1.thiscontains(i));
	    }
	}

	@Test
	public void testIsEmpty() {
	    // Test with an empty set
	    IntegerSet set = new IntegerSet(new ArrayList<>());
	    assertTrue(set.isEmpty());

	    // Test with a set that has one element
	    set.add(1);
	    assertFalse(set.isEmpty());

	    // Test with a set that has multiple elements
	    set.add(2);
	    set.add(3);
	    assertFalse(set.isEmpty());

	    // Test after removing an element
	    set.remove(1);
	    assertFalse(set.isEmpty());

	    // Test after removing all elements
	    set.remove(2);
	    set.remove(3);
	    assertTrue(set.isEmpty());

	    // Test with a large set
	    for (int i = 1; i <= 100; i++) {
	        set.add(i);
	    }
	    assertFalse(set.isEmpty());

	    // Test after clearing a large set
	    for (int i = 1; i <= 100; i++) {
	        set.remove(i);
	    }
	    assertTrue(set.isEmpty());
	}

	@Test
	public void testToString() {
	    // Test with an empty set
	    IntegerSet set = new IntegerSet(new ArrayList<>());
	    assertEquals("[]", set.toString());

	    // Test with a set that has one element
	    set.add(1);
	    assertEquals("[1]", set.toString());

	    // Test with a set that has multiple elements
	    set.add(2);
	    set.add(3);
	    assertEquals("[1, 2, 3]", set.toString());

	    // Test after removing an element
	    set.remove(1);
	    assertEquals("[2, 3]", set.toString());

	    // Test after removing all elements
	    set.remove(2);
	    set.remove(3);
	    assertEquals("[]", set.toString());

	    // Test with a large set
	    StringBuilder sb = new StringBuilder("[");
	    for (int i = 1; i <= 100; i++) {
	        set.add(i);
	        sb.append(i);
	        if (i != 100) {
	            sb.append(", ");
	        }
	    }
	    sb.append("]");
	    assertEquals(sb.toString(), set.toString());
	}
	
}