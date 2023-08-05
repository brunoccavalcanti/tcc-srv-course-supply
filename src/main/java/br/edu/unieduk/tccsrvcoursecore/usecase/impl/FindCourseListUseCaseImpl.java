package br.edu.unieduk.tccsrvcoursecore.usecase.impl;

import br.edu.unieduk.tccsrvcoursecore.domain.CourseItem;
import br.edu.unieduk.tccsrvcoursecore.external.repository.CourseRepository;
import br.edu.unieduk.tccsrvcoursecore.usecase.FindCourseListUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindCourseListUseCaseImpl implements FindCourseListUseCase {

    @Autowired
    private CourseRepository repository;

    @Override
    public List<CourseItem> execute(String query) {
        return repository.find(query);
    }
}
