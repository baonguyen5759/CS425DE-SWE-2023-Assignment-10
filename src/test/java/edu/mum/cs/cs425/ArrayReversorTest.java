package edu.mum.cs.cs425;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArrayReversorTest {

    @Test
    public void reverseArrayTest1() {
        ArrayFlattenerService arrayFlattenerService = Mockito.mock(ArrayFlattenerService.class);
        Assert.assertNotNull(arrayFlattenerService);

        int[] flattenResults = {1, 3, 0, 4, 5, 9};
        Mockito.when(arrayFlattenerService.flattenArray(Mockito.any())).thenReturn(flattenResults);

        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] finalResults = {9, 5, 4, 0, 3, 1};

        ArrayReversor arrayReversor = new ArrayReversor(arrayFlattenerService);
        int[] result = arrayReversor.reverseArray(input);
        Assert.assertArrayEquals(finalResults, result);
    }

    @Test
    public void reverseArrayTest2() {
        ArrayFlattenerService arrayFlattenerService = Mockito.mock(ArrayFlattenerService.class);
        Assert.assertNotNull(arrayFlattenerService);

        ArrayReversor arrayReversor = new ArrayReversor(arrayFlattenerService);
        int[] result = arrayReversor.reverseArray(null);

        Assert.assertArrayEquals(null, arrayReversor.reverseArray(null));
    }
}
