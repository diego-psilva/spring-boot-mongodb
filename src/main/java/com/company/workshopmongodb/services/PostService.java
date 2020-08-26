package com.company.workshopmongodb.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.workshopmongodb.domain.Post;
import com.company.workshopmongodb.repositories.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;

	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
