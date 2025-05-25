package model;

import java.time.LocalDate;

public class Medicao {
    private String peca;
    private String unidade;
    private int areaMedida;
    private LocalDate data;
    private String conclusao;

    public Medicao(String peca, String unidade, int areaMedida, LocalDate data, String conclusao){
        this.peca = peca;
        this.unidade = unidade;
        this.areaMedida = areaMedida;
        this.data = data;
        this.conclusao = conclusao;
    }

    public String getPeca(){
        return peca;
    }

    public String getUnidade(){
        return unidade;
    }

    public int getAreaMedida(){
        return areaMedida;
    }

    public LocalDate getdata(){
        return data;
    }

    public String getConclusao(){
        return conclusao;
    }

    public void setPeca(String peca){
        this.peca = peca;
    }

    public void setUnidade(String unidade){
        this.unidade = unidade;
    }

    public void setAreaMedida(int areaMedida){
        this.areaMedida = areaMedida;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public void setConclusao(String conclusao){
        this.conclusao = conclusao;
    }
}
