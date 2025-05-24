package model;

public class Diagnostico {
    private String doenca;
    private String descricao;
    private String patologistaResponsavel;


    public Diagnostico(String doenca, String descricao, String patologistaResponsavel){
        this.doenca = doenca;
        this.descricao = descricao;
        this.patologistaResponsavel = patologistaResponsavel;
    }

    public String getDoenca() {
        return doenca;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPatologistaResponsavel() {
        return patologistaResponsavel;
    }

    public void setTipo(String doenca) {
        this.doenca = doenca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPatologista(String patologistaResponsavel) {
        this.patologistaResponsavel = patologistaResponsavel;
    }
}
