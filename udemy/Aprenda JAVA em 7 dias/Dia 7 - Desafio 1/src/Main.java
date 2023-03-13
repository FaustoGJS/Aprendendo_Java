import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("digite 3 numeros diferentes");
        System.out.print("digite o 1° numero desejado em seguida pressione ENTER: ");
        num1=input.nextInt();
        System.out.print("digite o 2° numero desejado em seguida pressione ENTER: ");
        num2=input.nextInt();
        System.out.print("digite o 3° numero desejado em seguida pressione ENTER: ");
        num3=input.nextInt();
        System.out.println("você digitou os numeros "+num1+", "+num2+" e "+num3);
    }
}