package edu.eci.cvds.ecibook.service;

import java.math.BigDecimal;

import edu.eci.cvds.ecibook.model.DiscountCategory;

/**
 * Subscription Service class in charge of calculating the monthly subscription.
 */
public class BookSaleService {

	/**
	 * Calculate the cost of a book, depending on the discount category and book category.
	 *
	 * @param bookCategory      The book category
	 * @param discountCategory  The discount category
	 * @return The amount to be charged to the client
	 */
	public BigDecimal calculateCost(final BigDecimal bookCategory, final DiscountCategory discountCategory) {
		BigDecimal answer =0;
		if ((bookCategory.compareTo(11.0) ==-1) && (bookCategory.compareTo(0.0) ==1) && discountCategory == OTHER){
			return answer = 25.000;
		}
		else if ((bookCategory.compareTo(11.0) ==-1) && (bookCategory.compareTo(0.0) ==1) && discountCategory == STUDENT){
			return answer = 20.000;
		}
		else if ((bookCategory.compareTo(11.0) ==-1) && (bookCategory.compareTo(0.0) ==1) && discountCategory == EMPLOYEE){
			return answer = 22.500;
		}
		else if ((bookCategory.compareTo(21.0) ==-1) && (bookCategory.compareTo(10.0) ==1) && discountCategory == OTHER){
			return answer = 50.000;
		}
		else if ((bookCategory.compareTo(21.0) ==-1) && (bookCategory.compareTo(10.0) ==1) && discountCategory == STUDENT){
			return answer = 40.000;
		}
		else if ((bookCategory.compareTo(21.0) ==-1) && (bookCategory.compareTo(10.0) ==1) && discountCategory == EMPLOYEE){
			return answer = 45.000;
		}
		else if ((bookCategory.compareTo(31.0) ==-1) && (bookCategory.compareTo(20.0) ==1) && discountCategory == OTHER){
			return answer = 100.000;
		}
		else if ((bookCategory.compareTo(31.0) ==-1) && (bookCategory.compareTo(20.0) ==1) && discountCategory == STUDENT){
			return answer = 80.000;
		}
		else if ((bookCategory.compareTo(31.0) ==-1) && (bookCategory.compareTo(20.0) ==1) && discountCategory == EMPLOYEE){
			return answer = 90.000;
		}

	}

	/*
	 * Tip: Siempre que se desee realizar cálculos matemáticos de alta precisión (por ejemplo para temas de dinero)
	 * es mucho más confiable usar el tipo de dato BigDecimal, pues soporta un alto rango de número, decimales y
	 * tiene mayor precisión en los cálculos. <br />
	 * Ejemplos básicos de operaciones con BigDecimal, teniendo las variables `bd1` y `bd2`:
	 * <ul>
	 * <li>Creación: <code>BigDecimal nuevo = new BigDecimal(10);</code></li>
	 * <li>Sumas: <code>BigDecimal suma = bd1.add(bd2);</code></li>
	 * <li>Restas: <code>BigDecimal resta = bd1.subtract(bd2);</code></li>
	 * <li>Multiplicación: <code>BigDecimal multiplicación = bd1.multiply(bd2);</code></li>
	 * <li>División: <code>BigDecimal division = bd1.divide(bd2);</code></li>
	 * </ul>
	 */

}
