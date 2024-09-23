package aula.modulo02_javaBasico.controle_de_fluxo.estrutura_condicional;

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a nota: ");
        int nota = scanner.nextInt();
        scanner.nextLine();

        /* IF */
        if (nota >= 7) {
            System.out.println("Aprovado!");
        
        }else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação!");
        }
        else{
            System.out.println("Reprovado!");
        }

        /* Operador ternário */
        String resultado_testando_operacao_ternaria = nota >= 7 ? "Aprovado!!!" : nota >=5 && nota <7 ?"Recuperação!!!" : "Reprovado!!!";

        System.out.println(resultado_testando_operacao_ternaria);

        
    }
}
