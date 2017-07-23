package mx.com.cetech.cursoWeb.franco_app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SumaTest {
	Suma obj ;

	@Before
	public void setup(){
		obj = new Suma();
		
		
	}
	
	
	@Test
	public void testAdd() {
		assertEquals(3,obj.Add(1,1,1));
	}
	
	
	

}
