/**
 * 
 */
package assignment5_2;
import java.util.Scanner;

/**
 * @author ravasa01
 *
 */
abstract class Figure {
	
	double dim1;
	
	abstract void findArea();
	
	abstract void findPerimeter();
	
}

class Circle extends Figure {
	
	void findArea() {
		
		System.out.println("Area of the circle is "+(Math.PI*dim1*dim1));
		
	}
	
	void findPerimeter() {
		
		System.out.println("Perimeter of the circle is "+(2*Math.PI*dim1));
	}
}

class Rectangle extends Figure {
	
	void findArea() {
		
		System.out.println(" Area of rectangle with Height "+dim1+" and width "+dim1+" is "+(dim1*dim1));
		
	}
	
	void findPerimeter() {
		
		System.out.println(" Perimeter of rectangle with Height "+dim1+" and width "+dim1+" is "+(4*dim1));
		
	}
}

class Triangle extends Figure {
	
	void findArea() {
		
		System.out.println(" Area of triangles with sides of length "+dim1+" is "+(Math.sqrt(3)*dim1*dim1)/4);
		
	}
	
	void findPerimeter() {
		
		System.out.println(" Perimeter of triangles with sides of length "+dim1+" is "+(3*dim1));
		
	}
	
}
public class Assignment5_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner=new Scanner(System.in);
		
		Circle mCircle = new Circle();
		System.out.println("Enter the radius of the circle :");
		mCircle.dim1=mScanner.nextDouble();
		mCircle.findArea();
		mCircle.findPerimeter();
		
		Rectangle mRectangle = new Rectangle();
		System.out.println("Enter a side of the rectangle :");
		mRectangle.dim1=mScanner.nextDouble();
		mRectangle.findArea();
		mRectangle.findPerimeter();
		
		Triangle mTriangle = new Triangle();
		System.out.println("Enter a side of the triangle :");
		mTriangle.dim1=mScanner.nextDouble();
		mTriangle.findArea();
		mTriangle.findPerimeter();
		
		mScanner.close();
		

	}

}
