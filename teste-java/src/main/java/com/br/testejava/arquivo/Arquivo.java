package com.br.testejava.arquivo;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Arquivo {

		public List<LinkedHashMap<String, String>> lerArquivo() {
			try {
				ClassLoader classLoader = getClass().getClassLoader();
				File file = new File(classLoader.getResource("cidades.csv").getFile());
				LineNumberReader reader = new LineNumberReader(new FileReader(file));
				String[] cabecalho = reader.readLine().split(",");
				List<LinkedHashMap<String, String>> dados = new ArrayList<LinkedHashMap<String,String>>();
				
				while (reader.ready()) {
					String linha[];
					linha = reader.readLine().split(",");
					LinkedHashMap<String,String> m = new LinkedHashMap<String, String>();
					for (int i = 0; i < linha.length; i++) {
						m.put(cabecalho[i], linha[i]);
					}
					dados.add(m);
				}
				reader.close();
				return dados;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

	}