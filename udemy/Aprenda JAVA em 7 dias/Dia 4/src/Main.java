import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        desafio1();
        desafio2();

    }
    public static void desafio1(){
        System.out.println("\n----------------------\nDESAFIO 1");
        System.out.println("\nIMPRIMIR DE 0 ATE 100 APENAS NUMEROS PARES\nSOLUÇÃO 1");
        for (int i = 0;i<=100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println("\n----------------------\nSOLUÇÃO 2");
        for (int i=0;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void desafio2(){
        System.out.println("\n----------------------\nDESAFIO 2");
        System.out.println("imprimir qualquer frase com espaços entre as letras");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        System.out.println("\n"+frase);
        for(int i =0;i < frase.length();i++){
            System.out.print(frase.charAt(i)+" ");
        }
    }
}