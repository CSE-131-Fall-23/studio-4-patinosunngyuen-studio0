package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		Color mine = new Color(10, 200, 150);
		StdDraw.setPenColor(mine);
		StdDraw.filledRectangle(0.5, 0.4, 0.5, 0.45);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.39, 0.49, 0.45);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.5, 0.6, 0.1);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.3, 0.35, 0.1);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.7, 0.35, 0.1);
		
		StdDraw.setPenColor(Color.RED);
		double[] x = {0.7, 0.4, 0.5};
		double[] y = {0.1, 0.8, 0.7};
		StdDraw.filledPolygon(x,y);
		
		
		
		
		
	}
}