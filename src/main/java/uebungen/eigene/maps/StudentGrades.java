package uebungen.eigene.maps;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
    Map<String, Double> grades = new HashMap<>();
    grades.put("Jane", 1.0);
    grades.put("John", 2.0);
    grades.put("Jack", 3.0);

    System.out.println(getStudentWithBestGrade(grades));

    }


    public static String getStudentWithBestGrade(Map<String, Double> grades) {
        String best = "";
        double max= 5;
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            if(entry.getValue() < max) {
            max = entry.getValue();
            best = entry.getKey();
        }}
        return best;
    }


}
