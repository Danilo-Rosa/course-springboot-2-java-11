package com.courseSpring.course.config;

import com.courseSpring.course.entities.Userr;
import com.courseSpring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        Userr u1 = new Userr(null, "Maria Brown", "maria@gmail.com","98888888","123456");
        Userr u2 = new Userr(null, "Alex Green","alex@gmail.com","977777777","123456");
        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
