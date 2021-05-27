package pro.marcuss.integrators.billing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@RequiredArgsConstructor
public class SampleEntity {

  private @Id
  @GeneratedValue
  Long id;
  @NonNull
  private String name;
  @NonNull
  private String role;
}
