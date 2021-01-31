package com.academy.neo4j.repository;

import com.academy.neo4j.entity.MovieEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<MovieEntity, String> {

}
