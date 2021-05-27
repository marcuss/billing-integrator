package pro.marcuss.integrators.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.marcuss.integrators.billing.model.SampleEntity;

public interface SampleEntityRepository extends JpaRepository<SampleEntity, Long> {

}
