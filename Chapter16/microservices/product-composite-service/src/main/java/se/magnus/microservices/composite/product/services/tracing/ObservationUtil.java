package se.magnus.microservices.composite.product.services.tracing;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import java.util.function.Supplier;
import org.springframework.stereotype.Component;

@Component
public class ObservationUtil {

  private final ObservationRegistry registry;

  public ObservationUtil(ObservationRegistry registry) {
    this.registry = registry;
  }

  public <T> T observe(String observationName, String contextualName, String highCardinalityKey, String highCardinalityValue, Supplier<T> supplier) {
    return Observation.createNotStarted(observationName, registry)
      .contextualName(contextualName)
      .highCardinalityKeyValue(highCardinalityKey, highCardinalityValue)
      .observe(supplier);
  }

}
