
package model;

/**
 *
 * @author guilherme barros
 */
public class Cliente extends Pessoa{
    private String profissao;

    
    public Cliente( String cpf, String profissao){
        super(cpf);
        this.profissao = profissao;
    }
    
    public Cliente( String cpf, String nome, String dataDeNacimento,
            char sexo, String Bairro, String Rua, String cep, String cidade,
            int numeroCasa, String telefone, String celular, String email, String profissao)
    {
        super(cpf, nome, dataDeNacimento, sexo, Bairro, Rua, cep, cidade, numeroCasa, telefone, celular, email);
        this.profissao = profissao;
    }
 
    public String getProfissao() {
        return profissao;
    }

    public void setProfissão(String profissao) {
        this.profissao = profissao;
    }
    
}
