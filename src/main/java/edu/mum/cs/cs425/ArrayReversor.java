package edu.mum.cs.cs425;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReversor {

    private final ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] arrays) {
        if (null != arrays) {
            //Integer[] flatArrays = Arrays.stream(arrays).flatMapToInt(Arrays::stream).boxed().toArray(Integer[]::new);
            int[] flatIntArray = arrayFlattenerService.flattenArray(arrays);
            Integer[] integerArrays = Arrays.stream(flatIntArray).boxed().toArray(Integer[]::new);
            Collections.reverse(Arrays.asList(integerArrays));
            return Arrays.stream(integerArrays).mapToInt(Integer::intValue).toArray();
        }
        return null;
    }

    public static void main(String[] args) {
        //int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        //System.out.println(Arrays.toString(new ArrayReversor().reverseArray(input)));
    }
}
