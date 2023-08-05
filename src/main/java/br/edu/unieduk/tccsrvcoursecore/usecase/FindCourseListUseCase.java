package br.edu.unieduk.tccsrvcoursecore.usecase;


import br.edu.unieduk.tccsrvcoursecore.domain.CourseItem;

import java.util.List;

public interface FindCourseListUseCase {

    List<CourseItem> execute(String query);

}
