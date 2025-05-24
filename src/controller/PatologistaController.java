package controller;

import model.Patologista;
import view.PatologistaView;

public class PatologistaController {
    private Patologista model;
    private PatologistaView view;

    public PatologistaController(PatologistaView view){
        this.view = view;
    }

    public void logarPatologista(){
        String nome = view.solicitarNome();
        int idade = view.solicitarIdade();
        int tempoArea = view.solicitarTempoArea();

        model = new Patologista(nome, idade, tempoArea);

        view.mostrarMensagem("Patologista logado com sucesso");
        view.mostrarMensagem("Patologista: " + model.getNome());
        view.mostrarMensagem("Idade: " + model.getIdade());
        view.mostrarMensagem("Tempo atuante: " + model.getTempo_area());
    }
}
