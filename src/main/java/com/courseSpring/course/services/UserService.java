package com.courseSpring.course.services;

import com.courseSpring.course.entities.Userr;
import com.courseSpring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<Userr> findAll(){
        return repository.findAll();
    }
    public Userr findById(Long id){
        Optional<Userr> obj = repository.findById(id);
        return obj.get();
    }
}
