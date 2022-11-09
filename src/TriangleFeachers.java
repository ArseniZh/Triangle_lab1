import java.util.ArrayList;
import java.util.HashMap;

public class TriangleCalculator {
    static ArrayList<Triangle> equilaterialTriangles = new ArrayList<>();
    static ArrayList<Triangle> ioscelesTriangles = new ArrayList<>();
    static ArrayList<Triangle> rightTriangles = new ArrayList<>();
    static ArrayList<Triangle> arbitraryTriangles = new ArrayList<>();
    static  HashMap<String, ArrayList<Triangle>> typeMap = new HashMap<>();

    public static void addTriangleType(Triangle triangle) {
        if (triangle.getTriangleType() == "equilaterial") {
            equilaterialTriangles.add(triangle);
            typeMap.put("equilaterial", equilaterialTriangles);
        } else if (triangle.getTriangleType() == "iosceles") {
            ioscelesTriangles.add(triangle);
            typeMap.put("iosceles", ioscelesTriangles);
        } else if (triangle.getTriangleType() == "right") {
            rightTriangles.add(triangle);
            typeMap.put("right", rightTriangles);
        } else if (triangle.getTriangleType() == "arbitrary") {
            arbitraryTriangles.add(triangle);
            typeMap.put("arbitrary", arbitraryTriangles);
        }
    }
    public static double minPerimetr(String trienglType) {
        ArrayList<Triangle> onetypeTriegles = typeMap.get(trienglType);
        double minPerimetr = onetypeTriegles.get(0).getPerimetr();
        for (int i = 1; i < onetypeTriegles.size(); i++) {
            if(minPerimetr > onetypeTriegles.get(i).getPerimetr()) {
                minPerimetr = onetypeTriegles.get(i).getPerimetr();
            }
        }
        return minPerimetr;
    }
}