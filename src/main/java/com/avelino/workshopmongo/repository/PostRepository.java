package com.avelino.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.avelino.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	//stsData manta a consulta 
	List<Post> findByTitleContainingIgnoreCase(String text);
}
