package com.timain.mapper;

import com.timain.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends ElasticsearchRepository<User, String> {
}
