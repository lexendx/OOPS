
public class leetcode {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3};
        int temp = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {

            arr[1] = temp;
            arr[0] = arr[1];
            temp = arr[0];

        }

    }

}
