package com.paddytherabbit.bbc;


/**
 * Converts integer to roman numerals
 * @author David Sherlock
 */
public class NumeralGenerator implements RomanNumeralGenerator{
	
	
	/**
	  * @param number (required) brand name of the guitar. Must be in range 1..3999
	  * @return result String, Roman Numeral of input 
	  * @throws NumberFormatException if number is out of range
	  * 
	  * Takes an integer and creates roman numeral by looping through arrays of numerals
	  * and their values. Deducting value and generating string until value equals 0 
	  * 
	  */
	@Override
	public String generate(int number) {
	
		if ( number <= 0 || number > 3999 ){
			throw new NumberFormatException("Range must be 1-3999") ;
		}
		
		String result = "";
		int values[]  =     { 1000,  900,   500,  400,  100,  90,   50, 
								40,   10,    9,    5,    4,    1 };
		String symbols[]  = { "M",   "CM",  "D",  "CD", "C",  "XC", "L", 
							 "XL",    "X",  "IX", "V",  "IV", "I" };
		
		
		int i = 0;	//used to access array index
		while (number > 0) { 
			// loop through the number deducting values/adding symbols in turn in arrays
			while (number >= values[i]) 
		    	{
					//whenever value is deducted the Roman Numeral for that value is added to strin
					number -= values[i];
					result += symbols[i];
		        }
		        i++;  //increase index, move on to next value/symbol
		    }
		
		return result;
	}

}
