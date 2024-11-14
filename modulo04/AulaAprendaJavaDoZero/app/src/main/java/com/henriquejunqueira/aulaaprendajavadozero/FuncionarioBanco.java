package com.henriquejunqueira.aulaaprendajavadozero;

public class FuncionarioBanco {

    // Atributo
    double salario = 0;

    // Metodo void (vazio -> Metodo sem retorno)
    void calcularSalarioComDesconto(){
        double totalComDesconto = salario - 20;
        System.out.println("Total com desconto: " + totalComDesconto);
    }

}
