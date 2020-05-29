package com.jmworks.todoapi.repository;

import com.jmworks.todoapi.domain.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TodoRepository extends PagingAndSortingRepository<Todo, Long> {
}