import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainClass {
    public static void main (String[] args) {
        Triangle[] trianglesArray = new Triangle[1];
        List<Triangle> trianglesList = new ArrayList<>();
        HashSet<Triangle> trianglesSet = new HashSet<>();

        for (int i = 0; i < trianglesArray.length; i++) {
            trianglesArray[i] = new Triangle();
        }
//        for (int i = 0; i < trianglesArray.length; i++) {
//            System.out.println(trianglesArray[i].toString());
//        }
        for (int i = 0; i < trianglesArray.length; i++) {
            System.out.println(trianglesArray[i].triangleType());
        }
    }
}