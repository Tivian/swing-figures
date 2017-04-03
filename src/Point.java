public class Point {
	private double x;
	private double y;

	public Point() {
		set(0, 0);
	}

	public Point(Point copy) {
	    set(copy);
    }
	
	public Point(double x, double y) {
		set(x, y);
	}

	public Point set(Point point) {
	    return set(point.x, point.y);
    }
	
	public Point set(double x, double y) {
		this.x = x;
		this.y = y;
		return this;
	}

	public Point setX(double x) {
	    this.x = x;
	    return this;
    }
	
	public double getX() {
		return x;
	}

	public Point setY(double y) {
	    this.y = y;
	    return this;
    }

	public double getY() {
		return y;
	}

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    }

    public Point midpoint(Point point) {
        return new Point((x + point.getX()) / 2.0, (y + point.getY()) / 2.0);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

