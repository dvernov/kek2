package org.example.kek2_service.service;

import lombok.Data;
import org.example.kek2_service.entity.User;
import org.example.kek2_service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
public class UserService {

   private final UserRepository userRepository;

   public Optional<User> findByUsername(String username) {
      return userRepository.findUserByUsername(username);
   }
}
