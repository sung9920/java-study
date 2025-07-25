package chapter03.paint.main;

import java.io.Serializable;

import chapter03.paint.canvas.Canvas;
import chapter03.paint.canvas.Drawable;
import chapter03.paint.point.ColorPoint;
import chapter03.paint.point.Point;
import chapter03.paint.shape.Circle;
import chapter03.paint.shape.Rectangle;
import chapter03.paint.shape.Shape;
import chapter03.paint.shape.Triangle;
import chapter03.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();

		// 사용자가 (10, 20) 위치를 클릭한 상황
		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);
		canvas.draw(point1);

//	        point1.disappear();
		point1.show(false);

		// 사용자가 (100, 200) 위치를 클릭한 상황
		Point point2 = new Point(100, 200);
		canvas.draw(point2);

		ColorPoint point3 = new ColorPoint(50, 60, "red");
		canvas.draw(point3);

//	        canvas.drawTriangle(new Triangle());
		canvas.draw(new Triangle());

//	        canvas.drawRectangle(new Rectangle());
		canvas.draw(new Rectangle());

//	        canvas.drawCircle(new Circle());
		canvas.draw(new Circle());

		canvas.draw(new GraphicText("Hello, World"));

		// instanceof 연산자

		Circle c = new Circle();
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Circle);

		// 오류: 컴파일 타임에 타입 검사도 하기 때문에 상속 하이어라키(hierachy) 전혀 없으면 컴파일 에러 발생
//	        System.out.println(c instanceof Point); 

		// 다운캐스팅 전에 타입 검사
		Object o = new Circle();
		if(o instanceof String) {
			String s = (String) o;
		}
		
		// 우측항이 인터페이스인 경우
		// 상속 hieracy 상관 없이 사용할 수 있다.
		
		System.out.println(o instanceof String);
		System.out.println(c instanceof Drawable);
		System.out.println(c instanceof Serializable);
	}
}
