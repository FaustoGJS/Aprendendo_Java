package variaveis;

public class Variaveis {
        long num4= 123456789;
        
        //converter inteiro por inteiro
        int converte1 = (int) num2; //converteu normal
        int converte2 = (int) num4; // necessitou de um cast long para int
        byte converte3 =  (byte) num4; //necessitou de um cast long para byte
                
        //tipo caracter
        char valorChar ='a';
        //converter char para tabela ASCII
        int converte = valorChar;
        System.out.println(converte);
        
        //tipo flutuante
        float num5= 4.123f;
        double num6=46.123456;
        
        //tipo booleano
        boolean verdadeiro = true;
        boolean falso = false;
                
        //tipo de variavel n�o primitivo  - s�o objetos
        String frase = "Curso Java";
        Float num7= 4.57f;
        Double num8= 4.52;
        
    }
    
}

