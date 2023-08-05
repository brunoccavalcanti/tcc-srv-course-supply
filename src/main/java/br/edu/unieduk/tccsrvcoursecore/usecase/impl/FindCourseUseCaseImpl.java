package br.edu.unieduk.tccsrvcoursecore.usecase.impl;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import br.edu.unieduk.tccsrvcoursecore.external.repository.CourseRepository;
import br.edu.unieduk.tccsrvcoursecore.usecase.FindCourseUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindCourseUseCaseImpl implements FindCourseUseCase {

    @Autowired
    private CourseRepository repository;

    @Override
    public Course execute(String id) throws Exception {

        var course = repository.findById(id);
        if (course.isEmpty()) throw new Exception("Objeto não encontrado");
        return course.get();
    }
}
