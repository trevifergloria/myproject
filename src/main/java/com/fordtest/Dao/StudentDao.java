package com.fordtest.Dao;
import com.fordtest.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

import java.util.HashMap;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Gabriela", "Java"));
                put(2, new Student(2, "Alejandro", "Spring"));
                put(3, new Student(3, "Syed", "Angular"));
            }
        };
    }

    public Collection<Student>  getAllStudent(){
        return this.students.values();
    }
}
