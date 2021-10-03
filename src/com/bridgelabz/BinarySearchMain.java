package com.bridgelabz;
public class BinarySearchMain {
    public static void main(String[] args) {
        String[] arr = { "contribute", "geeks", "vanna", "practice" };
        String x = "vanna";
        BinarySearch<String> bs = new BinarySearch<String>();
        int result = bs.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}
