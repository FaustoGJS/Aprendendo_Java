import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        arrayInt();
        arrayString();
        arrayMultidimensionais();
    }
    public static void arrayInt(){
        int[] valor = {80,10,30,20,70}; // array numerico
        System.out.println("\n-----------------------\nlista desordenada = "+ Arrays.toString(valor));
        Arrays.sort(valor); // ordenar valores
        System.out.println("lista ordenada = "+ Arrays.toString(valor));
        System.out.println("existem "+ valor.length +" itens na array");
    }
    public static void arrayString(){
        String[] marcaCarros={"Audi","Ford","Fiat","Volkswagen","Mercedes-Benz","Ferrari","BMW","Tesla"};
        System.out.println("\n-----------------------\nlista desordenada = "+Arrays.toString(marcaCarros));
        Arrays.sort(marcaCarros);
        System.out.println("lista ordenada = "+Arrays.toString(marcaCarros));
        System.out.println("Buscando a 2° marca da lista = "+marcaCarros[1]);
        marcaCarros[1]="X";
        System.out.println("Trocando a 2° marca por X");
        System.out.println(Arrays.toString(marcaCarros));
    }
    public static void arrayMultidimensionais(){
        String[][] marcaCarros={{"Audi","Ford","Fiat","Volkswagen"},{"Mercedes-Benz","Ferrari","BMW","Tesla"}};
        System.out.println("\n-----------------------\nArray multidimensional = "+Arrays.deepToString(marcaCarros));
    }
}