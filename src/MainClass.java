import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainClass {
    public static void main (String[] args) {
        final int Triangle_Quantity = 3;
        Dot firstDot = new Dot(0,0);
        Dot secondDot = new Dot(1,0);
        Dot thirdDot = new Dot(0,1);
        List<Triangle> trianglesList = new ArrayList<>();

        for (int i = 0; i < Triangle_Quantity; i++) {
            trianglesList.add(new Triangle());
        }
        for (int i = 0; i < Triangle_Quantity; i++) {
            trianglesList.add(new Triangle());
        }

        trianglesList.get(0).setFirstDot(firstDot);
        trianglesList.get(0).setSecondDot(secondDot);
        trianglesList.get(0).setThirdDot(thirdDot);
        System.out.println(trianglesList.get(0).toString());
        TriangleCalculator.addTriangleType(trianglesList.get(0));
        TriangleCalculator.addTriangleType(trianglesList.get(1));
        TriangleCalculator.addTriangleType(trianglesList.get(2));

        TriangleCalculator.addTrianglePerimetr(trianglesList.get(0));
        TriangleCalculator.addTrianglePerimetr(trianglesList.get(1));
        TriangleCalculator.addTrianglePerimetr(trianglesList.get(2));

        TriangleCalculator.addTriangleSquare(trianglesList.get(0));
        TriangleCalculator.addTriangleSquare(trianglesList.get(1));
        TriangleCalculator.addTriangleSquare(trianglesList.get(2));

        TriangleCalculator.print();
    }
}