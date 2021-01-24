package SoloLearn.EqualsHashCode;

import java.util.HashMap;
import java.util.Map;


public class StudentRunner {

    public static void main(String[] args) {
        Student s = new Student("H234");
        Student s1 = new Student("H234");
        System.out.println(s.equals(s1));

        Map<Student,ReportCard> studentReportCardMap = new HashMap<Student,ReportCard>();
        //todo: anong ibig sabihin nitong Map

        studentReportCardMap.put(s,new ReportCard());
        studentReportCardMap.put(s1,new ReportCard());

        System.out.println(studentReportCardMap.size());


    }
}
