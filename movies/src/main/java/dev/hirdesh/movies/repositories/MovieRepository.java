package dev.hirdesh.movies.repositories;

import dev.hirdesh.movies.dto.MoviesDto;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<MoviesDto, ObjectId> {

}
