package com.example.helloheroku.repository;

import com.example.helloheroku.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DemoRepository extends JpaRepository<Demo, Integer> {
    @Override
    List<Demo> findAll();

    @Override
    Demo getById(Integer integer);
}
