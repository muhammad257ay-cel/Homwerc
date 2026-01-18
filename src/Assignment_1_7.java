/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Assignment_1_7 {
    public void solveQuestion1() {
        //Assignment(1)
        int[] Array = {10, 20, 30, 40, 50};
        
        
        System.out.print("المصفوفة الأصلية: ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    int [] coparry=new int[Array.length];
        for (int i = 0; i < Array.length; i++) {
            coparry[i]=Array[i];
            
        }
         System.out.print("المصفوفة المستنسخة: ");
         for (int i = 0; i < coparry.length; i++) {
             System.out.println( coparry[i]+"===");
            
        }
         System.out.println();
    }
             //Assignment(3)
     public int[] removeSpecificElement(int[] array, int elementToRemove) {

        if (array == null) {
            return null;
        }
        int newSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                newSize++;
            }
        }
        
        int[] newArray = new int[newSize];
        int newIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        
       System.out.print(" - المصفوفة الأصلية: ");
        for (int num : array) System.out.print(num + " ");
        System.out.println("\nelementToRemove: " + elementToRemove);
        System.out.print("=====: ");
        for (int num : newArray) System.out.print(num + " ");
        System.out.println();
        return null;
    }

    void concatlinkdlist(int[] arrayToModify, int[] arrayToModify0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
                
       // ============================================
     //Assignment(5)
   class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
   public Node concatlinkdlist(Node list1,Node list2){
    if(list1 == null){
    return list2;
    }
    if(list2 == null){
    return list1;
    }
    Node current =list1;
    while(current.next!=null){
    current=current.next;
    }
    current.next=list2;
   
    System.out.print("السؤال 5 - القائمة الأولى: ");
       while(list1!=null){
           System.out.println(list1.data);
           list1=list1.next;
       }
        System.out.print("السؤال 5 - القائمة الثانية: ");
         while(list2!=null){
           System.out.println(list2.data);
           list2=list2.next;
       }
        System.out.print("السؤال 5 - القائمة المدمجة: ");
    while(list1!=null){
           System.out.println(list1.data);
           list1=list1.next;
       }
        return list1;
   }
       //Assignment(7)
   public int serchlinkdlist(Node head,int serch){
   if(head == null){
   return -1;
   }
   Node curent=head;
   int pos=0;
   while(curent!=null){
   if(curent.data==serch){
       System.out.println(curent.data+" ------>");
   return pos;
   }
   curent=curent.next;
   pos++;
   }
   
        return -1;
   
   }
   
}
