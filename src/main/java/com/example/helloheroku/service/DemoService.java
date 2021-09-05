package com.example.helloheroku.service;


import com.example.helloheroku.model.Demo;
import com.example.helloheroku.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoRepository demoRepository;

    public List<Demo> getAll(){
        return  demoRepository.findAll();
    }
    public Demo getByID(int id){
        return demoRepository.getById(id);
    }
}
