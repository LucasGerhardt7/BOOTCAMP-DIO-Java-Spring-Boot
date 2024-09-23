package aula.modulo02_javaBasico.controle_de_fluxo.estrutura_de_excecao;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatarCep
        ("12345678");
        } catch (Exception e) {
            System.out.println("O Cep precisa conter 8 números");
        }
       
    }


    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
