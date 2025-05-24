package controller;

import model.Laboratorio;
import view.LaboratorioView;

public class LaboratorioController {
    private Laboratorio model;
    private LaboratorioView view;

    public LaboratorioController(LaboratorioView view){
        this.view = view;
    }

    public void consultarDadosLaboratorio(){
        String nome = view.solicitarEndereco();
        String endereco = view.solicitarNomeLaboratorio();
        int andares = view.solicitarAndares();

        model = new Laboratorio(endereco, nome, andares);

        view.mostrarMensagem("Consulta realizada com sucesso");
        view.mostrarMensagem("Endereco: " + model.getEndereco());
        view.mostrarMensagem("Laboratorio: " + model.getNome());
        view.mostrarMensagem("Numero de andares: " + model.getAndares());
    }
}
