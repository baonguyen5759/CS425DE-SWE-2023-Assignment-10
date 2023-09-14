package edu.mum.cs.cs425;

import java.util.Arrays;

public class ArrayFlattener {
    public int[] flatternArray(int[][] arrays) {
        if (null != arrays) {
            return Arrays.stream(arrays).flatMapToInt(Arrays::stream).toArray();
        }
        return null;
    }
}
