package DataStructures;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack(5); 
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.pop();

        int[] allElements = myStack.printAll();
        for(int element : allElements){
            System.out.println(element);
        }
    }
}
