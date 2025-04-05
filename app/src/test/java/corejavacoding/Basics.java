

package corejavacoding;

import java.lang.*;

public class Basics {
    
   //insertion sort -
  


   static int[] insertionSort(int[] arr){
      int len = arr.length;
      for(int i = 1 ; i < len ; i++){
         int key = arr[i];
         int j = i-1;

         while(j>=0 && arr[j] > key){
            arr[j+1] = arr[j];
            j--;
         }
         arr[j+1] = key;
      }
      return arr;
   }

   static int[] bubbleSort(int[] arr){
      int size = arr.length;
      for(int i = 0 ; i < size ; i++){
         for(int j = 0 ; j < size-i-1 ; j++){
            if(arr[j]>arr[j+1]){
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
         }
      }
      return arr;
   }

   static int[] selectionSort(int[] arr){
      int len = arr.length;

      for(int i = 0 ; i < len - 1 ; i++){
         int minIndex = i;
         for(int j = i+1 ; j < len - 1 ; j++){
            if(arr[minIndex] > arr[j]){
               j = minIndex;
            }
         }

         int temp = arr[i];
         arr[i] = arr[minIndex];
         arr[minIndex] = temp;
      }
      return arr;
   }

   public static void main(String args[]){

      int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};
      System.out.println("Insertion Sort");
      int[] ans = insertionSort(arr);
      for(int i : ans){
         System.out.print(i+" ");
      }
      System.out.println();
      System.out.println("Bubble Sort");
      int[] bubbleSortAns = bubbleSort(arr);
      for(int i : bubbleSortAns){
         System.out.print(i+" ");
      }

      System.out.println();
      System.out.println("Selection Sort");
      int[] selectionSortAns = selectionSort(arr);
      for(int i : selectionSortAns){
         System.out.print(i+" ");
      }

   }
   
}
