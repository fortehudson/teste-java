package com.br.testejava;

import java.util.Scanner;

import com.br.testejava.comando.ComandoParser;

public class App {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite : ");
		ComandoParser comandoParser = new ComandoParser();
		while (scan.hasNext()) {
			String comando = scan.nextLine();
			comandoParser.executarComando(comando);
		}		
		scan.close();		
	}
}