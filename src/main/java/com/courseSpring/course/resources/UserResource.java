package com.courseSpring.course.resources;

import com.courseSpring.course.entities.Userr;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<Userr> findAll() {
        Userr u = new Userr(1L, "Maria" , "maria@gmail.com", "999999999","12345" );
        return ResponseEntity.ok().body(u);
    }
}
