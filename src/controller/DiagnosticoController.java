package controller;
import model.Diagnostico;
import view.DiagnosticoView;



public class DiagnosticoController {
    private Diagnostico modelDiagnostico;
    private DiagnosticoView viewDiagnostico;

    public DiagnosticoController(DiagnosticoView viewDiagnostico){
        this.viewDiagnostico = viewDiagnostico;
    }

    public void registrarDiagnostico(){
        String doenca = viewDiagnostico.solicitarDoenca();
        String descricao = viewDiagnostico.solicitarDescricao();
        String patologista = viewDiagnostico.solicitarPatologistaResponsavel();

        modelDiagnostico = new Diagnostico(doenca, descricao, patologista);


        viewDiagnostico.mostrarMensagem("Diagnostico realizado com sucesso");
        viewDiagnostico.mostrarMensagem("Doenca: " + modelDiagnostico.getDoenca());
        viewDiagnostico.mostrarMensagem("Descricao: " + modelDiagnostico.getDescricao());
        viewDiagnostico.mostrarMensagem("Patologista responsavel: " + modelDiagnostico.getPatologistaResponsavel());
    }
}
