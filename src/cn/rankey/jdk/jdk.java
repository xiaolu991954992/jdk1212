package cn.rankey.jdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jdk {
    public static void main(String[] args){
//        testArray1();
        System.out.println(10 >>> 1);
    }

    private static void testArray1() {
        String[] arr1 = {"1","2","3"};
        int[] arr2 = {1,2,3};
        Integer[] arr3 = {1,2,3};

        List<String> list1 = Arrays.asList(arr1);
        List<int[]> list2 = Arrays.asList(arr2);
        List<Integer> list3 = Arrays.asList(arr3);

        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println(list3.size());

    }
}
