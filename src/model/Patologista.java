package model;

public class Patologista {
    private String nome;
    private int idade;
    private int tempoArea;

    public Patologista(String nome, int idade, int tempo_area){
        this.nome = nome;
        this.idade = idade;
        this.tempoArea = tempo_area;
    }

    public Patologista(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public int getTempo_area(){
        return tempoArea;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setTempo_area(int tempo_area){
        this.tempoArea = tempo_area;
    }
}
