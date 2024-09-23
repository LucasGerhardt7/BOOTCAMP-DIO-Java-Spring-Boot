package aula.modulo02_javaBasico.controle_de_fluxo.estrutura_condicional;


public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "";

        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }
        }
    }
}
