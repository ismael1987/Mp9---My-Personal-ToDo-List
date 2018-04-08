package com.Mp9MyPersonalToDoList.Mp9MyPersonalToDoList.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo,String> {

}
