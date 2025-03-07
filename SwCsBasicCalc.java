import java.util.Scanner;

public class SwCsBasicCalc {
    public static void main(String[] args) {
        double n1, n2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        n1 = inp.nextDouble();
        System.out.print("Enter the Second Number: ");
        n2 = inp.nextDouble();

        System.out.println("Which operation would you like to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");

        int op = inp.nextInt();
        double res;
        switch(op) {
            case 1:
                res = (n1+n2);
                System.out.println("The result is: " + res);
                break;
            case 2:
                res = (n1-n2);
                System.out.println("The result is: " + res);
                break;
            case 3:
                res = (n1*n2);
                System.out.println("The result is: " + res);
                break;
            case 4:
                if(n2==0){
                    System.out.println("The result is Infinite");
                }
                else {
                    res = (n1 / n2);
                    System.out.println("The result is " + res);
                }
                break;
        }
    }
}
