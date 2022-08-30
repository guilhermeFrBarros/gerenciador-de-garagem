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
public class Funcionario extends Pessoa {
    private String funcao ="";
    private String senha ="";
    
    
    public Funcionario() {
         super();
        this.funcao = funcao;
        this.senha = senha;
    }


    public Funcionario(String cpf, String senha ) {
        super(cpf);
        this.senha = senha;
    }
    

    
    
    public Funcionario(String cpf, String nome, String dataDeNacimento, 
            char sexo, String Bairro, String Rua, String cep, String cidade,
            int numeroCasa, String telefone, String celular, String email,
            String funcao, String senha) 
    {
        super(cpf, nome, dataDeNacimento, sexo, Bairro, Rua, cep, cidade,
                numeroCasa, telefone, celular, email);
        this.funcao = funcao;
        this.senha = senha;
    }

    
    
    
    public Funcionario(String funcao, String cpf, String nome, String dataDeNacimento,
            char sexo, String Bairro, String Rua, String cep, String cidade,
            int numeroCasa, String telefone, String celular, String email) {
        super(cpf, nome, dataDeNacimento, sexo, Bairro, Rua, cep, cidade, numeroCasa, telefone, celular, email);
        this.funcao = funcao;
    }

    
   
    
    
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

   

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
