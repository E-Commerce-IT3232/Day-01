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
