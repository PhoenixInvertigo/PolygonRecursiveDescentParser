import java.awt.*;

// Class that defines a solid parallelogram object

public class Parallelogram extends SolidPolygon{

    // Constructor that initializes the vertices of the parallelogram
    public Parallelogram(Color color, Point topLeft, Point bottomRight, int offset) {
        super(color, 4);

        int[] xPoints = new int[4];
        int[] yPoints = new int[4];

        xPoints[0] = topLeft.x;
        yPoints[0] = topLeft.y;

        xPoints[1] = bottomRight.x + offset;
        yPoints[1] = topLeft.y;

        xPoints[2] = bottomRight.x;
        yPoints[2] = bottomRight.y;

        xPoints[3] = topLeft.x - offset;
        yPoints[3] = bottomRight.y;

        createPolygon(xPoints, yPoints);

    }
}
