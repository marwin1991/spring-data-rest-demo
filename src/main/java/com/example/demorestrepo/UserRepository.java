package com.example.demorestrepo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cats", path = "cats")
public interface UserRepository extends PagingAndSortingRepository<Cats, Long> {
    List<Cats> findByName(@Param("name") String name);
}