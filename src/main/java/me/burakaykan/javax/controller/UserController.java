package me.burakaykan.javax.controller;

import me.burakaykan.javax.model.User;
import me.burakaykan.javax.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepo;

    @GetMapping("/{id}")
    public ResponseEntity<Object> get(@PathVariable Long id) {
        return new ResponseEntity<>(userRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody User user) {
        return new ResponseEntity<>(userRepo.save(user), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody User user) {
        return new ResponseEntity<>(userRepo.save(user), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        userRepo.delete(userRepo.getOne(id));
        return new ResponseEntity<>("User deleted", HttpStatus.OK);
    }

}
