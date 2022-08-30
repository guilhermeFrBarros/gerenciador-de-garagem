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
public class Veiculo {
    private String modelo;
    private int preco;
    private int ano;
    private String cor;
    private String marca;
    private int quilometragem;
    private String placa;
    private String tipo;
    private float precoMinimoDeVenda;
            
    public Veiculo() {
    modelo ="";
    preco =0;
    ano =0;
    cor = "";
    marca = ""; 
    quilometragem = 0;
    placa = "";
    tipo = "";
    precoMinimoDeVenda = 0;
    }

    public Veiculo(String modelo, int preco, int ano, String cor, String marca, int quilometragem, String placa, String tipo) {
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
        this.quilometragem = quilometragem;
        this.placa = placa;
        this.tipo = tipo;
        this.precoMinimoDeVenda = (float) ( preco * 1.2);
        
    }

    public float getPrecoMinimoDeVenda() {
        return precoMinimoDeVenda;
    }

    public void setPrecoMinimoDeVenda(float precoMinimoDeVenda) {
        this.precoMinimoDeVenda = precoMinimoDeVenda;
    }

    

    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
