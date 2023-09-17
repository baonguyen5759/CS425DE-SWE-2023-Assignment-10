package edu.mum.cs.cs425;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ArrayFlattenerTest.class,
        ArrayReversorTest.class
})
public class ArrayReversorTestCases {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ArrayReversorTestCases.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}