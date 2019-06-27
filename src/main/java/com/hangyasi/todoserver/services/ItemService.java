package com.hangyasi.todoserver.services;

import com.hangyasi.todoserver.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

  @Autowired
  private ItemRepository repository;
  
}
