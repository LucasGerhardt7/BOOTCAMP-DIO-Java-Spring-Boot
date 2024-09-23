package aula.modulo02_javaBasico.controle_de_fluxo.estrutura_de_repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        /* O break interrompe o laço de repetição */
        System.out.println("BREAK");
        for(int numero = 1; numero <=5; numero ++){
            if (numero ==3) {
                break;
            }
            System.out.println(numero);
        }
        /* O continue interrompe a iteração */
        System.out.println("CONTINUE");
        for(int numero = 1; numero <=5; numero ++){
            if (numero ==3) {
                continue;
            }
            System.out.println(numero);
        }
    }
}
