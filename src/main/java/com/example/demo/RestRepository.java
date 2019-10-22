package com.example.demo;
import com.example.demo.model.Shop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface RestRepository extends CrudRepository<Shop, Long> {

}
