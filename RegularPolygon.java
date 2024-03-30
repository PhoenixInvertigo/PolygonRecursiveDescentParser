import java.awt.*;

// Class that defines a solid regular polygon object

public class RegularPolygon extends SolidPolygon{

    // Constructor that initializes the vertices of the regular polygon

    public RegularPolygon(Color color, Point center, int vertexCount, int radius) {
        super(color, vertexCount);

        int[] xPoints = new int[vertexCount];
        int[] yPoints = new int[vertexCount];

        double angle = 2 * Math.PI / vertexCount;

        for (int i = 0; i < vertexCount; ++i) {
            xPoints[i] = (int) Math.round(center.x + radius * Math.cos(angle * i));
            yPoints[i] = (int) Math.round(center.y + radius * Math.sin(angle * i));
        }

        createPolygon(xPoints, yPoints);
    }
}
