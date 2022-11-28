package util;

import triangle.Triangle;

import java.util.ArrayList;
import java.util.HashMap;

public class TriangleFeachers {
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
        } else {
            arbitraryTriangles.add(triangle);
            typeMap.put("arbitrary", arbitraryTriangles);
        }
    }
    public static double minPerimetr(String trienglType) {
        if (typeMap.containsKey(trienglType)) {
            ArrayList<Triangle> onetypeTriegles = typeMap.get(trienglType);
            double minPerimetr = onetypeTriegles.get(0).getPerimetr();

            for (int i = 1; i < onetypeTriegles.size(); i++) {
                if (minPerimetr > onetypeTriegles.get(i).getPerimetr()) {
                    minPerimetr = onetypeTriegles.get(i).getPerimetr();
                }
            }
            return minPerimetr;
        }
        return 0;
    }
    public static double maxPerimetr(String trienglType) {
        if (typeMap.containsKey(trienglType)) {
            ArrayList<Triangle> onetypeTriegles = typeMap.get(trienglType);
            double maxPerimetr = onetypeTriegles.get(0).getPerimetr();

            for (int i = 1; i > onetypeTriegles.size(); i++) {
                if (maxPerimetr < onetypeTriegles.get(i).getPerimetr()) {
                    maxPerimetr = onetypeTriegles.get(i).getPerimetr();
                }
            }
            return maxPerimetr;
        }
        return 0;
    }
    public static double minSquare(String trienglType) {
        if (typeMap.containsKey(trienglType)) {
            ArrayList<Triangle> onetypeTriegles = typeMap.get(trienglType);
            double minSquare = onetypeTriegles.get(0).getSquare();

            for (int i = 1; i < onetypeTriegles.size(); i++) {
                if (minSquare > onetypeTriegles.get(i).getSquare()) {
                    minSquare = onetypeTriegles.get(i).getSquare();
                }
            }
            return minSquare;
        }
        return 0;
    }
    public static double maxSquare(String trienglType) {
        if (typeMap.containsKey(trienglType)) {
            ArrayList<Triangle> onetypeTriegles = typeMap.get(trienglType);
            double maxSquare = onetypeTriegles.get(0).getSquare();
            for (int i = 1; i < onetypeTriegles.size(); i++) {
                if (maxSquare < onetypeTriegles.get(i).getSquare()) {
                    maxSquare = onetypeTriegles.get(i).getSquare();
                }
            }
            return maxSquare;
        }
        return 0;
    }
}