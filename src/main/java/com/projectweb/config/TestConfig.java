package com.projectweb.config;

import com.projectweb.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.projectweb.repository.UserRepository;
import java.util.Arrays;

public class TestConfig implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria Brown","maria@gmail.com","988888888","123456",null);
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456",null);
        userRepository.saveAll(Arrays.asList(u1, u2));

    }

    @Autowired
    private UserRepository userRepository;
}
