package operacoes;

import numeros.EntradaNumeros;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.pedirNumeros();
        System.out.println(entradaNumeros.x / entradaNumeros.y);
    }
}
