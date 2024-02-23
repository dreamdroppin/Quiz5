import java.util.Scanner;

public class Quiz5 {
    private int sum = 0;//1
    private int numberCount = 0;//2
    public void processNumber(int number) {//3
        sum += number;
        numberCount++;
    }
    public void getInPut() {//4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 100) {
            System.out.println("Invalid number entered");
            return;
        }
        processNumber(number);
    }
    public void showResults(){//5
        if (sum != 0 && numberCount != 0) {
            System.out.println("Sum: " + sum);
            System.out.println("NUmber Count:" + numberCount);
        } else {
            System.out.println("Sum and numberCount are both empty");
        }
    }
}

