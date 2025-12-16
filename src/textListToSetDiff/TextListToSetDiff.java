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
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// how many files to subtract from our first set/list?
		final int AMT_FILTER_FILES = 1;

		// prepare scanner for console
		Scanner cnslScanner = new Scanner(System.in);

		// get the current directory as a File
		File userDir = new File(System.getProperty("user.dir"));

		// list that holds our two files
		// using arraylist to squash both references into one variable
		// should be sorted in order of list sizes
		ArrayList<File> filesToCompare = new ArrayList<>(2);

		// Testing by outputting what directory we're in
		try {
			System.out.println("Searching in: "+userDir.getCanonicalPath());
		}
		// If the above test didn't work, something is wrong and we can't continue!
		catch (IOException e) {
			System.out.println("Error!");
			System.err.println(e);
			return;
		}
		
		
		// while loop until user picks two available files
			// within this while loop, two other while loops, one for each file
		
		// Don't forget to close the scanner!
		cnslScanner.close();
	}

}
