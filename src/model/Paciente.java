package model;

public class Paciente {
    private String nomePaciente;
    private int idade;
    private int numero;
    private String endereco;


    public Paciente(String nomePaciente, int idade, int numero, String endereco){
        this.nomePaciente = nomePaciente;
        this.idade = idade;
        this.numero = numero;
        this.endereco = endereco;
    }

    public String getNomePaciente(){
        return nomePaciente;
    }

    public int getIdade(){
        return idade;
    }

    public int getNumero(){
        return numero;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setNomePaciente(String nomePaciente){
        this.nomePaciente = nomePaciente;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }


}
