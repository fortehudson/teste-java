package com.br.testejava.comando;

import java.util.List;

public class ComandoParser {

	public void executarComando(String comando) {
		Comando comandos = new Comando();
		if (comando.contains("count distinct")) {
			String parametros[] = comando.split(" ");
			if (parametros.length < 3) {
				System.out.println("Número de parametros insuficientes");
			} else {
				System.out.println(comandos.countDistinct(parametros[2]));
			}
		} else if (comando.contains("count")) {
			System.out.println(comandos.count());
		} else if (comando.contains("filter")) {
			String parametros[] = comando.split(" ");
			if (parametros.length < 3) {
				System.out.println("Número de parametros insuficientes");
			} else {
				List<String> list = comandos.filter(parametros[1], parametros[2]);
				for (String s : list) {
					System.out.println(s);
				}

			}
		} else if (comando.contains("sair")) {
			System.exit(0);
		} else {
			System.out.println("Comando não reconhecido");
		}
	}

}