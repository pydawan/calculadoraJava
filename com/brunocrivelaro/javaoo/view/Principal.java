package com.brunocrivelaro.javaoo.view;

import com.brunocrivelaro.javaoo.model.*;

class Principal{
	public static void main(String args[]){
		Calculadora calculadora = new Calculadora();

                calculadora.calcular("3 * 2");
                System.out.println(calculadora.buscarResultadoParcial());

                calculadora.calcular("7 - 3");
                System.out.println(calculadora.buscarResultadoParcial());

                calculadora.calcular("1 + 2.2");
                System.out.println(calculadora.buscarResultadoParcial()); // 3.2

                calculadora.calcular("7.5 - 3");
                System.out.println(calculadora.buscarResultadoParcial()); // 4.5

                calculadora.calcular("+ 4");
                System.out.println(calculadora.buscarResultadoParcial()); // 8.5

                calculadora.calcular("- 6");
                System.out.println(calculadora.buscarResultadoParcial());
	}
}
