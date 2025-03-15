/*
 * 6) Create a student class
 * -create 5 student objects and store it in
 * a proper datastructure
 * - find the average marks of the students
 */

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

public class P6 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ann", 85));
        students.add(new Student("Taylor", 90));
        students.add(new Student("David", 78));
        students.add(new Student("Kitty", 92));
        students.add(new Student("Eve", 88));

        int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }

        double averageMarks = totalMarks / (double) students.size();
        System.out.println("The average marks of the students is: " + averageMarks);
    }
}