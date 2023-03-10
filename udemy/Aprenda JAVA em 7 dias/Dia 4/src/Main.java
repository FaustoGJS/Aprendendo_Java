public class Main {
    public static void main(String[] args) {
        desafio1();

    }
    public static void desafio1(){
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
}