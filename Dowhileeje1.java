import java.util.Scanner;
public class Dowhileeje1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
    
        System.out.println("Orden ascendente:");
        i = 0;
        do {
            int v;
            v = numero * i;
            System.out.println( numero+ "*"+ i+ "="+ v);
            i++;
        } while (i <= 10);
    
        System.out.println("\nOrden descendente:");
        i = 10;
        while (i >= 0) {
            int c;
            c = numero * i;
            System.out.println( numero+ "*"+ i+ "="+ c);
            i--;
        }
    
    }
}
