package com.fordtest.Service;

import com.fordtest.Dao.StudentDao;
import com.fordtest.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudent(){
        return studentDao.getAllStudent();
    }
}
