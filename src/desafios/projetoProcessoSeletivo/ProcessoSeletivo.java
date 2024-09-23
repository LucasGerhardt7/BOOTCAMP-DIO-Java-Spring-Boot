package desafios.projetoProcessoSeletivo;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","LUCAS","LETICIA","JOÃO","MARISA"};
          for (String candidato : candidatos) {
            entrandoEmContato(candidato);
          }

    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do {
            atendeu = atender();
            continuarTentando= !atendeu;// A variavel continuarTentando será o oposto da variavel atendeu
            if (continuarTentando) {
                tentativasRealizadas++;
            }
        } while (continuarTentando && tentativasRealizadas<3);
        
        if (atendeu) {
            System.out.println("conseguimos contato com "+candidato+" na "+tentativasRealizadas+" tentativa");
        }else{
        System.out.println("Não conseguimos contato com "+candidato+", número máximo de "+tentativasRealizadas+" realizadas");
        }
    }
 
    static boolean atender(){
        return new Random().nextInt(3)==1;//Gera número aleatório e caso seja ==1, retornará TRUE
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","LUCAS","LETICIA","JOÃO","MARISA"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length;indice++){
            System.out.println("O candidato de nº "+(indice+1)+" é: "+candidatos[indice]);
        }

        System.out.println("Forma abreviada com foreach(não conseguimos pegar o indice)");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","LUCAS","LETICIA","JOÃO","MARISA","TONY","FABIO","CÉSAR","ADRIANO","HENRIQUE","BRENO","ISA","WESLEY","FRASÃO","JU","VERONICA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        String [] selecionados = new String[5];
        int posicao = 0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o seguinte valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                selecionados[posicao] = candidato;
                posicao++;
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        System.out.println(selecionados);
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double  salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidados");        }
    }
}
