package edu.mum.cs.cs425;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

public class ArrayFlattenerTest {
    @Test
    public void flatternArrayTest1() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] exectedResults = {1, 3, 0, 4, 5, 9};
        Assert.assertArrayEquals(exectedResults, arrayFlattener.flatternArray(input));
    }

    @Test
    public void flatternArrayTest2() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        Assert.assertArrayEquals(null, arrayFlattener.flatternArray(null));
    }
}
