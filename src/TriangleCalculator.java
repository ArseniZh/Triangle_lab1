import java.util.ArrayList;
import java.util.HashMap;

public class TriangleCalculator {
    static  HashMap<Triangle, String> typeMap = new HashMap<>();
    static HashMap<Triangle, Double> perimetrMap = new HashMap<>();
    static HashMap<Triangle, Double> squareMap = new HashMap<>();

    public static void addTriangleType(Triangle triangle) {
        typeMap.put(triangle, triangle.triangleType());
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
