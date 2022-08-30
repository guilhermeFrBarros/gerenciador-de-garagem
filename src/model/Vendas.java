
package model;

/**
 *
 * @author guilherme barros
 */
public class Vendas {
    private int id;
    private String placa;
    private String cpfFuncionario;
    private String cpfComparador;
    private String local;
    private String dataDaVenda;
    private int valorDaVenda;
    private String descricao;
    private  float comissoes;
    private String nomeVendedor;

    
    
    public Vendas() {
        placa = "";
        cpfFuncionario = "";
        cpfComparador = "";
        local = "";
        dataDaVenda = "";
        valorDaVenda = 0;
        descricao = "";
        id = 0;
        nomeVendedor ="";
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public float getComissoes() {
        return comissoes;
    }

    public void setComissoes(float comissoes) {
        this.comissoes = comissoes;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public Vendas(String placa, String cpfFuncionario, String cpfComparador) {
        this.placa = placa;
        this.cpfFuncionario = cpfFuncionario;
        this.cpfComparador = cpfComparador;
    }

    
    
    public Vendas(String placa, String cpfFuncionario, String cpfComparador,
            String local, String dataDaVenda, int valorDaVenda, String descricao) {
        this.placa = placa;
        this.cpfFuncionario = cpfFuncionario;
        this.cpfComparador = cpfComparador;
        this.local = local;
        this.dataDaVenda = dataDaVenda;
        this.valorDaVenda = valorDaVenda;
        this.descricao = descricao;
        this.comissoes = (float)(valorDaVenda * 0.03);
    }

    public Vendas(int id, String placa, String cpfFuncionario, String cpfComparador, String local, String dataDaVenda, int valorDaVenda, String descricao) {
        this.id = id;
        this.placa = placa;
        this.cpfFuncionario = cpfFuncionario;
        this.cpfComparador = cpfComparador;
        this.local = local;
        this.dataDaVenda = dataDaVenda;
        this.valorDaVenda = valorDaVenda;
        this.descricao = descricao;
    }

  public Vendas(String placa, String cpfFuncionario, String cpfComparador,
            String local, String dataDaVenda, int valorDaVenda) {
        this.placa = placa;
        this.cpfFuncionario = cpfFuncionario;
        this.cpfComparador = cpfComparador;
        this.local = local;
        this.dataDaVenda = dataDaVenda;
        this.valorDaVenda = valorDaVenda;
        
        this.comissoes = (float)(valorDaVenda * 0.03);
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getCpfComparador() {
        return cpfComparador;
    }

    public void setCpfComparador(String cpfComparador) {
        this.cpfComparador = cpfComparador;
    }

    

 

    public String getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(String dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public int getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(int valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
