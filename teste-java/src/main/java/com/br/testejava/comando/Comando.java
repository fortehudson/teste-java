package com.br.testejava.comando;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.br.testejava.arquivo.Arquivo;

public class Comando {
	private List<LinkedHashMap<String, String>> dados;
	
	public Comando(){
		this.dados = new Arquivo().lerArquivo();
	}
	
	public int count(){
		return dados.size();
	}
	
	public int countDistinct(String propriedade){
		Map<String,String> map = new HashMap<String, String>();
		for(Map<String,String> m:dados){
			String valor = m.get(propriedade);
			if(valor!= null && !valor.isEmpty()){
				map.put(valor, valor);
			}
		}
		return map.size();
	}
	
	public List<String> filter(String propriedade, String valor){		
		List<String> filterList = new ArrayList<String>();
		filterList.add(dados.get(0).keySet().toString().replace("[", "").replace("]", "")); 
		for(Map<String,String> m:dados){
			String valorColuna = m.get(propriedade);		
			if(valorColuna!=null && valorColuna.equals(valor)){
				filterList.add(m.values().toString().replace("[", "").replace("]", ""));
			}
		}		
		return filterList;
	}
}