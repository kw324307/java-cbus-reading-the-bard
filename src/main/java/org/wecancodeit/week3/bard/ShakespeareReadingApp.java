package org.wecancodeit.week3.bard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ShakespeareReadingApp {

	/**
	 * This is how we create a constant in Java.
	 * 
	 * TODO Replace this with the location of the Yorick.txt file in the
	 * src/main/resources folder of your local computer.
	 */
	public static String SHAKESPEARE_FILEPATH = "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-reading-the-bard\\src\\main\\resources\\Yorick.txt";

	/**
	 * TODO load the file at SHAKESPEARE_FILEPATH via a {@link BufferedReader}
	 * 
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		readAndWriteToSystemOut();
		writeFileStrippingPunctuation(args);
		tryToReadAFileThatDoesntExist();
		// writeFileReplacingPunctuationWithLinebreaks();
	}

	/**
	 * <p>
	 * TODO load the file at SHAKESPEARE_FILEPATH via a {@link BufferedReader}
	 * </p>
	 * 
	 * <p>
	 * TODO read each line of text, then write each line to System.out
	 * </p>
	 * 
	 * *
	 * <p>
	 * TODO Close the {@link BufferedReader} you use in a finally block
	 * <p>
	 */
	private static void readAndWriteToSystemOut() throws IOException {

		FileReader file = new FileReader(SHAKESPEARE_FILEPATH);
		String line;
		BufferedReader buffer = new BufferedReader(file);
		// same as BufferedReader file = new BufferedReader(new
		// FileReader(SHA..FILE..))
		try {
			while ((line = buffer.readLine()) != null)
				System.out.println(line);
		} finally {
			System.err.println("Finally Block");
		}
		buffer.close();
	}

	/**
	 * <p>
	 * TODO read the input file and write a new file
	 * </p>
	 * 
	 * <p>
	 * TODO create and use an instance of {@link PunctuationStripper} to strip
	 * punctuation
	 * </p>
	 * 
	 * <p>
	 * TODO Close the {@link BufferedReader} you use in a finally block
	 * </p>
	 * 
	 * <p>
	 * Example:
	 * </p>
	 * 
	 * <pre>
	 * Now get you to my lady's chamber, and tell her, let her paint an
	 * inch thick, to this favour she must come; make her laugh at that.
	 * </pre>
	 * 
	 * <p>
	 * would become:
	 * </p>
	 * 
	 * <pre>
	 * Now get you to my ladys chamber and tell her let her paint an
	 * inch thick to this favour she must come make her laugh at that
	 * </pre>
	 * 
	 * @param PunctuationStripper
	 * @throws IOException
	 */
	private static void writeFileStrippingPunctuation(Object PunctuationStripper)
			throws IOException {

		FileReader file = new FileReader(SHAKESPEARE_FILEPATH);
		String line;
		BufferedReader buffer = new BufferedReader(file);
		// same as BufferedReader file = new BufferedReader(new
		// FileReader(SHA..FILE..))
		PunctuationStripper x = new PunctuationStripper();
		try {

			File newFile = new File(
					"C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-reading-the-bard\\src\\main\\resources\\newYorick.txt");
			FileOutputStream newFileOut = new FileOutputStream(newFile);
			BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(
					newFileOut));

			while ((line = buffer.readLine()) != null) {
				String strippedLine = x.strip(line);
				// System.out.println(strippedLine);

				for (int i = 0; i < 1; i++) {
					bWriter.write(strippedLine);
					bWriter.newLine();
				}

			}
			bWriter.close();

		} finally {
			System.err.println("Finally Block");
		}
		buffer.close();
	}

	/*
	 * 
	 * /** <p>TODO try to read a file that doesn't exist, catch the exception
	 * that is thrown, then write an error to {@link System#err} (same syntax as
	 * writing to {@link System#out})</p>
	 * 
	 * <p> TODO Close the {@link BufferedReader} you use in a finally block </p>
	 */
	private static void tryToReadAFileThatDoesntExist() throws IOException {

		FileReader file = new FileReader(
				newHampshireFIle());
		String line;
		BufferedReader buffer = new BufferedReader(file);
		// same as BufferedReader file = new BufferedReader(new
		// FileReader(SHA..FILE..))
		PunctuationStripper x = new PunctuationStripper();
		File newFile = new File(
				newHampshireFIle());
		try {
			FileOutputStream newFileOut = new FileOutputStream(newFile);
			BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(
					newFileOut));

			while ((line = buffer.readLine()) != null) {
				String strippedLine = x.strip(line);
				// System.out.println(strippedLine);

				for (int i = 0; i < 1; i++) {
					bWriter.write(strippedLine);
					bWriter.newLine();
				}
			}
			bWriter.close();
			
		} catch (FileNotFoundException f) {
			System.err.println("FileNotFound!");
		} finally {
			buffer.close();
		}
	}
	/**
	 * 
	 * Extension!
	 * 
	 * <p>
	 * TODO Create a test and a class (this is an exception to not creating new
	 * classes).
	 * </p>
	 * 
	 * <p>
	 * TODO read the input file and write a new file
	 * </p>
	 * 
	 * <p>
	 * TODO create and use an instance of {@link PunctionationReplacer} to
	 * replace punctuation with newlines and write these to System.out
	 * </p>
	 * 
	 * <p>
	 * TODO Close the {@link BufferedReader} you use in a finally block
	 * </p>
	 * 
	 * <p>
	 * Example:
	 * </p>
	 * 
	 * <pre>
	 * Now get you to my lady's chamber, and tell her, let her paint an
	 * inch thick, to this favour she must come; make her laugh at that.
	 * </pre>
	 * 
	 * <p>
	 * would become:
	 * </p>
	 * 
	 * <pre>
	 * Now get you to my lady
	 * s chamber
	 * and tell her
	 * let her paint an inch thick
	 * to this favour she must come
	 * make her laugh at that
	 * </pre>
	 */
	/*
	 * private static void writeFileReplacingPunctuationWithLinebreaks() {
	 * FileReader file = new FileReader(SHAKESPEARE_FILEPATH); String line;
	 * BufferedReader buffer = new BufferedReader(file);
	 * 
	 * PunctuationStripper noPunctuationLine = new PunctuationStripper(); while
	 * ((line = buffer.readLine()) != null) { noPunctuationLine = line.strip();
	 * System.out.println(noPunctuationLine); // line = line.trim();//include
	 * from code eval (string line & While // loop } buffer.close();
	 * 
	 * }
	 */

	private static String newHampshireFIle() {
		return "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-reading-the-bard\\src\\main\\resources\\newHampshire.txt";
	}
}