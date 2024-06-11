package DataStructures;

public class Swap {
    public static void main(String[] args) {
        int num = 78;
        int anotherNum = 32;

        int newNum = num;
        num = anotherNum;
        anotherNum = num;

        System.out.println(anotherNum);
        System.out.println(num);

    }
}
