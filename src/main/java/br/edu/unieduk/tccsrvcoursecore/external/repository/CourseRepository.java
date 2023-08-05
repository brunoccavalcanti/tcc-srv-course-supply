package br.edu.unieduk.tccsrvcoursecore.external.repository;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import br.edu.unieduk.tccsrvcoursecore.domain.CourseItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CourseRepository extends MongoRepository<Course, String> {

    @Query("{'title': {'$regex': '?0', '$options': 'i'}}")
    List<CourseItem> find(String query);

}