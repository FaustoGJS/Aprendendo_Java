import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        projeto();
        desafio();

    }

    public static void projeto() {
        array1();
        System.out.println(("-------------------"));
        array2();
    }

    public static void array1() {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Original = " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Ordenada = " + Arrays.toString(my_array1));
    }

    public static void array2() {
        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println("Original = " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Ordenada = " + Arrays.toString(my_array2));
    }

    public static void desafio() {
        int[] megasena = {  (int)Math.round(Math.random() * 100),
                            (int)Math.round(Math.random() * 100),
                            (int)Math.round(Math.random() * 100),
                            (int)Math.round(Math.random() * 100),
                            (int)Math.round(Math.random() * 100),
                            (int)Math.round(Math.random() * 100)};


        System.out.println("-------------------\n Sorteio Megasena : "+Arrays.toString(megasena));
    }
}