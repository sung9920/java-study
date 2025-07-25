package chapter03.paint.shape;

import chapter03.paint.canvas.Drawable;
import chapter03.paint.point.Point;

public abstract class Shape implements Drawable{
	private Point[] point;
	private String fillColor;
	private String lineColor;
}
