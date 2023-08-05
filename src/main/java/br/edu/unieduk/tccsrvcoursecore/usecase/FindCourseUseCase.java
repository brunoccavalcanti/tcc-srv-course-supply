package br.edu.unieduk.tccsrvcoursecore.usecase;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;

public interface FindCourseUseCase {

    Course execute(String id) throws Exception;

}
