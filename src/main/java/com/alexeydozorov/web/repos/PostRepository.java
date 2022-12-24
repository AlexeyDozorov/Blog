package com.alexeydozorov.web.repos;

import com.alexeydozorov.web.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
