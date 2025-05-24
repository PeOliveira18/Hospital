package view;

import java.util.Scanner;

public class PacienteView {
    private Scanner scanner = new Scanner(System.in);

    public PacienteView(){
        scanner = new Scanner(System.in);
    }

    public String solicitarNomePaciente(){
        System.out.println("Qual o nome do paciente?");
        return scanner.nextLine();
    }

    public int solicitarIdade(){
        System.out.println("Qual a idade do paciente?");
        return scanner.nextInt();
    }

    public int solicitarNumero(){
        System.out.println("Qual o numero de telefone do paciente?");
        return scanner.nextInt();
    }

    public String solicitarEndereco(){
        System.out.println("Qual o endereco do paciente?");
        return scanner.nextLine();
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
