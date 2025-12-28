/**
 * 
 */
package textListToSetDiff;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class TextListToSetDiff {

	/**
	 * Gets the next file as directed by Scanner input.
	 * @param inScn The input scanner.
	 * @param searchInDir What directory to search in.
	 * @return The specified file by user or null if failure.
	 */
	public static File getNextFile(Scanner inScn, File searchInDir){	
		// array to store search results
		File[] results;

		// get the name of the next file
		String s = inScn.next();
		

		// no results? file does not exist
		// >1 result? ...impossible case, all files must have unique name
		results = searchInDir.listFiles((File _, String name) -> name.equals(s));
		if (results.length!=1) {
			System.out.println("Invalid name! File does not exist. Please try again.");
			return null;
		}

		// output to verify input file
		try {
			System.out.println("captured " + results[0].getCanonicalPath() + "!");
			return results[0];
			
		} catch (IOException e) {
			System.err.println("Error in getting directory of file, but surely it should exist! Please try again!");
			System.err.println(e);
			return null;
		}


	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// how many files to subtract from our first set/list?
		final int AMT_FILTER_FILES = 1;

		// how many files will we process in total?
		final int AMT_FILES = AMT_FILTER_FILES+1;

		// prepare scanner for console
		Scanner cnslScanner = new Scanner(System.in);

		// get the current directory as a File
		File userDir = new File(System.getProperty("user.dir"));

		// what should the user input to finish inputting subrahends?
		String finishString = "f";

		// list that holds our two files
		// using arraylist to squash both references into one variable
		// should be sorted in order of list sizes
		ArrayList<File> filesToCompare = new ArrayList<>(AMT_FILES);

		// Testing by outputting what directory we're in
		try {
			System.out.println("Searching in: "+userDir.getCanonicalPath());
		}
		// If the above test didn't work, something is wrong and we can't continue!
		catch (IOException e) {
			System.out.println("Error in getting current directory!");
			System.err.println(e);
			return;
		}
		
		// picking our first, biggest file to filter out
		while (filesToCompare.size()<1) {
			System.out.println("Enter the name of the minuend and press enter file... (include file extension)");

			// get the file the user wants to use
			File result = TextListToSetDiff.getNextFile(cnslScanner, userDir);

			// if null, retrieval failed and message was printed by getNextFile
			if (result==null) {
				continue;
			}

			// if we're here, the file passed the test. Add it to the array
			filesToCompare.add(result);
		}

		// input var
		String nextFile = "";

		// while user does not say to stop...
		while (!nextFile.equals("fin")) {
			// call for file name the same way as above
		}

		// Don't forget to close the scanner!
		cnslScanner.close();
	}

}
