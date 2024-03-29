package org.programator.fabryka.openclose;

//Open-Close Principle - Good example
class GraphicEditor {
	public void drawShape(Shape s) {
		s.draw();
	}
}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape  {
	public void draw() {
		System.out.println("Rectangle");
	}
} 

class Circle extends Shape  {
	public void draw() {
		System.out.println("Circle");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Triangle");
	}
}
//Zadanie: dodaj do programu możliwość rysowania trójkąta