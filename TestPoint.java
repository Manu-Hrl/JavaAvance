package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class TestPoint {

	public static void main(String[] args) {
		// Exo 2 question 2
		Point p=new Point();
		System.out.println(p.x+" "+p.y);
		
		// Exo 2 question 9
		Point p = new Point(1,3);
		System.out.println(p);
		
		// Exo 3 question 1
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);

		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		// Exo 3 question 3
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);

		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}
}
