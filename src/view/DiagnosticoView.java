package view;
import model.Diagnostico;

import java.util.Scanner;

public class DiagnosticoView {

    private Scanner scanner = new Scanner(System.in);

    public DiagnosticoView(){
        scanner = new Scanner(System.in);
    }

    public String solicitarDoenca(){
        System.out.println("Digite o nome da doenca: ");
        return scanner.nextLine();
    }

    public String solicitarDescricao(){
        System.out.println("Digite a descrição: ");
        return scanner.nextLine();
    }

    public String solicitarPatologistaResponsavel(){
        System.out.println("Digite o nome do patologista responsavel: ");
        return scanner.nextLine();
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
