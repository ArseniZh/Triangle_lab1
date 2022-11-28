import dot.Dot;
import triangle.Triangle;
import util.TriangleFeachers;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main (String[] args) {
        final int Triangle_Quantity = 3;
        Dot firstDot = new Dot(0,0);
        Dot secondDot = new Dot(5,0);
        Dot thirdDot = new Dot(5,5);
        List<Triangle> trianglesList = new ArrayList<>();

        for (int i = 0; i < Triangle_Quantity; i++) {
            trianglesList.add(new Triangle());
        }

        trianglesList.get(0).setFirstDot(firstDot);
        trianglesList.get(0).setSecondDot(secondDot);
        trianglesList.get(0).setThirdDot(thirdDot);

        for (int i = 0; i < Triangle_Quantity; i++) {
            trianglesList.get(i).calculatePerimetr();
            trianglesList.get(i).calculateSquare();
            trianglesList.get(i).triangleType();
            TriangleFeachers.addTriangleType(trianglesList.get(i));
        }

        System.out.println(trianglesList.get(0).toString() + "\n");
        System.out.println(trianglesList.get(1).toString() + "\n");
        System.out.println(trianglesList.get(2).toString() + "\n");
        System.out.println("min perimetr from arbitrary = " + TriangleFeachers.minPerimetr("arbitrary"));
        System.out.println("max square from right = " + TriangleFeachers.maxSquare("right"));
        System.out.println("max square from equilaterial = " + TriangleFeachers.maxSquare("equilaterial"));
    }
}