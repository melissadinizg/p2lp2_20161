package lp2.labtestes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import calculadora.Calculadora;

public class CalculadoraTest {

	private Calculadora calculadora;
	@Before
	public void setUP(){
		calculadora = new Calculadora();
	}
	
	@Test
	public void testSoma() throws Exception{
		//caso0();//passou
		//caso4(); //y=0
		//caso1(); //x<0
		//caso2(); //y<0
		//caso3(); //x<0, y<0
		//caso5(); //max X
		//casos6();
		//casos7();
		//casos8();
		//casos9();
	}
	
	@Test
	public void testMultiplicacao() throws Exception{
		//caso9(); //x<0
		//caso10(); // y<0
		//caso11(); //x=0
		//caso12(); //y=0
		//caso13(); //x=1
		//caso14(); //y=1
		caso15();
		//os casos 16, 17 e 18 sao semelhantes aos casos 7, 8 e 9 da soma
		
	}

	private void caso0() throws Exception{
		assertEquals(10, calculadora.soma(5,5));
		assertEquals(5, calculadora.soma(0, 5));
		
	}
	
	private void caso4() throws Exception{
		assertEquals(5, calculadora.soma(5, 0));
	}
	
	private void caso1() throws Exception{
		assertEquals(0, calculadora.soma(-5, 5));
	}
	
	private void caso2() throws Exception{
		assertEquals(0, calculadora.soma(5, -5));
	}
	
	private void caso3() throws Exception{
		assertEquals(-10, calculadora.soma(-5, -5));
	}
	
	private void casos6() {
		try{
			int x = Integer.MAX_VALUE;
			calculadora.soma(x, 1);
			fail("x = MAX_VALUE. Deveria falhar pois resultado da soma excede maior int");
		}catch(Exception e){
		}
	}
	
	private void casos7() {
		try{
			int y = Integer.MAX_VALUE;
			calculadora.soma(1, y);
			fail("y = MAX_VALUE. Deveria falhar pois resultado da soma excede maior int");
		}catch(Exception e){
		}
	}
	
	private void casos8() {		
		try{
			int x = Integer.MIN_VALUE;
			calculadora.soma(x, -1);
			fail("x = MIN_VALUE. Deveria falhar pois resultado da soma menor do que menor int");
		}catch(Exception e){
		}

	}
	
	private void casos9() {
		
		try{
			int y = Integer.MIN_VALUE;
			calculadora.soma(-1, y);
			fail("y = MIN_VALUE. Deveria falhar pois resultado da soma menor do que menor int");
		}catch(Exception e){
		}
	}

	private void caso9() throws Exception{
		assertEquals(-15, calculadora.multiplica(-5, 3));
	}
	
	private void caso10() throws Exception{
		assertEquals(-15, calculadora.multiplica(3, -5));
	}
	
	private void caso11() throws Exception{
		assertEquals(0, calculadora.multiplica(0, 3));
	}
	
	private void caso12() throws Exception{
		assertEquals(0, calculadora.multiplica(3, 0));
	}
	
	private void caso13() throws Exception{
		assertEquals(3, calculadora.multiplica(1, 3));
	}
	
	private void caso14() throws Exception{
		assertEquals(3, calculadora.multiplica(3, 1));
	}
	
	private void caso15() {
		try{
			int x = Integer.MAX_VALUE;
			calculadora.multiplica(x, 2);
			fail("x = MAX_VALUE. Deveria falhar pois resultado da mult maior do que maxint");
		}catch(Exception e){
		}
		
	}
}
