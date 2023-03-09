import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        String valor = moeda.format(135.50);

        System.out.println(valor);
    }
}