package com.fsmvu.inspectionofclass.http;

import com.fsmvu.inspectionofclass.automation.Course;
import com.fsmvu.inspectionofclass.automation.School;
import com.fsmvu.inspectionofclass.automation.Student;

public class RFIDServer extends Server{
    public School school;

    private static RFIDServer singleton;
    /**
     * Singleton object, only one server object should be up at a time.
     */
    public static RFIDServer getInstance() {
        if (singleton == null) { 
            singleton = new RFIDServer();
        }
        return singleton;
    }

    private RFIDServer() {
        school = new School();

        Student student = new Student("Bilal Ekrem", 1005, "A");
        Student student2 = new Student("Mert Donmez", 1006, "B");
        Student student3 = new Student("Enes Kamil", 1007, "C");
        Student student4 = new Student("Buğra Kerim", 1008, "D");

        Course course = new Course("D105", "Organizasyon", 9, 0, 5, 15);
        Course course2 = new Course("D105", "Network", 9, 0, 5, 15);
        Course course3 = new Course("D106", "Microprocessors", 10, 30, 5, 15);

        student.addCourse(course);
        
    }
}