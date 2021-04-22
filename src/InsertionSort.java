import java.util.Scanner;

public class InsertionSort {
        public static  void insertionSort(int arr[]){
            for (int i = 1; i < arr.length ; i++) {
                int position=i;
                int temp=arr[position];
                while (position>0&&arr[position-1]>temp){
                    arr[position]=arr[position-1];
                    position--;
                }
                arr[position]=temp;
            }
        }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
