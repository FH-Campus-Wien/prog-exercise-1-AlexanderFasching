package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        String[] rS = {
"         __",
" _(\\    |@@|",
"(__/\\__ \\--/ __",
"   \\___|----|  |   __",
"       \\ }{ /\\ )_ / _\\",
"       /\\__/\\ \\__O (__",
"      (--/\\--)    \\__/",
"      _)(  )(_",
"     `---''---`"

        };
        System.out.println("0123456789012345678901");
        for(String s:rS) {
            System.out.println(s);
        }
    }

    //todo Task 3
    public void sumOfLiterals(){
        char c = 'Z';
        int i1 = 0xface;
        int i2 = 012;
        long l = 80L;
        float f1 = 44e-1f;
        float f2 = 5.5f;
        double d1 = 8.88e1;
        double d2 = 99.9;
        int s = c + i1 + i2 + (int)l + (int)f1 + (int)f2 + (int)d1 + (int)d2;
        System.out.println(s);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + y);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:\nx: " + x + "\ny: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();
        if(n1 > n2)
            System.out.println("n1 > n2");
        else if(n2 > n1)
            System.out.println("n2 > n1");
        else
            System.out.println("n1 == n2");
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int r = scanner.nextInt();
        if(r < 0 || r >= 100000)
            System.out.println("Invalid Revenue");
        else if(r < 20000)
            System.out.println("Poor Sales Revenue");
        else if(r < 50000)
            System.out.println("Average Sales Revenue");
        else if(r < 80000)
            System.out.println("Good Sales Revenue");
        else
            System.out.println("Excellent Sales Revenue");
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int cC = scanner.nextInt();
        String cR;
        switch(cC) {
            case 1:
                cR = "0.01";
                break;
            case 2:
                cR = "0.02";
                break;
            case 3:
                cR = "0.03";
                break;
            case 4:
                cR = "0.04";
                break;
            default:
                cR = "0.0";
        }
        System.out.println("Your Commission Rate was set to " + cR);

    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int y = scanner.nextInt();
        if((y % 4 == 0) && !(y % 100 == 0 && y % 400 != 0) && (y % 400 == 0))
            System.out.println("Leapyear");
        else
            System.out.println("Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int n = scanner.nextInt();
        ArrayList<Integer> nN = new ArrayList<>();

        while(n != 0) {
            nN.add(n % 10);
            n = n / 10;
        }
        int sN = 0;
        for(int i = 0; i < nN.size(); i++) {
            sN += nN.get(i) * Math.pow(10, 2 - i);
        }
        System.out.println(sN);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}