import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        projeto();
        desafio();
    }

    public static void projeto(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n ------------------\nDia 1 - 1° Projeto \n ------------------\n Calculadora de soma numeros inteiros");
        System.out.print("Digite o primeiro numero: ");
        long num1= entrada.nextLong();
        System.out.print("Digite o segundo numero: ");
        long num2= entrada.nextLong();
        System.out.println("A soma é : "+num1+" + "+num2+" = "+(num1+num2));
    }

    public static void desafio(){
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("\n ------------------\nDia 1 - 1° Desafio \n ------------------\n Calculadora de soma numeros fracionados");
        System.out.print("Digite o primeiro numero: ");
        double num1= Double.parseDouble(entrada2.next());
        System.out.print("Digite o segundo numero: ");
        double num2=  Double.parseDouble(entrada2.next());
        System.out.println("A soma é : "+num1+" + "+num2+" = "+(num1+num2));
    }
}