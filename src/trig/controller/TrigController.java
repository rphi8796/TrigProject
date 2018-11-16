package trig.controller;

import trig.model.Triangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TrigController
{
	private Triangle equal;
	private Triangle isos;
	private Triangle right;
	private ArrayList<Triangle> triangleList;
	private Triangle[] triangleArray;
	private ImageIcon[] icons;
	
	public TrigController()
	{
		equal = new Triangle(3.0, 3.0, 3.0);
		isos = new Triangle(3.0, 3.0, 5.0);
		right = new Triangle(3.0, 4.0, 5.0);
		triangleList = new ArrayList<Triangle>();
		triangleArray = new Triangle[6];
		icons = new ImageIcon[6];
		
		for (int index = 0; index < triangleArray.length; index += 1)
		{	
			icons[index] = new ImageIcon(getClass().getResource("/trig/view/images/Triangle.png"));
		}
	}
	
	public void buildTriangleList()
	{
		for (int index = 0; index < triangleArray.length; index += 1)
		{
			double i = index + 1;
			triangleArray[index] = new Triangle(i, i, i);
		}
	}
	
	
	public void start()
	{
		buildTriangleList();
		
		for (Triangle triangles : triangleArray)
		{
			JOptionPane.showMessageDialog(null, calculateAngleC(triangles));
		}	
	}
	
	public String calculateAngleC(Triangle triangle)
	{	
		String angleStatement = "";
		
		double product1 = ((Math.pow(triangle.getSideB(), 2.0) + Math.pow(triangle.getSideA(), 2.0)) - Math.pow(triangle.getSideC(), 2.0));
		double product2 = (2 * triangle.getSideA() * triangle.getSideB());
		double product3 = (product1 / product2);
		double angleC = Math.acos(product3);
		
		angleStatement = ("The angle opposite of the sideC for the triangle is " + angleC);
		
		return angleStatement;
	}

}
