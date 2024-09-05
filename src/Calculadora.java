public class Calculadora {
    public static double PI = 3.14;

    public static void suma(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void suma(int num1, int num2, int num3) {
        System.out.println("PRIMER");
        int resultado = num1 + num2 + num3;
        System.out.println("Resultado: " + resultado);
    }

    public static double suma(double num1, double num2, double num3) {
        System.out.println("Segundo");
        double resultado = num1 + num2 + num3;
        System.out.println("Resultado: " + resultado);
    }
}
