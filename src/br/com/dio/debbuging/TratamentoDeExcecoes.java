package br.com.dio.debbuging;

public class TratamentoDeExcecoes {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro: Não é possível dividir por zero.");
        }
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador; // Lança ArithmeticException se denominador for 0
    }
}
