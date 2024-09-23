package laboratorio;


import java.util.Scanner;

public class DiagnosticoPraticandoMetodos {
    boolean dorPeito = false;
    boolean faltaAr = false;
    boolean dorAbdominal = false;
    boolean erupcaoCutanea = false;
    boolean confusaoMental = false;
    boolean perdaPesoInexplicada = false;
    boolean febre = false;
    boolean nausea = false;
    boolean dorArticulacoes = false;
    boolean dorCabecaSevera = false;
    boolean visaoTurva = false;
    boolean sedeExcessiva = false;
    boolean miccaoFrequente = false;

    int sintomas = 0;

    public static void main(String[] args) {
        DiagnosticoPraticandoMetodos diagnosticoPraticandoMetodos = new DiagnosticoPraticandoMetodos();
        
        diagnosticoPraticandoMetodos.diagnosticoFormatado();
        diagnosticoPraticandoMetodos.assistente();
        System.out.println("Sintomas: "+diagnosticoPraticandoMetodos.contarSintomas());
       
    }

    public void assistente(){
        Scanner scanner = new Scanner(System.in);
        int resposta;
        String mensagem;

        boolean continuarAssistente = true;
        boolean repeteSintomas;
        while (continuarAssistente) {
            System.out.println("Olá, em uma escala de 0 a 5, como você está?");
            resposta = scanner.nextInt();

            mensagem = (resposta >= 3) ? "Você está saudável 😀" : "Parece que você não está muito bem 😕";
            System.out.println(mensagem);

            do {
                if (resposta < 3) {
                System.out.println("Você possúi alguns dos sintomas abaixo? responda sim ou não");

                /* 
                 * Neste bloco estou pegando a resposta do usuário e utilizando o método equalIgnoreCase para verificar se a resposta do usuário é sim.
                 * Caso a resposta seja sim, a variável receberá o valor true, caso seja qualquer outra coisa, o método retornará false.
                 */
                System.out.print("Dor no peito: ");
                dorPeito = scanner.next().equalsIgnoreCase("sim");// scanner retorna resposta do usuário, caso seja sim (sem considerar letras maiusculas ou minusculas), o resultado será true.

                System.out.print("Falta de ar: ");
                faltaAr = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Dor abdominal: ");
                dorAbdominal = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Erupção cutânea: ");
                erupcaoCutanea = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Confusão mental: ");
                confusaoMental = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Perda de peso inexplicada: ");
                perdaPesoInexplicada = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Febre: ");
                febre = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Náusea: ");
                nausea = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Dor nas articulações: ");
                dorArticulacoes = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Dor de cabeça severa: ");
                dorCabecaSevera = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Visão turva: ");
                visaoTurva = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Sede excessiva: ");
                sedeExcessiva = scanner.next().equalsIgnoreCase("sim");

                System.out.print("Micção frequente: ");
                miccaoFrequente = scanner.next().equalsIgnoreCase("sim");

            }
            contarSintomas();
            System.out.println("Você está com "+sintomas+" sintomas.");
            System.out.print("confirmar?(S/N): ");
            repeteSintomas = scanner.next().equalsIgnoreCase("n");
            
            } while (repeteSintomas);
            
            continuarAssistente = false;
        }
        diagnosticoFormatado();

    }

    public int contarSintomas() {
        sintomas = 0;
        
        if (this.dorPeito) sintomas++;
        if (this.faltaAr) sintomas++;
        if (this.dorAbdominal) sintomas++;
        if (this.erupcaoCutanea) sintomas++;
        if (this.confusaoMental) sintomas++;
        if (this.perdaPesoInexplicada) sintomas++;
        if (this.febre) sintomas++;
        if (this.nausea) sintomas++;
        if (this.dorArticulacoes) sintomas++;
        if (this.dorCabecaSevera) sintomas++;
        if (this.visaoTurva) sintomas++;
        if (this.sedeExcessiva) sintomas++;
        if (this.miccaoFrequente) sintomas++;

        return sintomas;
    }
    
    public void diagnosticoFormatado() {
        System.out.println(diagnostico());
        mensagemConsultaMedico();
    }

    public String diagnostico(){
       

        if(this.dorPeito && this.faltaAr){
                return 
                "\n" + "Possíveis condições:\n" + "\n"+
                "Angina ou Infarto do Miocárdio: Dor no peito associada à falta de ar pode indicar um problema cardíaco grave.\n" + 
                "Pneumonia: Falta de ar acompanhada de dor no peito pode ser um sinal de infecção pulmonar."; 
        }else if (this.dorAbdominal && this.febre && this.nausea){
            return
                "\n" + "Possíveis condições:\n" + "\n"+
                "Apendicite: Dor intensa no abdômen, especialmente no lado inferior direito, associada a febre e náusea, pode indicar apendicite." + "\n"+
                "Colecistite: Inflamação da vesícula biliar pode causar dor abdominal, febre e náusea.";
        } else if (this.erupcaoCutanea && this.febre && this.dorArticulacoes) {
            return 
                "\n" + "Possíveis condições:\n" + "\n" +
                "Varicela: Erupção cutânea associada a febre e dor no corpo pode ser um sinal de infecção por varicela.\n" + 
                "Lúpus: Pode causar erupções na pele, febre e dor nas articulações.";
        } else if (this.confusaoMental && this.dorCabecaSevera && this.visaoTurva) {
            return 
                "\n" + "Possíveis condições:\n" + "\n" +
                "Derrame (AVC): Confusão mental súbita acompanhada de dor de cabeça intensa e problemas de visão pode ser um sinal de um derrame.\n" +
                "Hipoglicemia severa: Baixos níveis de açúcar no sangue podem causar confusão, dor de cabeça e alterações na visão.";
        } else if (this.perdaPesoInexplicada && this.sedeExcessiva && this.miccaoFrequente) {
            return 
                "\n" + "Possíveis condições:\n" + "\n" +
                "Diabetes Mellitus: Esses sintomas são característicos de diabetes, especialmente em casos de glicose descontrolada.\n" +
                "Hipertireoidismo: A perda de peso associada a aumento do apetite pode indicar uma tireoide hiperativa.";
        }
        return "Sem diagnóstico definido. Por favor, consulte seu médico para mais detalhes.";
    }

    public void mensagemConsultaMedico(){
        System.out.println(
            "\n"+
            "Esse programa é apenas um teste, se estiver com algum desses sintomas, consulte seu médico!"+"\n");
    }
}


