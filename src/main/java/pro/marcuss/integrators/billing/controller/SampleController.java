package pro.marcuss.integrators.billing.controller;

import java.util.List;
import javax.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pro.marcuss.integrators.billing.model.SampleEntity;
import pro.marcuss.integrators.billing.repository.SampleEntityRepository;

@RestController
public class SampleController {

  private final SampleEntityRepository repository;

  SampleController(SampleEntityRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/sample")
  List<SampleEntity> all() {
    return repository.findAll();
  }

  @PostMapping("/sample")
  SampleEntity newEmployee(@RequestBody SampleEntity newEmployee) {
    return repository.save(newEmployee);
  }

  @GetMapping("/sample/{id}")
  SampleEntity one(@PathVariable Long id) {

    return repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
  }

  @DeleteMapping("/sample/{id}")
  void deleteEmployee(@PathVariable Long id) {
    repository.deleteById(id);
  }

}
