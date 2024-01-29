public class Print_maximum_differrence {
    public static void main(String[] args) {
        int arr[] = { 33, 11, 44, 11, 56, 45, 113, 67 };
        // System.out.println("Maximum Difference is " +
        // Print_maximum_differrence(arr));

        Print_maximum_differrence(arr);
    }

    public static void Print_maximum_differrence(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println("Max differrence is " + (max - min));
    }
}
