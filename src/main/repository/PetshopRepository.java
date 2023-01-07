package com.petshop.petshop;
    
import org.springframework.data.mongodb.repository.MongoRepository;
import com.petshop.petshop.model.Petshop;
public interface PetshopRepository extends MongoRepository<Petshop,String>{
}   


