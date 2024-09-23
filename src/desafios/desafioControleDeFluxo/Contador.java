package desafios.desafioControleDeFluxo;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
       Scanner terminal = new Scanner(System.in);
       System.out.print("Digite o primeiro valor: ");
       int parametro1 = terminal.nextInt();
       System.out.print("Digite o segundo valor: ");
       int parametro2 = terminal.nextInt();


        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser MAIOR que o primeiro");
        }

    }
    static void contar(int parametro1,int parametro2) throws ParametrosInvalidosException{
        if (parametro1 >= parametro2){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro2 - parametro1;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero "+i);
        }
    }
}
