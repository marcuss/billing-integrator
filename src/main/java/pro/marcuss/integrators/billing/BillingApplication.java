package pro.marcuss.integrators.billing;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pro.marcuss.integrators.billing.model.SampleEntity;
import pro.marcuss.integrators.billing.repository.SampleEntityRepository;

@Log
@SpringBootApplication
public class BillingApplication {

  public static void main(String[] args) {
    SpringApplication.run(BillingApplication.class, args);
  }

  @Bean
  CommandLineRunner initDatabase(SampleEntityRepository repository) {
    return args -> {
      log.info("Preloading " + repository.save(new SampleEntity("Bilbo Baggins", "burglar")));
      log.info("Preloading " + repository.save(new SampleEntity("Frodo Baggins", "thief")));
    };
  }

}
