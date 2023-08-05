package br.edu.unieduk.tccsrvcoursecore.endpoint;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import br.edu.unieduk.tccsrvcoursecore.domain.CourseItem;
import br.edu.unieduk.tccsrvcoursecore.usecase.FindCourseListUseCase;
import br.edu.unieduk.tccsrvcoursecore.usecase.FindCourseUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/find-course", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequiredArgsConstructor
public class SupplyController {

    private final FindCourseUseCase findCourseUseCase;
    private final FindCourseListUseCase findCourseListUseCase;

    @GetMapping("/{id}")
    public Course findCourseById(@PathVariable String id) throws Exception {
        return findCourseUseCase.execute(id);
    }

    @GetMapping
    public List<CourseItem> findCourseByQuery(@RequestHeader String query) {
        return findCourseListUseCase.execute(query);
    }

}
