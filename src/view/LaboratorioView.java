package view;

import java.util.Scanner;

public class LaboratorioView {
    private Scanner scanner = new Scanner(System.in);

    public  LaboratorioView(){
        scanner = new Scanner(System.in);
    }

    public String solicitarEndereco(){
        System.out.println("Qual o endereco do laboratorio?");
        return scanner.nextLine();
    }

    public String solicitarNomeLaboratorio(){
        System.out.println("Qual o nome do laboratorio?");
        return scanner.nextLine();
    }

    public int solicitarAndares(){
        System.out.println("QUantos andares?");
        return scanner.nextInt();
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
