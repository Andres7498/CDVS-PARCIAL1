package edu.eci.cvds.ecibook.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import jdk.jfr.Timestamp;

/**
 * Test class for {@link BookSaleService}
 */
public class BookSaleServiceTest {

	/**
	 * The class under test.
	 */
	private BookSaleService service = new BookSaleService();

	@Test
	public void test() {

		Assert.assertEquals(BigDecimal.ZERO,  service.calculateCost(null, null));
	}
	@Test 
	public void rangoMenorOtros(){
		
		BigDecimal expecteDecimal = 25.000;
		Assert.assertEquals(expecteDecimal,  service.calculateCost(2, OTHER));
	}
	@Test 
	public void rangoMenorEmpleado(){
		
		BigDecimal expecteDecimal = 22.500;
		Assert.assertEquals(expecteDecimal,  service.calculateCost(2, EMPLOYEE));
	}
	@Test 
	public void rangoMenorEstudiante(){
		
		BigDecimal expecteDecimal = 20.000;
		Assert.assertEquals(expecteDecimal,  service.calculateCost(2, STUDENT));
	}
	@Test
	public void rangoIntermedioOtros(){
		BigDecimal expecteDecimal = 50.000;
		Assert.assertEquals(expecteDecimal,  service.calculateCost(11, OTHER));
	}
	@Test
	public void rangoIntermedioEmpleado(){
		BigDecimal expecteDecimal = 45.000;
		Assert.assertEquals(expecteDecimal,  service.calculateCost(11, EMPLOYEE));
	}
	@Test
	public void rangoIntermedioEstudiante(){
		BigDecimal expecteDecimal = 40.000;
		Assert.assertEquals(expecteDecimal,  service.calculateCost(11, STUDENT));
	}
	@Test
	public void rangoMayorOtros(){
		BigDecimal expecteDecimal = 100.000;
		Assert.assertEquals(expecteDecimal,  service.calculateCost(30, OTHER));
	}
	@Test
	public void rangoMayorEmpleado(){
		BigDecimal expecteDecimal = 90.000;
		Assert.assertEquals(expecteDecimal,  service.calculateCost(30, EMPLOYEE));
	}
	@Test
	public void rangoMayorEstudiante(){
		BigDecimal expecteDecimal = 80.000;
		Assert.assertEquals(expecteDecimal,  service.calculateCost(30, STUDENT));
	}
}
