package DataStructures;


public class Stack {
    int size,top;
    int[] array;
    
    
    Stack(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull(){
        return (top== size-1);
    }

    boolean isEmpty(){
        return (top == -1);
    }

    void push(int item){
        if(isFull()){
            System.out.println("Stack Overflow");
        }
        else{
            array[top + 1] = item;
            top++;
        }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
        }
        else {
            top--;
        }
    }

    int[] printAll(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return new int[0];
        }
        else {
            int[] allElements = new int[top + 1];
            for(int i=0;i<=top;i++){
                allElements[i] = array[i];
            }

            return allElements;
        }
        
    }

   
   
}
