// Write a Java program to swap two numbers with the help of a third variable., Sample Input : 2,3;  Sample Output : 3,2
public class prob04 {
    public static void main(String[] args) {
        int e1, e2, e3;
        e1 = 2;
        e2 = 3;
        System.out.println("Numbers are " + e1 + e2);
        e3 = e1;
        e1 = e2;
        e2 = e3;
        System.out.println("Numbers are " + e1 + e2);
    }
}
