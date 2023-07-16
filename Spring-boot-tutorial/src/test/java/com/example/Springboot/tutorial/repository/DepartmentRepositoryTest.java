package com.example.Springboot.tutorial.repository;

import com.example.Springboot.tutorial.Entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("CS")
                        .departmentCode("CS-001")
                        .departmentAddress("Bangalore")
                        .build();
        entityManager.persist(department);
    }

    @Test
    @DisplayName("Return the department when ID is passed")
    public void whenFindById_thenReturnDepartment() {
        Department department = departmentRepository.findById(1L).get();

        assertEquals(department.getDepartmentName(), "CS");
    }


}