package trig.controller;

import trig.model.Triangle;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TrigController
{
	private Triangle equal;
	private Triangle isos;
	private Triangle right;
	private ArrayList<Triangle> triangleList;
	
	public TrigController()
	{
		equal = new Triangle(3.0, 3.0, 3.0);
		isos = new Triangle(3.0, 3.0, 5.0);
		right = new Triangle(3.0, 4.0, 5.0);
		triangleList = new ArrayList<Triangle>();
	}
	
	public void buildTheList()
	{
		triangleList.add(equal);
		triangleList.add(isos);
		triangleList.add(right);
	}
	
	
	public void start()
	{
		buildTheList();
		
		for (Triangle triangles : triangleList)
		{
			JOptionPane.showMessageDialog(null, calculateAngleC(triangles));
		}
		
		for (int i = 0; i < triangleList.size(); i += 1)
		{
			JOptionPane.showMessageDialog(null, calculateAngleC(triangleList.get(i)));
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
