import java.awt.*;

public class Triangle extends Polygon {
	public Triangle(Point a, Point b, Point c) {
		super(a, b, c);
		setColor(Color.RED);
	}

	public Triangle(Triangle copy) {
		super(copy);
	}

	public Triangle set(Point a, Point b, Point c) {
		return (Triangle) super.set(a, b, c);
	}

	public double height(int from) {
		return 2 * (area() / vertices[(from + 1) % 3].distance(vertices[(from + 2) % 3]));
	}
}