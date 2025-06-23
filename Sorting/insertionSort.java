public class insertionSort {

    // Make printArr static so it can be called from main
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 3, 26, 8};

        // finding out correct pos to insert
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=curr;
        }

        // Call static print method
        printArr(arr);
    }
}
