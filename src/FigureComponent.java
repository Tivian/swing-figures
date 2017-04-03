import java.awt.Graphics;
import java.util.List;
import java.util.Vector;
import javax.swing.JPanel;

public class FigureComponent extends JPanel {
	public void paintComponent(Graphics g) {
        List<Triangle> triangles = new Vector<>();
        List<Quadrangle> quadrangles = new Vector<>();

        triangles.add(new Triangle(new Point(0.0, 0.0), new Point(152.0, 94.0), new Point(73.0, 182.0)));
        triangles.add(new Triangle(new Point(252.0, 172.0), new Point(116.0, 292.0), new Point(100.0, 100.0)));

        quadrangles.add(new Quadrangle(new Point(300, 200), new Point(400, 250), new Point(350, 200), new Point(500, 450)));
        quadrangles.add(new Quadrangle(new Point(200, 200), new Point(400, 200), new Point(400, 400), new Point(200, 400)));

        triangles.forEach(fig -> fig.drawFigure(g));
        quadrangles.forEach(fig -> fig.drawFigure(g));
	}
}
