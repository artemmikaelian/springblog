package com.springblog.springblog.repo;

import com.springblog.springblog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
