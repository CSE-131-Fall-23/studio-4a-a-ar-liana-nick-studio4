package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//set canvas
		StdDraw.setCanvasSize(764,512);
		StdDraw.setXscale(0.0, 1.5);
		
		//neck
		StdDraw.setPenColor(123, 136, 107);
		double[] x = {0.3, 0.35, 0.45, 0.4};
		double[] y = {0.725, 0.75, 0.425, 0.4};
		StdDraw.filledPolygon(x, y);
		
		
		//head
		StdDraw.setPenColor(123, 136, 107);
		StdDraw.filledEllipse(0.3, 0.75, 0.05, 0.025);
		
		
		//eye
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledEllipse(0.315, 0.75, 0.03, 0.015);
		
		
		//pupil
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledEllipse(0.315, 0.75, 0.02, 0.005);
		
		//blush
		StdDraw.setPenColor(158, 130, 156);
		StdDraw.filledEllipse(.35, 0.725, 0.01, 0.0025);
		
		//body
		StdDraw.setPenColor(123, 136, 107);
		StdDraw.filledEllipse(0.65, .40, 0.25, 0.13);
		
		//tail
		double[] tailX = {0.8, 1.17, 0.85};
		double[] tailY = {0.5, 0.35, 0.36};
		StdDraw.filledPolygon(tailX, tailY);
		
		//scales
		StdDraw.setPenColor(90, 95, 76);
		StdDraw.filledEllipse(0.7, 0.55, 0.03, 0.025);
		double[] scaleX = {0.728, 0.672, 0.715};
		double[] scaleY = {0.56, 0.56, 0.6};
		StdDraw.filledPolygon(scaleX, scaleY);
		
		StdDraw.setPenColor(90, 95, 76);
		StdDraw.filledEllipse(0.6, 0.55, 0.03, 0.025);
		double[] scaleX2 = {0.628, 0.572, 0.6};
		double[] scaleY2 = {0.56, 0.56, 0.6};
		StdDraw.filledPolygon(scaleX2, scaleY2);
		
		//legs
		StdDraw.filledEllipse(0.5, 0.07, 0.04, 0.03);
		StdDraw.filledEllipse(0.8, 0.07, 0.04, 0.03);
		
		StdDraw.setPenColor(123, 136, 107);
		StdDraw.filledRectangle(0.5, 0.2, 0.04, 0.13);
		StdDraw.filledRectangle(0.8,  0.2, 0.04, 0.13);
		
		
		// green: 123, 136, 107
		// "ebony": 90, 95, 76
	}
}