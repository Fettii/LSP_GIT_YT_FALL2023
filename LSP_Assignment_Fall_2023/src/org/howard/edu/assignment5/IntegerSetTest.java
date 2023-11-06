package org.howard.edu.assignment5;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class IntegerSetTest {
    @Test
    public void testLength() {
        IntegerSet set = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        assertEquals(3, set.length());
    }
    
    @Test
    public void testClear() {
        IntegerSet set = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        set.clear();
        assertTrue(set.isEmpty());
    }
    

    @Test
    public void testEquals() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        assertTrue(set1.equalsto(set2));
    }

    @Test
    public void testContains() {
        IntegerSet set = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        assertTrue(set.thiscontains(1));
        assertFalse(set.thiscontains(4));
    }

    @Test
    public void testLargest() {
        IntegerSet set = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        assertEquals(3, set.largest());
    }

    @Test
    public void testSmallest() {
        IntegerSet set = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        assertEquals(1, set.smallest());
    }

    @Test
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.thiscontains(1));
    }

    @Test
    public void testRemove() {
        IntegerSet set = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        set.remove(1);
        assertFalse(set.thiscontains(1));
    }

    @Test
    public void testUnion() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
        set1.union(set2);
        assertTrue(set1.thiscontains(4));
        assertTrue(set1.thiscontains(5));
    }

    @Test
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
        set1.intersect(set2);
        assertTrue(set1.thiscontains(3));
        assertFalse(set1.thiscontains(1));
        assertFalse(set1.thiscontains(2));
    }

    @Test
    public void testDiff() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
        set1.diff(set2);
        assertTrue(set1.thiscontains(1));
        assertTrue(set1.thiscontains(2));
        assertFalse(set1.thiscontains(3));
    }

    @Test
    public void testComplement() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
        set1.complement(set2);
        assertTrue(set1.thiscontains(1));
        assertTrue(set1.thiscontains(2));
        assertFalse(set1.thiscontains(3));
    }

    @Test
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testToString() {
        IntegerSet set = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        assertEquals("[1, 2, 3]", set.toString());
    }
}