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

		if (intValue(bookCategory)<11 && intValue(bookCategory)>0 && discountCategory == OTHER){
			return BigDecimal.TEN = 25.000;
		}
		else if (intValue(bookCategory)<11 && intValue(bookCategory)>0 && discountCategory == STUDENT){
			return BigDecimal.TEN = 20.000;
		}
		else if (intValue(bookCategory)<11 && intValue(bookCategory)>0 && discountCategory == EMPLOYEE){
			return BigDecimal.TEN = 22.500;
		}
		else if (intValue(bookCategory)<21 && intValue(bookCategory)>10 && discountCategory == OTHER){
			return BigDecimal.TEN = 50.000;
		}
		else if (intValue(bookCategory)<21 && intValue(bookCategory)>10 && discountCategory == STUDENT){
			return BigDecimal.TEN = 40.000;
		}
		else if (intValue(bookCategory)<21 && intValue(bookCategory)>10 && discountCategory == EMPLOYEE){
			return BigDecimal.TEN = 45.000;
		}
		else if (intValue(bookCategory)<31 && intValue(bookCategory)>20 && discountCategory == OTHER){
			return BigDecimal.TEN = 100.000;
		}
		else if (intValue(bookCategory)<31 && intValue(bookCategory)>20 && discountCategory == STUDENT){
			return BigDecimal.TEN = 80.000;
		}
		else if (intValue(bookCategory)<31 && intValue(bookCategory)>20 && discountCategory == EMPLOYEE){
			return BigDecimal.TEN = 90.000;
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
