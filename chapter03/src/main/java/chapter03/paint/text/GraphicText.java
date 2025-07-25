package chapter03.paint.text;

import chapter03.paint.canvas.Drawable;

public class GraphicText implements Drawable{
	private String text;
	
	public GraphicText(String text) {
		this.text = text;
	}

	@Override
	public void draw() {
		System.out.println(text);
	}

}
