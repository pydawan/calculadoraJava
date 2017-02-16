package com.brunocrivelaro.javaoo.model.operacao;

public class DicionarioOperacoes{
  public static Operacao descobrirOperacao (char operador){
    switch (operador){
      case '+':
        return new Soma();
      case '-':
        return new Subtracao();
      case '*':
        return new Multiplicacao();
      case '/':
        return new Divisao();
    }
    System.err.println("Sinal" + operador + "desconhecido");
    System.exit(0);
    return null;
  }
}
