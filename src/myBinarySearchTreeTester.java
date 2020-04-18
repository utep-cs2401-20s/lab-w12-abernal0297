import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class myBinarySearchTreeTester {

    /*
     * Test case 1:
     * testNewSort[1, 2, 3]
     */

    @Test
    public void testNewSort1() { //NUMBER 1//
        myBinarySearchTreeNode r = new myBinarySearchTreeNode(new int[]{7, 2, 9});
        r.insert(3);
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(new int[]{7, 2, 3, 9});
        assertEquals(exp.myValue, r.myValue);
        assertEquals(exp.left.myValue, r.left.myValue);
        assertEquals(exp.right.myValue, r.right.myValue);
//        assertNull(r.left.myValue);
    }
//
//    @Test
//    public void testNewSort2() { //NUMBER 1//
//        newSorting sol = new newSorting();
//        int[] A = {3,2,1, 1};
//        int[] result = {1,1,2,3};
//        sol.newSort(A, 4);
//        for(int i:A){
//            System.out.print(i);
//        }
//        assertArrayEquals(result, A);
//    }
//
//    @Test
//    public void testNewSort3() { //NUMBER 1//
//        newSorting sol = new newSorting();
//        int[] A = {3,2,1};
//        int[] result = {1,2,3};
//        sol.newSort(A, 3);
//        for(int i:A){
//            System.out.print(i);
//        }
//        assertArrayEquals(result, A);
//    }
//
//    @Test
//    public void testNewSort4() { //NUMBER 1//
//        newSorting sol = new newSorting();
//        int[] A = {3,2,1};
//        int[] result = {1,2,3};
//        sol.newSort(A, 3);
//        for(int i:A){
//            System.out.print(i);
//        }
//        assertArrayEquals(result, A);
//    }
//
//    @Test
//    public void testNewSort5() { //NUMBER 1//
//        newSorting sol = new newSorting();
//        int[] A = {3,2,1};
//        int[] result = {1,2,3};
//        sol.newSort(A, 3);
//        for(int i:A){
//            System.out.print(i);
//        }
//        assertArrayEquals(result, A);
//    }
}