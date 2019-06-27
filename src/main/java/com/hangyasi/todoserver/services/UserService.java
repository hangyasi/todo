package com.hangyasi.todoserver.services;

import com.hangyasi.todoserver.entities.User;
import com.hangyasi.todoserver.repositories.UserRepository;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public User getUserById(long id) {
    return repository.findById(id).orElseThrow(EntityNotFoundException::new);
  }


}
