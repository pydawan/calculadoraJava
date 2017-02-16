package com.brunocrivelaro.javaoo.model;

import com.brunocrivelaro.javaoo.model.operacao.*;

public class Calculadora {
    private double valorAtual;

    private double calcular (double a, char c, double b){

      Operacao operacao = DicionarioOperacoes.descobrirOperacao(c);

      return operacao.calcular(a, b);
    }

    public void calcular (String expressao){
        String[] array = expressao.split(" ");

        if (array.length == 3){
            double a = Double.parseDouble(array[0]);
            char c = array[1].charAt(0);
            double b = Double.parseDouble(array[2]);

            valorAtual = calcular(a, c, b);

        } else if (array.length == 2){
            double a = Double.parseDouble(array[1]);
            char c = array[0].charAt(0);

            valorAtual = calcular (valorAtual, c, a);
        } else{
            System.err.println("Expressao errada!");
            valorAtual = 0;
        }

    }

    public void limparMemoria(){
      valorAtual = 0;
    }

    public double buscarResultadoParcial(){
      return valorAtual;
    }
}
