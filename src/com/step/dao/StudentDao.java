package com.step.dao;

import com.step.model.Language;
import com.step.model.Student;
import java.util.List;

public interface StudentDao {
    boolean registerNewStudent(Student student, List<Language> languages);
}
