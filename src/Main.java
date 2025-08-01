import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner malongScanner = new Scanner(System.in);

        int totalNumber = 0;
        int number;

        for (int i = 1; i <= 5 ; i++){
            System.out.println("enter number " +i + ": ");
            number = malongScanner.nextInt();
            totalNumber += number;
        }

        System.out.println(" ");
        System.out.println("total number is " + totalNumber);


    }
}


