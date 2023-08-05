package br.edu.unieduk.tccsrvcoursecore.endpoint;

import br.edu.unieduk.tccsrvcoursecore.domain.Course;
import br.edu.unieduk.tccsrvcoursecore.usecase.FindCourseUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/find-course", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequiredArgsConstructor
public class SupplyController {

    private final FindCourseUseCase findCourseUseCase;

    @GetMapping("/{id}")
    public Course findCourseById(@PathVariable String id) throws Exception {
        return findCourseUseCase.execute(id);
    }

}
