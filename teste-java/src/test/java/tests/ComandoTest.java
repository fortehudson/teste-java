package tests;

import java.util.ArrayList;
import java.util.List;

import com.br.testejava.comando.Comando;

import junit.framework.TestCase;

public class ComandoTest extends TestCase {

	public void testCount() {
		Comando comando = new Comando();
		assertEquals(5565, comando.count());
	}

	public void testCountDistinct(){
		Comando comando = new Comando();
		assertEquals(27, comando.countDistinct("uf"));
	}
	
	public void testFilter(){
		Comando comando = new Comando();
		List<String> resultadoEsperado = new ArrayList<String>();
		resultadoEsperado.add("ibge_id, uf, name, capital, lon, lat, no_accents, alternative_names, microregion, mesoregion");
		resultadoEsperado.add("1100049, RO, Cacoal, , -61.4429442118, -11.4338650287, Cacoal, , Cacoal, Leste Rondoniense");
		assertEquals(resultadoEsperado, comando.filter("name", "Cacoal"));
	}
}