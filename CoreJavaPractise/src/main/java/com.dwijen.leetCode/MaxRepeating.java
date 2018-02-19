package com.dwijen.leetCode;

public class MaxRepeating {

    static int worstSolution(int arr[]){
        int i,j, max = 0,maxcount =0, count = 0;
        for( i = 0; i< arr.length ; i++){
            count = 0;
            for(j = 1; j< arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                    if(count > maxcount){
                        maxcount = count;
                        max = arr[j];
                    }
                }
            }

        }

        return max;
    }
    static int maxRepeating(int arr[], int n, int k)
    {
        // Iterate though input array, for every element
        // arr[i], increment arr[arr[i]%k] by k
        for (int i = 0; i< n; i++)
            arr[(arr[i]%k)] = arr[(arr[i]%k)] +k;

        // Find index of the maximum repeating element
        int max = arr[0], result = 0;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                result = i;
            }
        }

        /* Uncomment this code to get the original array back
        for (int i = 0; i< n; i++)
          arr[i] = arr[i]%k; */

        // Return index of the maximum element
        return result;
    }

    /*Driver function to check for above function*/
    public static void main (String[] args)
    {

        int arr[] = {1,1,1,2,2,2,2,2};
        int n = arr.length;
        int k=8;
        System.out.println("Maximum repeating element is: " +
                maxRepeating(arr,n,k));

        /*System.out.println("Maximum repeating element is: " +
                worstSolution(arr));*/
    }
}
