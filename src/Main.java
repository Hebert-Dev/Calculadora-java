import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculo calculo = new Calculo();

        while (true) {

            // Terminal teste
            System.out.println("===Calculadora===");
            System.out.println("Digite um número:");
            calculo.setNumero(sc.nextDouble());
            System.out.println("Digite a operação: ");
            calculo.setOperacao(sc.next());
            System.out.println("Digite outro número:");
            calculo.setNumero2(sc.nextDouble());

            try {
                double resultado = calculo.calcular();
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro Matemático: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de Operação: " + e.getMessage());
            }

          }
        }
    }

