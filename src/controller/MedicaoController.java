package controller;

import model.Medicao;
import view.MedicaoView;

import java.time.LocalDate;

public class MedicaoController {
    private Medicao model;
    private MedicaoView view;

    public MedicaoController(MedicaoView view){
        this.view = view;
    }

    public void registrarMedicao(){
        String peca = view.solicitarNomePeca();
        String unidade = view.solicitarUnidade();
        int areaMedida = view.solicitarAreaMedida();
        LocalDate data = view.solicitarData();
        String conclusao = view.solicitarConclusao();

        model = new Medicao(peca, unidade, areaMedida, data, conclusao);

        view.mostrarMensagem("Medicao Registrada com sucesso!");
        view.mostrarMensagem("Peça medida: " + model.getPeca());
        view.mostrarMensagem("Unidade em que foi medida: " + model.getUnidade());
        view.mostrarMensagem("Area medida: " + model.getAreaMedida());
        view.mostrarMensagem("Data de medicao: " + model.getdata());
        view.mostrarMensagem("Conclusao: " + model.getConclusao());
    }
}
