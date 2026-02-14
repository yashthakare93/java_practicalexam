// Write a program to find the second largest element in an array

public class SecondLargestElement{
    public static void main(String[] args){
        int[] arr = {2,4,5,1,6};
        int largest = arr[0];
        int secondLargest = arr[0];
	

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
   
    System.out.println("Second largest element: " + secondLargest);
    }
}