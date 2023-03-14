import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2,operador;

        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um operador \n1-soma\n2-subtração\n3-multiplicação\n4-divisão");
        operador=input.nextInt();


        System.out.print("digite o primeiro numero: ");
        num1=input.nextInt();

        System.out.print("digite o segundo numero: ");
        num2=input.nextInt();
        calculadora(num1,operador,num2);

    }

    public static void calculadora(Integer num1,Integer operador, Integer num2){
        if(operador==1){
            System.out.println("Resultado: "+num1+"+"+num2+"="+(num1+num2));
        }
        else if(operador==2){
            System.out.println("Resultado: "+num1+"-"+num2+"="+(num1-num2));
        }
        else if(operador==3){
            System.out.println("Resultado: "+num1+"*"+num2+"="+(num1*num2));
        }
        else if(operador==4){
            System.out.println("Resultado: "+num1+"/"+num2+"="+(num1/num2));
        }
    }
}