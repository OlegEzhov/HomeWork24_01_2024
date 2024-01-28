import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целочисленое число: ");
        int number = scanner.nextInt();
        int resaultOfSqrt = sqrt(number);
        System.out.println("Вашь результат: " + resaultOfSqrt);
        System.out.println("................");

        System.out.println("Введите другое число: ");
        int number1 = scanner.nextInt();
        int resaultOfMulty = multy(number1);
        System.out.println("Вашь результат: " + resaultOfMulty);
        System.out.println(".................");

        System.out.println("Введите число с плавающей точкой: ");
        double number2 = scanner.nextDouble();
        double resaultOfDivision = division(number2);
        System.out.println("Вашь результат: " + resaultOfDivision);
        System.out.println("............");

        System.out.println("Введите число для вычитания: ");
        int number3 = scanner.nextInt();
        int resaultOfSubtractions = subtractions(number3);
        System.out.println("Вашь результат: " + resaultOfSubtractions);
        System.out.println("....................");

        System.out.println("Введите число для деление с остатком: ");
        double number4 = scanner.nextDouble();
        double resaultOfPercent = percent(number4);
        System.out.println("Вашь результат: " + resaultOfPercent);



    }

    public static int sqrt (int number){
        int sqrtResault = number * number;
        return sqrtResault;
    }
    public static int multy (int number1){
        int multyResault = number1 + number1;
        return multyResault;
    }
    public static double division (double number2){
        double divisionResault = number2 / 3.6;
        return divisionResault;
    }

    public static int subtractions(int number3){
        int subtractionsResault = number3 - 5;
        return subtractionsResault;
    }
    public static double percent(double number4){
        double percentResault = number4 % 4.3;
        return percentResault;
    }

}
