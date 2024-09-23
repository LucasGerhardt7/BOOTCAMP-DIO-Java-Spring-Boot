package aula.modulo02_javaBasico.controle_de_fluxo.estrutura_de_repeticao;
import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        /* Joãozinho resolveu ligar para o seu amigo dizendo que hoje se entupiu de comer docinhos: */
        System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	
    }
}

