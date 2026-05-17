

public class Calculo {

    //Variaveis.

    private String operacao = ("");
    private double numero = 0;
    private double numero2 = 0;


    // Gets e Sets.

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    //operação
    public double calcular() {
        switch (operacao) {
            case "+" -> {
                return numero + numero2;
            }
            case "-" -> {
                return numero - numero2;
            }
            case "*" -> {
                return numero * numero2;
            }
            case "/" -> {
                if (numero2 == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                } else {
                    return numero / numero2;
                }
            }
            default -> throw new IllegalArgumentException("Operação inválida." + operacao);
        }
    }
}
