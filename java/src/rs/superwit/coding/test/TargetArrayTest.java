package rs.superwit.coding.test;

import rs.superwit.coding.TargetArray;
import org.junit.Assert;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.*;

class TargetArrayTest {
    @Test
    void getIndicesTest() {
        TargetArray target = new TargetArray();
        int[] result= target.getIndices( new int[] {2,3,4,6,7},6 );
        Assert.assertArrayEquals(new int[]{0,2}, result);


    }
}