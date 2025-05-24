package controller;

import model.Diagnostico;
import model.Paciente;
import view.PacienteView;
import view.DiagnosticoView;


public class PacienteController {
    private Paciente model;
    private PacienteView view;


    public PacienteController(PacienteView view){
        this.view = view;
    }

    public void registrarPaciente(){
        String nome = view.solicitarNomePaciente();
        int idade = view.solicitarIdade();
        int numero = view.solicitarNumero();
        String endereco = view.solicitarEndereco();


        model = new Paciente(nome, idade, numero, endereco);

        view.mostrarMensagem("Paciente registrado com sucesso");
        view.mostrarMensagem("Nome: " + model.getNomePaciente());
        view.mostrarMensagem("Idade: " + model.getIdade());
        view.mostrarMensagem("Numero de telefone: " + model.getNumero());
        view.mostrarMensagem("Endereco: " + model.getEndereco());
    }
}
