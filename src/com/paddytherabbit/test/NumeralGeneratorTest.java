package com.paddytherabbit.test;

import static org.junit.Assert.assertEquals;
import com.paddytherabbit.bbc.*;
import org.junit.Test;

public class NumeralGeneratorTest {
	
	//exceptions
	@Test (expected = IllegalArgumentException.class)
	public void generate_NegativeAsParam_ExceptionThrown() {
	   
		NumeralGenerator generator = new NumeralGenerator();
		generator.generate(-40);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void generate_NumberOver3999AsParam_ExceptionThrown() {
		
		NumeralGenerator generator = new NumeralGenerator();
		generator.generate(4000);
		
	}
	
	//test all the core symbols,  cases of subtractive notion and random numbers
	@Test
	public void generate_1000AsParm_ReturnsM() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(1000), "M");
		
	}
	
	@Test
	public void generate_900AsParm_ReturnsCM() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(900), "CM");
	
	}
	
	@Test
	public void generate_500AsParm_ReturnsD() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(500), "D");
	
	}
	
	@Test
	public void generate_400AsParm_ReturnsCD() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(400), "CD");
	
	}
	
	@Test
	public void generate_200AsParm_ReturnsC() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(100), "C");
	
	}
	
	@Test
	public void generate_50AsParm_ReturnsL() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(50), "L");
	
	}
	
	@Test
	public void generate_40AsParm_ReturnsXL() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(40), "XL");
	
	}
	
	@Test
	public void generate_10AsParm_ReturnsX() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(10), "X");
	
	}
	
	@Test
	public void generate_9AsParm_ReturnsIX() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(9), "IX");
	
	}
	
	@Test
	public void generate_5AsParm_ReturnsV() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(5), "V");
	
	}
	
	@Test
	public void generate_4AsParm_ReturnsIV() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(4), "IV");
	
	}
	
	@Test
	public void generate_10AsParm_ReturnsI() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(1), "I");
	}
	
	
	@Test
	public void generate_2014AsParm_ReturnsMMXIV() {
		
		NumeralGenerator generator = new NumeralGenerator();
		assertEquals(generator.generate(2014), "MMXIV");
	
	}
	
	@Test
	public void generate_3999AsParm_ReturnsMMMCMXCIX() {
			
			NumeralGenerator generator = new NumeralGenerator();
			assertEquals(generator.generate(3999), "MMMCMXCIX");
		
	}
	
}
