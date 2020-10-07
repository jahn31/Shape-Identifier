package main;

import shapes.Circle;
import shapes.Shape;
import shapes.Parallelogram;
import shapes.Rectangle;
import shapes.Triangle;
import shapes.Square;

import java.io.BufferedReader;
/* Reads text from a character-input stream, buffering 
characters so as to provide for the efficient reading of characters, arrays, and lines.*/
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
	    Shape[] shapes = new Shape[50];
		int index = 0;
		int size = 0;
		String str;
		
		System.out.println("------->JAC 444 Assignment 1<-------");
		System.out.println("------->Task 1 ... <-------");
	
		
		final String fileName = "shapes.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((str = br.readLine()) != null) {
				String[] tokens = str.split(",");// split by ","
				
				//your code
				String type = tokens[0];
				String[] shapeType = new String[]{"Circle", "Parallelogram", "Rectangle", "Square", "Triangle"};
				
				try {
					if( type.equals(shapeType[0]) || type.equals(shapeType[1]) || type.equals(shapeType[2]) || type.equals(shapeType[3]) || type.equals(shapeType[4])) {
						
						switch(type) {
						
						case "Circle": // shapeType[0]
							if(tokens.length == 2) {
							double radius = Double.parseDouble(tokens[1]);
							shapes[index] = new Circle(radius);
							index++;
							}
							break;
							
						case "Triangle": // shapeType[1]
							if(tokens.length == 4) {
							double s1 = Double.parseDouble(tokens[1]);
							double s2 = Double.parseDouble(tokens[2]);
							double s3 = Double.parseDouble(tokens[3]);
							shapes[index] = new Triangle(s1, s2, s3);
							index++;
							}
							break;
							
						case "Square": // shapeType[2]
							if(tokens.length == 2) {
							double l = Double.parseDouble(tokens[1]);
							shapes[index] = new Square(l);
							index++;
							}
							break;
							
						case "Rectangle": // shapeType[3]
							if(tokens.length == 3) {
							double wid = Double.parseDouble(tokens[1]);
							double hgt = Double.parseDouble(tokens[2]);
							shapes[index] = new Rectangle(wid, hgt);
							index++;
							}
							break;
							
						case "Parallelogram": // shapeType[4]
							if(tokens.length == 3) {
							double wid = Double.parseDouble(tokens[1]);
							double hgt = Double.parseDouble(tokens[2]); 
							shapes[index] = new Parallelogram(wid, hgt);
							index++;
							}
							break;
							
						default:
							break;
						}

					}
				} catch (IOException e){
					System.out.println(e.getMessage());
				}

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("\n" + index + " shapes were created:");
			for (Shape shape : shapes) {
				if(shape != null)
					System.out.println(shape);
			}
		}
	}

}
