/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.dao;

import com.step.model.Language;
import com.step.model.Student;
import com.step.util.DbUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Joshgun
 */
public class StudentDaoImpl implements StudentDao{

    @Override
    public boolean registerNewStudent(Student student, List<Language> languages) {
        Connection con = null;
        PreparedStatement psStudent = null;
        PreparedStatement psLang = null;
        ResultSet rs = null;
        int newId;
        boolean result = false;
        String sqlStudent = "insert into student(first_name, last_name, father_name, gender, nationality,"
                + "phone_number, address, duration, date_of_birth, username, password) "
                + "values(?,?,?,?,?,?,?,?,?,?,?)";
        
        String sqlLang = "insert into student_language(id_student, id_language) "
                + "values(?,?)";
        try {
            con = DbUtil.getConnection();
            psStudent = con.prepareStatement(sqlStudent, PreparedStatement.RETURN_GENERATED_KEYS);
            psStudent.setString(1, student.getFirstName());
            psStudent.setString(2, student.getLastName());
            psStudent.setString(3, student.getFatherName());
            psStudent.setString(4, student.getGender());
            psStudent.setString(5, student.getNationality());
            psStudent.setString(6, student.getPhoneNumber());
            psStudent.setString(7, student.getAddress());
            psStudent.setInt(8, student.getDuration());
            psStudent.setDate(9, new Date(student.getDateOfBirth().getTime()));
            psStudent.setString(10, student.getUsername());
            psStudent.setString(11, student.getPassword());
            psStudent.execute();
            rs = psStudent.getGeneratedKeys();
            if (rs.next()) {
                newId = rs.getInt(1);
            }else{
                throw new Exception();
            }
            
            psLang = con.prepareStatement(sqlLang);
            
            for(Language lang : languages){
                psLang.setInt(1, newId);
                psLang.setInt(2, lang.getId());
                psLang.execute();
            }
            
            result = true;
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DbUtil.close(con, psStudent, null);
        }
        
        return result;
        
    }
    
}
