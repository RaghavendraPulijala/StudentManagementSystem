package com.example.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sms.Entity.Student;

// @Repository
@SuppressWarnings("unused")
public interface StudentRepository  extends JpaRepository<Student, Long>{

}
