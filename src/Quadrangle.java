import java.awt.*;

public class Quadrangle extends Polygon {
	public Quadrangle(Point a, Point b, Point c, Point d) {
		super(a, b, c, d);
		setColor(Color.BLUE);
	}

	public Quadrangle(Quadrangle copy) {
		super(copy);
	}

	public Quadrangle set(Point a, Point b, Point c, Point d) {
		return (Quadrangle) set(new Point[]{a, b, c, d});
	}

	public double diagonal(int from) {
		return vertices[from].distance(vertices[(from + 2) % 4]);
	}
}