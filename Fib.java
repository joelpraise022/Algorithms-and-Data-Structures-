package DataStructures;

public class fib {
    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 1;

        for(int i=0;i<5;i++){
            int currentNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = currentNum;

            System.out.println(currentNum);
        }
    }
}
