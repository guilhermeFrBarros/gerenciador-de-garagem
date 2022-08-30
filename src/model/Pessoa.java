/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author guilherme barros
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private String dataDeNacimento;
    private  char sexo;
    private String Bairro ;
    private String Rua;
    private String cep ;
    private String cidade;
    private int numeroCasa;
    private String telefone;
    private String celular;
    private  String email;
    
    public Pessoa(){
     cpf="";
     nome ="";
     dataDeNacimento="";
     sexo ='a';
     Bairro ="";
     Rua = "";
     cep ="";
     cidade = "";
     numeroCasa = 0;
     telefone = "";
     celular = "";
     email ="";
    }
    
    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(String cpf, String nome, String dataDeNacimento, char sexo,
            String Bairro, String Rua, String cep, String cidade,
            int numeroCasa, String telefone, String celular, String email)
    {
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNacimento = dataDeNacimento;
        this.sexo = sexo;
        this.Bairro = Bairro;
        this.Rua = Rua;
        this.cep = cep;
        this.cidade = cidade;
        this.numeroCasa = numeroCasa;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }
    
    
    
    
   
     
     public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getDataDeNacimento() {
        return dataDeNacimento;
    }

    public void setDataDeNacimento(String dataDeNacimento) {
        this.dataDeNacimento = dataDeNacimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
   
  
    

   

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
