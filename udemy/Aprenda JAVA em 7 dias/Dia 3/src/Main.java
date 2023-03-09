import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            projeto();
        }
        
    public static void projeto() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite qualquer numero: ");
        String value = input.next();

        if (value.length() == 1) {
            System.out.println("Aqui tem " + value.length() + " digito");
        } else if (value.length() > 1 && value.length() <= 4) {
            System.out.println("Aqui tem " + value.length() + " digitos");
        }else{
            System.out.println("Aqui tem 5 ou mais digitos");
        }
    }
}