import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        variacoes();
    }

    public static void variacoes(){
        System.out.print("Digite um numero para N: ");
        Scanner input = new Scanner(System.in);
        String parImpar;
        String variacao = null;
        int entrada = input.nextInt();
        if(entrada%2==0){
            parImpar="par";
            System.out.println("N é = "+parImpar);
            if(entrada>2&&entrada<=5){
                System.out.println("N é par e está entre 2 e 5, retorna = A");
            }else if(entrada>=6&&entrada<=20){
                System.out.println("N é par e está entre 6 e 20, retorna = B");
            }else if(entrada>=21){
                System.out.println("N é par e está acima de 20, retorna = C");
            }
        }else{
            parImpar="impar";
            System.out.println("N é = "+parImpar);
        }

    }
}