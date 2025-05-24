package controller;
import model.Diagnostico;
import model.Patologista;
import view.DiagnosticoView;
import view.PatologistaView;


public class DiagnosticoController {
    private Diagnostico modelDiagnostico;
    private Patologista modelPatologista;
    private DiagnosticoView viewDiagnostico;
    private PatologistaView viewPatologista;

    public DiagnosticoController(DiagnosticoView viewDiagnostico, PatologistaView viewPatologista){
        this.viewDiagnostico = viewDiagnostico;
        this.viewPatologista = viewPatologista;
    }

    public void registrarDiagnostico(){
        String doenca = viewDiagnostico.solicitarDoenca();
        String descricao = viewDiagnostico.solicitarDescricao();
        String patologista = viewPatologista.solicitarNome();


        modelDiagnostico = new Diagnostico(doenca, descricao, patologista);
        modelPatologista = new Patologista(patologista);

        viewDiagnostico.mostrarMensagem("Diagnostico realizado com sucesso");
        viewDiagnostico.mostrarMensagem("Doenca: " + modelDiagnostico.getDoenca());
        viewDiagnostico.mostrarMensagem("Descricao: " + modelDiagnostico.getDescricao());
        viewDiagnostico.mostrarMensagem("Patologista responsavel: " + modelPatologista.getNome());
    }
}
