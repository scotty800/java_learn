package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import com.example.demo.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO create(User user) {
       user = userRepository.save(user);

        return new UserDTO(
            user.getId(),
            user.getName(),
            user.getAge(),
            user.getRole()
        );
    }

    public List<UserDTO> getAll() {
        return userRepository.findAll()
            .stream()
            .map(user -> new UserDTO(
                user.getId(),
                user.getName(),
                user.getAge(),
                user.getRole()
            ))
            .collect(Collectors.toList());
    }

    public UserDTO getById(Long id) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Utilisateur non trouvé"));
        
        return new UserDTO(
            user.getId(),
            user.getName(),
            user.getAge(),
            user.getRole()
        );
    }

    public User findEntityByName(String name) {
        return userRepository.findByName(name)
            .orElseThrow(() -> new ResourceNotFoundException("utilisateur non trouvé"));
    }

    public UserDTO update(Long id, User user) {
        User existingUser = userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Utilisateur non trouvé"));
        
        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());

        User saved = userRepository.save(existingUser);

        return new UserDTO(
            saved.getId(),
            saved.getName(),
            saved.getAge(),
            saved.getRole()
        );
    }

    public void deleteUserById(Long id) {
        if(!userRepository.existsById(id)) {
            throw new ResourceNotFoundException("Utilisateur non trouvé");
        }
        userRepository.deleteById(id);
    }
}
