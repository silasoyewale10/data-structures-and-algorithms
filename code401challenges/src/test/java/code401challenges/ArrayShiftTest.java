package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test public void testArrayShiftCorrectInsertion() {
        int [] feeding = {1,2,3,4,5,6,7};
        int [] correctOutput = {1,2,3,4,8,5,6,7};
        assertArrayEquals(correctOutput,
                ArrayShift.insertShiftArray(feeding, 8));
    }

}