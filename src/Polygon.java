import java.awt.*;
import java.util.Arrays;

public abstract class Polygon {
    protected Point[] vertices;
    private int numberOfVertices;
    private Color color;

    public Polygon() {
        this(0);
    }

    public Polygon(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        this.vertices = new Point[numberOfVertices];
    }

    public Polygon(Point... points) {
        set(points);
    }

    public Polygon(Polygon copy) {
        this(copy.vertices);
        setColor(copy.getColor());
    }

    protected Polygon set(Point... points) {
        if(points != null) this.vertices = Arrays.copyOf(points, numberOfVertices = points.length);
        return this;
    }

    public Polygon setVertex(int which, Point point) {
        if(which < 0 || which >= numberOfVertices)
            throw new IllegalArgumentException("This polygon have " + numberOfVertices + " vertices.");
        else if(point != null)
            vertices[which] = point;

        return this;
    }

    public Point getVertex(int which) {
        if(which < 0 || which >= numberOfVertices)
            throw new IllegalArgumentException("This polygon have " + numberOfVertices + " vertices.");

        return vertices[which];
    }

    public Polygon setColor(String colorStr) {
        return setColor(Color.getColor(colorStr));
    }

    public Polygon setColor(Color color) {
        if(color != null) this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public void drawFigure(Graphics g) {
        drawFigure(g, true);
    }

    public void drawFigure(Graphics g, boolean fill) {
        int[] xpoints = new int[numberOfVertices];
        int[] ypoints = new int[numberOfVertices];

        for(int i = 0; i < numberOfVertices; i++) {
            xpoints[i] = (int) vertices[i].getX();
            ypoints[i] = (int) vertices[i].getY();
        }

        g.setColor(color);
        g.drawPolygon(xpoints, ypoints, numberOfVertices);
        g.fillPolygon(xpoints, ypoints, numberOfVertices);
    }

    public double perimeter() {
        double sum = 0;
        for(int i = 0; i < numberOfVertices; i++)
            sum += vertices[i].distance(vertices[(i + 1) % 4]);

        return sum;
    }

    public double area() {
        double sum = 0;
        for(int i = 1; i < numberOfVertices; i++)
            sum += vertices[(i + 1) % numberOfVertices].getX() * (vertices[(i + 2) % numberOfVertices].getY() - vertices[i].getY());

        return Math.abs(sum) / 2.0;
    }

    public String toString() {
        String out = "";
        char letter = 'A';
        for(Point vertex : vertices)
            out += letter++ + vertex.toString() + ", ";

        return out.length() >= 2 ? out.substring(0, out.length() - 2) : "";
    }
}
