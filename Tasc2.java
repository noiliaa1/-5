import java.util.Scanner;
// задани 2 №3 
public class Tasc2
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        boolean validInput = true;

        System.out.println("Введите a:");
        int a = scanner.nextInt();

        System.out.println("Введите b:");
        int b = scanner.nextInt();

        System.out.println("Введіть x в діапазоні від нул мінус трьох не включно до восьми не включно (-3,8): ");
        int x = scanner.nextInt();

        if (x >= -3 && x < 3) {
            result = Math.sqrt(Math.pow(x, 2) - a); 
        } 
        else if (x == 3) 
        {
            result = 5 * Math.pow(x, 3) - b * x + 3;
        } 
        else if (x > 3 && x < 8) {
            result = Math.cos(x);
        } 
        else {
            System.out.println("Неправильно введене значення Х!");
            validInput = false;
        }

        if (validInput) {
            System.out.println("Відповідь = " + result + "\nПри x = " + x);
        }
        scanner.close();
    }
}