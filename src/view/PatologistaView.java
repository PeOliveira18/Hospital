package view;

import model.Patologista;

import java.util.Scanner;

public class PatologistaView {
    private Scanner scanner = new Scanner(System.in);

    public PatologistaView(){
        scanner = new Scanner(System.in);
    }

    public String solicitarNome(){
        System.out.println("Digite o nome do Patologista");
        String nome = scanner.nextLine();
        scanner.nextLine();
        return nome;
    }

    public int solicitarIdade(){
        System.out.println("Digite a idade do patologista");
        int idade = scanner.nextInt();
        scanner.nextLine();
        return idade;
    }

    public int solicitarTempoArea(){
        System.out.println("Digite o tempo de area");
        return scanner.nextInt();
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
