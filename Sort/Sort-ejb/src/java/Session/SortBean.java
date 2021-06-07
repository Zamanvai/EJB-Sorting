/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import javax.ejb.Stateless;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
@Stateless
public class SortBean implements SortBeanRemote {
int n=5;
    int[]arr=new int[n];
     int temp ;    
      int bubble ;  
    
    public SortBean(){
        Scanner input= new Scanner(System.in);
        System.out.println("Please input "+ n + " numbers:");
        
        for(int lst=0; lst<arr.length; lst++){
            arr[lst]= input.nextInt();
        }
         
              
        System.out.println("Ascending sort: "+Integer.toString(ascendingSort(arr)) );    
        System.out.println("Bubble sort: "+Integer.toString(bubbleSort(arr)) );    
       
   
    }    
     public int ascendingSort(int[]arr) {
        temp=0;
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }   
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }  
         return temp ;
           }
     public int bubbleSort(int[]arr){
         bubble=0;
            for(int i=0; i < arr.length; i++){  
                 for(int j=0; j < (arr.length-i-1); j++){  
                          if(arr[j+1] > arr[j]){  
                                 
                                 bubble = arr[j+1];  
                                 arr[j+1] = arr[j];  
                                 arr[j] = bubble;  
                         }  
                          
                 }  
         } 
            for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                } 
            return bubble;
     }
     public static void main(String[] args){
        SortBean sort = new SortBean();
    }
}    
  
    
