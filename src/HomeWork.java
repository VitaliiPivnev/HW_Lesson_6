import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("First LEVEL");
        System.out.println("____________");
        System.out.println("Введите любую цифру ниже:");
        Scanner scaner = new Scanner(System.in);

        int number = scaner.nextInt();
        if (number == 0){
            System.out.println("Ошибок не обнаружено");
        }
        else {
            System.out.println("ERROR");
            System.out.println("ERROR");
            System.out.println("ERROR");
        }
//---------------------------------------------
        System.out.println("Second LEVEL");
        System.out.println("_____________");
        System.out.println("Введите два чмсла которые выпали на рулетке:");

        Scanner scanerA = new Scanner(System.in);
        int firstNumber = scanerA.nextInt();
        int secondNumber = scanerA.nextInt();
        int firstNumberJackPot = 36;
        int secondNumberJackPot = 17;

        if (firstNumber == firstNumberJackPot && secondNumber == secondNumberJackPot){
            System.out.println("JACK POT!!!!");
        }
        if (firstNumber != firstNumberJackPot && secondNumber == secondNumberJackPot){
            System.out.println("Маленький приз!");
        }
        if (firstNumber == firstNumberJackPot && secondNumber != secondNumberJackPot){
            System.out.println("Маленький приз!");
        }
        else if (firstNumber != firstNumberJackPot && secondNumber != secondNumberJackPot) {
            System.out.println("ВСЕ ПРОИГРАЛ!!!");
        }


    }

}
