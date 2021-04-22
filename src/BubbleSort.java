public class BubbleSort {

    public static void bubbleSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >i ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
         bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
