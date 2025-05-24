package model;

public class Laboratorio {
    private String endereco;
    private String nome;
    private int andares;

    public Laboratorio(String endereco, String nome, int andares){
        this.endereco = endereco;
        this.nome = nome;
        this.andares = andares;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getNome(){
        return nome;
    }

    public int getAndares(){
        return andares;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAndares(int andares){
        this.andares = andares;
    }

}
