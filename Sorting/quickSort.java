class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if (low < high) {
            int pi = partition(arr, low, high);  // pi = pivot index

            quickSort(arr, low, pi - 1);  // Left side
            quickSort(arr, pi + 1, high); // Right side
        }
        
    }

    static int partition(int arr[], int low, int high) {
        
        // your code here
        int pivot = arr[high];  // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at the right position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    

}