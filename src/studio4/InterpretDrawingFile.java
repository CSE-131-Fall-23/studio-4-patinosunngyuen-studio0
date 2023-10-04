package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		System.out.println(shape);
		
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		Color c = new Color(red, green, blue);
		
		Boolean filled = in.nextBoolean();
		double p1 = in.nextDouble();
		double p2 = in.nextDouble();
		double p3 = in.nextDouble();
		double p4 = in.nextDouble();
		
		StdDraw.setPenColor(c);
		//StdDraw.filledRectangle(p1, p2, p3, p4);
		StdDraw.rectangle(p1, p2, p3, p4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Object nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
}
