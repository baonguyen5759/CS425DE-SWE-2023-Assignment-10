package edu.mum.cs.cs425;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReversor {

    public ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] arrays) {
        if (null != arrays) {
            int[] flatIntArray = arrayFlattenerService.flattenArray(arrays);
            Integer[] integerArrays = Arrays.stream(flatIntArray).boxed().toArray(Integer[]::new);
            Collections.reverse(Arrays.asList(integerArrays));
            return Arrays.stream(integerArrays).mapToInt(Integer::intValue).toArray();
        }
        return null;
    }
}
