import java.util.ArrayList;
import java.util.HashMap;

public class TriangleCalculator {
    static  HashMap<Triangle, String> typeMap = new HashMap<>();
    static HashMap<Triangle, Double> perimetrMap = new HashMap<>();
    static HashMap<Triangle, Double> squareMap = new HashMap<>();
    public static String triangleType(Triangle triangle) {
        double firstSide = triangle.calculateSide(triangle.getFirstDot(), triangle.getSecondDot());
        double secondSide = triangle.calculateSide(triangle.getFirstDot(), triangle.getThirdDot());
        double thirdSide = triangle.calculateSide(triangle.getSecondDot(), triangle.getThirdDot());

        if ((firstSide == secondSide) && (firstSide == thirdSide)) {
            return "equilaterial"; //равносторонний
        } else if ((firstSide == secondSide) || (firstSide == thirdSide) || (secondSide == thirdSide)) {
            return "iosceles"; //равнобедренный
        } else if ((Math.sqrt(firstSide * firstSide + secondSide * secondSide) == thirdSide)
                || (Math.sqrt(thirdSide * thirdSide + secondSide * secondSide) == firstSide)
                || (Math.sqrt(firstSide * firstSide + thirdSide * thirdSide) == secondSide)) {
            return "right"; // прямоугольный
        } else {
            return "arbitrary"; // произвольный
        }
    }
    public static void addTriangleType(Triangle triangle) {
        typeMap.put(triangle, triangleType(triangle));
    }
    public static void print(){
        ArrayList<String> values = new ArrayList<>(typeMap.values());
        System.out.println("Значения: " + values);
    }
    public static void addTrianglePerimetr(Triangle triangle) {
        perimetrMap.put(triangle, triangle.getPerimetr());
    }
    public static void addTriangleSquare(Triangle triangle) {
        squareMap.put(triangle, triangle.getSquare());
    }
}
