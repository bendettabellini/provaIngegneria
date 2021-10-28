package provaLab;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	private static MyListUtil m;

	@BeforeClass
	public static void metodo() {
		System.out.println("Before Class");
		m = new MyListUtil();
	}
	
	@Test
	public void ordinaTest() {
		List<Integer> listaInput = Arrays.asList(5,20,3,15); //(3,5,15,20)
		m.ordina(listaInput, 0);
		int x = listaInput.get(0);
		assertEquals(3, x);
			
	}
	
	@Test
	public void ordinaTest2() {
		List<Integer> listaInput = Arrays.asList(5,20,3,15); //(3,5,15,20)
		m.ordina(listaInput, 1);
		int y = listaInput.get(0);
		assertEquals(20, y);
	}
}
