package aula.modulo02_javaBasico.sintaxeJava;

public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Lucas";

        String segundoNome = "Gerhardt";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
