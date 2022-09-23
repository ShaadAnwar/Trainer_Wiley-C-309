package com.dsa.array;

import java.util.Arrays;

//Done
public class ArrayElementRemoval {
	public static void main(String[] args) {
//		type1();
//		type2();
		type3();
		
		
		
	}

	private static void type3() {
		// TODO Auto-generated method stub
	
		int[] arr = new int[]{1,3,3,4,5};
        int j=3;
        System.out.println("Before deletion :" + Arrays.toString(arr));
        int count =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == j){
                count++;

                // shifting elements
                for(int k = i; k < arr.length - 1; k++){
                    arr[k] = arr[k+1];
                }
                i--;
               // break;
            }
        }

        System.out.print("After Deletion :" );
        for(int i = 0; i < arr.length-count; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("Whole array :" + Arrays.toString(arr));

	}

	private static void type2() {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j=3;//element at this index number to delete
        for(int i=0, k=0;i<arr.length;i++){
            if(arr[i]!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));
	}

	private static void type1() {
		// TODO Auto-generated method stub
		 int[] arr = new int[]{1,2,3,4,5};
	        int[] arr_new = new int[arr.length-1];
	        int j=3;
	        for(int i=0, k=0;i<arr.length;i++){
	            if(i!=j){
	                arr_new[k]=arr[i];
	                k++;
	            }
	        }
	        System.out.println("Before deletion :" + Arrays.toString(arr));
	        System.out.println("After deletion :" + Arrays.toString(arr_new));
	}
	

}
