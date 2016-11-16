package softServe5;

public class ShapeManagment {

	private Triangle triangle = new Triangle();
	private Square square = new Square();
	private Polygon polygon = new Polygon();
	
	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}

	public Polygon getPolygon() {
		return polygon;
	}

	public void setPolygon(Polygon polygon) {
		this.polygon = polygon;
	}

	public void maxPerim(Polygon polygon, Triangle shape1, Square square){
		if(polygon.calculatePerimeter()>shape1.calculatePerimeter()&&polygon.calculatePerimeter()>square.calculatePerimeter()){
			System.out.println("Pol");
		} else if(polygon.calculatePerimeter()<shape1.calculatePerimeter()&&shape1.calculatePerimeter()>square.calculatePerimeter()){
			System.out.println("shape");
		}
		//otehr code
	}
}
