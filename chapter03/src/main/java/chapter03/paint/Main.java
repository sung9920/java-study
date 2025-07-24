package chapter03.paint;

public class Main {
	
	    public static void main(String[] args) {
	        Canvas canvas = new Canvas();

	        // 사용자가 (10, 20) 위치를 클릭한 상황
	        Point point1 = new Point();
			point1.setX(10);
			point1.setY(20);
	        canvas.drawPoint(point1);

//	        point1.disappear();
	        point1.show(false);
	        
	        // 사용자가 (100, 200) 위치를 클릭한 상황
	        Point point2 = new Point(100, 200);
	        canvas.drawPoint(point2);
	        
	        ColorPoint point3 = new ColorPoint(50, 60, "red");
	        canvas.drawPoint(point3);
	        
//	        canvas.drawTriangle(new Triangle());
	        canvas.drawShape(new Triangle());
	        
//	        canvas.drawRectangle(new Rectangle());
	        canvas.drawShape(new Rectangle());
	        
//	        canvas.drawCircle(new Circle());
	        canvas.drawShape(new Circle());
	} 
}
