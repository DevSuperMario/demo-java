package com.example.demo_com_jpa.repositories;

import com.example.demo_com_jpa.entities.Student;
import com.example.demo_com_jpa.interfaces.IStudentRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    private EntityManager entityManager;

    @Autowired
    public StudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public void save(Student student) {
        this.entityManager.persist(student);
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        return List.of();
    }

    @Override
    public void update(int id, Student student) {

    }

    @Override
    public void delete(int id) {

    }
}
