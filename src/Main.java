import controller.DiagnosticoController;
import controller.LaboratorioController;
import controller.PacienteController;
import controller.PatologistaController;
import view.DiagnosticoView;
import view.LaboratorioView;
import view.PacienteView;
import view.PatologistaView;

public class Main {
    public static void main(String[] args) {
        PatologistaView viewPatologista = new PatologistaView();
        PatologistaController controllerPatologista = new PatologistaController(viewPatologista);
        DiagnosticoView viewDiagnostico = new DiagnosticoView();
        DiagnosticoController controllerDiagnostico = new DiagnosticoController(viewDiagnostico, viewPatologista);
        LaboratorioView viewLaboratorio = new LaboratorioView();
        LaboratorioController controllerLaboratorio = new LaboratorioController(viewLaboratorio);
        PacienteView viewPaciente = new PacienteView();
        PacienteController controllerPaciente = new PacienteController(viewPaciente);

        controllerPatologista.logarPatologista();
        controllerDiagnostico.registrarDiagnostico();
        controllerLaboratorio.consultarDadosLaboratorio();
        controllerPaciente.registrarPaciente();
    }
}
