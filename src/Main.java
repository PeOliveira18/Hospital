import controller.*;
import view.*;

public class Main {
    public static void main(String[] args) {
        PatologistaView viewPatologista = new PatologistaView();
        PatologistaController controllerPatologista = new PatologistaController(viewPatologista);
        DiagnosticoView viewDiagnostico = new DiagnosticoView();
        DiagnosticoController controllerDiagnostico = new DiagnosticoController(viewDiagnostico);
        LaboratorioView viewLaboratorio = new LaboratorioView();
        LaboratorioController controllerLaboratorio = new LaboratorioController(viewLaboratorio);
        PacienteView viewPaciente = new PacienteView();
        PacienteController controllerPaciente = new PacienteController(viewPaciente);
        MedicaoView viewMedicao = new MedicaoView();
        MedicaoController controllerMedicao = new MedicaoController(viewMedicao);

        controllerPatologista.logarPatologista();
        controllerDiagnostico.registrarDiagnostico();
        controllerLaboratorio.consultarDadosLaboratorio();
        controllerPaciente.registrarPaciente();
        controllerMedicao.registrarMedicao();
    }
}
