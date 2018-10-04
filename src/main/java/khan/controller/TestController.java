package khan.controller;

import khan.model.CodingField;
import khan.repository.CodingFieldRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private CodingFieldRepository codingFieldRepository;

    public TestController(CodingFieldRepository codingFieldRepository) {
        this.codingFieldRepository = codingFieldRepository;
    }

    @GetMapping("codingFields")
    public List<CodingField> getCodingFields() {
        return codingFieldRepository.findAll();
    }
}
