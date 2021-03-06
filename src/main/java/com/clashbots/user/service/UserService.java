package com.clashbots.user.service;

import com.clashbots.user.entity.User;
import com.clashbots.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        log.info("inside save user method of UserService");
        return userRepository.save(user);
    }

    public User findUserById(Long userId) {
        log.info("inside find user by id method of UserService");
        return userRepository.findByUserId(userId);
    }

    public void deleteById(Long userId){
        userRepository.deleteById(userId);
    }
}
