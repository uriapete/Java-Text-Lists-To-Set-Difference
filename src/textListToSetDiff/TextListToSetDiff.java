/**
 * 
 */
package textListToSetDiff;

import java.io.File;
import java.io.IOException;
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

		// get the current directory as a File
		File userDir = new File(System.getProperty("user.dir"));

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
	}

}
