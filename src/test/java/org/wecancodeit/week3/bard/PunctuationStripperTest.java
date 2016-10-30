package org.wecancodeit.week3.bard;

import junit.framework.Assert;

import org.junit.Test;

/**
 * TODO satisfy one test at a time and in order -- remember to do the simplest
 * thing that works.
 */
public class PunctuationStripperTest {

	@Test
	public void shouldReturnEmptyForAnEmptyString() {
		// TODO create PunctuationStripper and tell it to strip an empty string
		// arrange
		PunctuationStripper underTest = new PunctuationStripper();
		String testString = "";
		// act
		String actual = underTest.strip(testString);// thing.method(parameter)
		// assert
		Assert.assertEquals("", actual);
	}

	@Test
	public void shouldReturnStringUnchangedIfNoPunctuation() {
		// TODO create PunctuationStripper and tell it to strip a string without
		// punctuation
		// arrange
		PunctuationStripper underTest = new PunctuationStripper();
		String testString = "Hello!!..";
		// act
		String actual = underTest.strip(testString);

		Assert.assertEquals("Hello", actual);
		// arrange
	}

	@Test
	public void shouldTrimWhitespaceFromTheBeginningAndEndOfAString() {
		// TODO create PunctuationStripper and tell it to strip a string with
		// leading and trailing whitespace
		// arrange
		PunctuationStripper underTest = new PunctuationStripper();
		String testString = "  Hello  ";
		// act
		String actual = underTest.strip(testString);

		Assert.assertEquals("Hello", actual);
		// arrange
	}

	@Test
	public void shouldStripPunctuation() {
		// TODO create PunctuationStripper and tell it to strip a string with
		// leading and trailing whitespace
	}

	// TODO create additional tests if they make you feel more comfortable with
	// your solution
}
