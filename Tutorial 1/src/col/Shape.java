package col;

public abstract class Shape {
	private ShapeType shapeType;
	
	public ShapeType getShapeType() {
		return shapeType;
	}
	
	public void setShapeType(ShapeType shapeType) {
		this.shapeType = shapeType;
	}
	
	public Shape(ShapeType shapeType) {
		this.shapeType = shapeType;
	}
	
	public void drawShape(){};


	class Square{
		
		public void drawShape(ShapeType shapeType) {
			/*drawSquare();*/
		}
	}
	class Circle{
		public void drawShape(ShapeType shapeType) {
			/*drawCircle();*/
		}
	}
}
