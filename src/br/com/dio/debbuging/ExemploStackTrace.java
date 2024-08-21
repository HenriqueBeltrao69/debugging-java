package br.com.dio.debbuging;

public class ExemploStackTrace {
    public static void main(String[] args) {
        try {
            metodoA();
        } catch (Exception e) {
            System.err.println("Exceção capturada: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void metodoA() throws Exception {
        metodoB();
    }

    static void metodoB() throws Exception {
        metodoC();
    }

    static void metodoC() throws Exception {
        throw new Exception("Erro intencional para demonstrar stack trace");
    }
}
