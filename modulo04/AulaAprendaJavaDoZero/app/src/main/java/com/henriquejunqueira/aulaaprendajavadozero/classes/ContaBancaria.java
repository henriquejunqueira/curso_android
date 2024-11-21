package com.henriquejunqueira.aulaaprendajavadozero.classes;

/*
// Tipos de modificadores de acesso:
 - Default: Caso não tenha sido definido nenhum modificador, permitindo o acesso dentro do pacote e classe
 - Public: Todas as classes terão acesso
 - Private: Apenas pode ser acessado de dentro da classe
 - Protected: Pode ser acessado dentro do mesmo pacote e/ou subclasse
*/
public class ContaBancaria {

    // Atributos
    // double saldo = 0; // modificador default, só vai ser acessado dentro do mesmo pacote
    //private double saldo = 0; // modificador private, só vai ser acessado dentro da própria classe
    protected double saldo = 0;

    // Métodos
    private void recuperarSaldo(){}
     // void sacar(){} // modificador default, só vai ser acessado dentro do mesmo pacote
     //public void sacar(){} // modificador public, todos conseguem acessar
    public void sacar(){
        // Recuperar o saldo atual da pessoa
        //this.saldo = 100;
        //this.recuperarSaldo();
        recuperarSaldo();
    }

     // void transferir(){}
     public void transferir(){}

}
