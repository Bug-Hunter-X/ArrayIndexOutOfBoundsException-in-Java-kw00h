public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10; // Properly iterate through the array
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}