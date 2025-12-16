/**
 * 
 */
package textListToSetDiff;

import java.io.File;
import java.io.IOException;

/**
 * 
 */
public class TextListToSetDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File userDir = new File(System.getProperty("user.dir"));

		try {
			System.out.println(userDir.getCanonicalPath());
		} catch (IOException e) {
			System.out.println("Error!");
			System.err.println(e);
		}
	}

}
