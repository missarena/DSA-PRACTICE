class Operations{
    static void insertElement(int arr[], int n, int x,
                              int pos)
    {
        // shift elements to the right
        // which are on the right side of pos
        for (int i = n - 1; i >= pos; i--)
            arr[i + 1] = arr[i];
        arr[pos] = x;
    }
    

    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]+" ");
        }
    }

    public static void main(String args[]){
      int arr[] = new int[6];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
        int n = 5;
        int x = 10, pos = 2;
       insertElement(arr,n,x,pos);
       n+=1;
       printArr(arr);
       
    }
}
