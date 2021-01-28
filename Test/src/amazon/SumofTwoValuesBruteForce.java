package amazon;


//Question :  Find whether the target sum exists in a given array

public class SumofTwoValuesBruteForce {
    static boolean findSum(int[] array, int target){
       for(int i=0;i<array.length-1;i++){
           for(int j=i+1;j<array.length;j++){
               if(array[i]+ array[j]==target){
                   return true;
               }
           }
       }
        return false;
    }

    public static void main(String[] args) {
        int array[] ={5,2,1,2,8,3,6};
        int value=12;
        System.out.println(findSum(array,value));
    }


}

