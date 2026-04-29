package numeros;

import java.util.Scanner;

public class EntradaNumeros {
    public int x;
    public int y;

    public void pedirNumeros(){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
    }
}
