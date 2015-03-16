/**
 * Name: Adam Cyrkot
 * Student ID: 991-286-168
 * Assignment: Password Validator
 * 
 * Assignment 1 - Test Driven Development Exercise
 *
 * Assumptions: No boundary test was typed for the 'onlyLettersAndDigits' method because the password only either contains aspecial 
 * character or not. In other words, I don't see a reason as to have a boundary test for that method. 
 */

package PasswordValidator;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordValidatorTest {

	
	/**
	 * Typical failing test for the 'atLeastEightChars' method
	 */
	@Test
	public void testAtLeastEightChars() 
	{
		String input = "ABCDEF1";
		assertTrue("The password that was tested doesn't contain at least 8 characters", PasswordValidator.atLeastEightChars(input));
	}
	
	/**
	 * Typical passing test for the'atLeastEightChars' method
	 */
	@Test
	public void testAtLeastEightCharsPass()
	{
		String input = "ABCDEFG123";
		assertTrue("The password that was tested doesn't contain at least 8 characters", PasswordValidator.atLeastEightChars(input));
	}
	
	/**
	 * Boundary test for the 'atLeastEightChars' method
	 */
	@Test
	public void testAtLeastEightCharsBoundary()
	{
		String input = "ABCDEF12";
		assertTrue("The password that was tested doesn't contain at least 8 characters", PasswordValidator.atLeastEightChars(input));
	}
	
	
	/**
	 * Failing test for 'onlyLettersAndDigits' method
	 */
	@Test
	public void testOnlyLettersAndDigits()
	{
		String input = "ABCDEF1!";
		assertTrue("The password must contain only letters and numbers...", PasswordValidator.onlyLettersAndDigits(input));
	}
	
	/**
	 * Passing test for 'onlyLettersAndDigits' method
	 */
	@Test
	public void testOnlyLettersAndDigitsPass()
	{
		String input = "ABCDEF12";
		assertTrue("The password must contain only letters and numbers...", PasswordValidator.onlyLettersAndDigits(input));
	}
}
