package br.com.davibarbosa.clientes.api.model;

public class Cliente {

    private String nome;
    private Double saldo;

    public Cliente() {
        this.saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        //O cara colocou dinheiro na boca do caixa//
        this.saldo = this.saldo + valor;
    }

   public void setNome(String nomeVindoDeFora){
       this.nome = nomeVindoDeFora;
   }

    public String getNome() {
        return nome;
    }
}
