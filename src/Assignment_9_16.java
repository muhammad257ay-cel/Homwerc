/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Assignment_9_16 {
    public int[] removeAtPositionAndPrint(int[] arr, int position){
if(position <1||position>arr.length){
    System.out.println("not found");
    return arr;
}
int[]newarry=new int[arr.length-1];
int index=0;
    for (int i = 0; i <arr.length; i++) {
        if(i!=position-1){
        newarry[index]=arr[i];
        index++;
        }   
    }
    System.out.println("===="+position+"===");
    for (int i = 0; i < newarry.length; i++) {
        System.out.println(" newarry[i];"+ newarry[i]);
        System.out.println();
        
    }
    return newarry;


}
        //Assignment(11)
public void reversarry(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.println(" arr[i]===="+ arr[i]);  
    }
    System.out.println("reversarry");
    for (int i =arr.length-1; i>=0; i--) {
        System.out.println("reversarry=="+ arr[i]);
        System.out.println();
    }
}
             //Assignment(13)
public int[] insertAtPositionAndPrint(int[] arr, int position,int value){
if(position <1||position>arr.length+1){
    System.out.println("not found");
    return arr;
}
int[]newarry=new int[arr.length+1];
int index=0;
    for (int i = 0; i <arr.length; i++) {
        if(i==position+1){
        newarry[index]=value;
        index++;
        }  
        newarry[index]=arr[i];
        index++;
    }
    if(position==arr.length+1){
    newarry[newarry.length-1]=value;
    }
    System.out.println("===="+value+"===");
    for (int i = 0; i < newarry.length; i++) {
        System.out.println(" newarry[i]="+ newarry[i]);
        System.out.println();
        
    }
    return newarry;
}
public void serchPositionAndPrint(int[] arr, int terget){
    for (int i = 0; i < arr.length; i++) {
   if(arr[i]==terget) {
       System.out.println("elmn="+terget+"loc"+(i+1));
       return;
   }    
    }
    System.out.println("elmn"+terget+"  not found"); 
}
}
