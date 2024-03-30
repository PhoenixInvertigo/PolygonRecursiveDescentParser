import java.awt.*;

// Class that defines a solid isosceles triangle object

public class IsoscelesTriangle extends SolidPolygon {

    // Constructor that initializes the vertices of the isosceles triangle
    public IsoscelesTriangle(Color color, Point topVertex, int height, int width) {
        super(color, 3);

        int[] xPoints = new int[3];
        int[] yPoints = new int[3];

        xPoints[0] = topVertex.x;
        yPoints[0] = topVertex.y;

        xPoints[1] = topVertex.x + width/2;
        yPoints[1] = topVertex.y + height;

        xPoints[2] = topVertex.x - width/2;
        yPoints[2] = topVertex.y + height;

        createPolygon(xPoints, yPoints);
    }
}
