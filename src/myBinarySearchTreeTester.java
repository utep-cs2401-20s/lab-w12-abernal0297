import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class myBinarySearchTreeTester {

    @Test
    public void testInsert() { //NUMBER 1//
        myBinarySearchTreeNode r = new myBinarySearchTreeNode(new int[]{7, 2, 9});
        r.insert(1);
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(new int[]{7, 1, 2, 9});
        assertEquals(exp.myValue, r.myValue);
        assertEquals(exp.left.myValue, r.left.myValue);
        assertEquals(exp.right.myValue, r.right.myValue);
        //assertNotNull(r.left.myValue);
    }
}