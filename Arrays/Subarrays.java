import java.util.*;
class Subarrays{
    public static void main(String[] args) {
        int arr[]={2,8,2,6,-6,3,2};
        // boolean found=checkKSumSubarray(arr, 5);
        // System.out.println("Found->"+found);
        ArrayList<Integer> res=findKsumSubarray(arr, 5);
        if(res.get(0)==-1){
            System.out.println("Not found");
            return ;
        }
        System.out.println("Res -> [" +res.get(0) + ","+ res.get(1)+"]");
    }
    public static boolean checkKSumSubarray(int arr[],int k){
        HashSet<Integer> mySet=new HashSet<>();
        mySet.add(0);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=sum-k;
            if(mySet.contains(rem)){
                return true;
            }
            mySet.add(sum);
        }
        return false;
    }

    public static ArrayList<Integer>findKsumSubarray(int arr[],int k){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        HashMap<Integer,Integer> myMap=new HashMap<>();
        myMap.put(0,-1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=sum-k;
            if(myMap.containsKey(rem)){
                int strtIdx=myMap.get(rem)+1;
                list.set(0,strtIdx);
                list.add(i);
                break;
            }
            myMap.put(sum,i);
        }
        return list;
    }
}