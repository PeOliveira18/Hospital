package model;

public class Diagnostico {
    private String doenca;
    private String descricao;
    private String patologista;
    //private Exame exame

    public Diagnostico(String doenca, String descricao, String patologista){
        this.doenca = doenca;
        this.descricao = descricao;
        this.patologista = patologista;
    }

    public String getDoenca() {
        return doenca;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPatologista() {
        return patologista;
    }

    public void setTipo(String doenca) {
        this.doenca = doenca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPatologista(Patologista patologista) {
        this.patologista = String.valueOf(patologista);
    }
}
