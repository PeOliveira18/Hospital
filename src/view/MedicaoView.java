package view;

import java.time.LocalDate;
import java.util.Scanner;

public class MedicaoView {
    private Scanner scanner = new Scanner(System.in);

    public MedicaoView(){
        scanner = new Scanner(System.in);
    }

    public String solicitarNomePeca(){
        System.out.println("Qual a peça analisada?");
        return scanner.nextLine();
    }

    public String solicitarUnidade(){
        System.out.println("Em qual unidade foi analisada?");
        return scanner.nextLine();
    }

    public int solicitarAreaMedida(){
        System.out.println("Qual area analisada? (em cm)");
        return scanner.nextInt();
    }

    public LocalDate solicitarData(){
        LocalDate data = null;
        while (data == null) {
            try {
                System.out.println("Qual a data de análise? (formato: AAAA-MM-DD)");
                scanner.nextLine(); // limpa o buffer se necessário
                String dataStr = scanner.nextLine();
                data = LocalDate.parse(dataStr); // tenta converter
            } catch (Exception e) {
                System.out.println("Data inválida. Tente novamente no formato correto (AAAA-MM-DD).");
            }
        }
        return data;
    }

    public String solicitarConclusao(){
        System.out.println("Registre a conclusao da medicao: ");
        return scanner.nextLine();
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
