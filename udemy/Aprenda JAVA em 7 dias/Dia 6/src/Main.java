import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        car.setMarca(input.nextLine());
        System.out.print("Digite o modelo do carro: ");
        car.setModelo(input.nextLine());
        System.out.print("Digite o ano do carro:");
        car.setAno(input.nextInt());
        System.out.print("Digite a tabela Fipe do carro: ");
        car.setValor(input.nextDouble());
        System.out.print("Digite a porcentagem de negociação: ");
        car.setPorcentagem(input.nextDouble());
        car.value();
    }
}