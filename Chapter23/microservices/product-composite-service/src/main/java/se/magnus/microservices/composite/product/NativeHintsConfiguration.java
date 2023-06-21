package se.magnus.microservices.composite.product;

import static org.springframework.aot.hint.MemberCategory.INVOKE_DECLARED_METHODS;

import io.github.resilience4j.spring6.bulkhead.configure.BulkheadAspect;
import io.github.resilience4j.spring6.circuitbreaker.configure.CircuitBreakerAspect;
import io.github.resilience4j.spring6.ratelimiter.configure.RateLimiterAspect;
import io.github.resilience4j.spring6.retry.configure.RetryAspect;
import io.github.resilience4j.spring6.timelimiter.configure.TimeLimiterAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportRuntimeHints;

/**
 * Workaround for Resilience4J's lack of support for native compile in v2.0.2.
 * Based on https://github.com/resilience4j/resilience4j/issues/1882 and
 * the pull request https://github.com/resilience4j/resilience4j/pull/1883
 */
@Configuration
@ImportRuntimeHints(NativeHintsConfiguration.class)
public class NativeHintsConfiguration implements RuntimeHintsRegistrar {

  private static final Logger LOG = LoggerFactory.getLogger(NativeHintsConfiguration.class);

  @Override
  public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
    LOG.info("Will register native hints for resilience4j");

    hints.reflection().registerType(BulkheadAspect.class,
      builder -> builder.withMembers(INVOKE_DECLARED_METHODS));

    hints.reflection().registerType(CircuitBreakerAspect.class,
      builder -> builder.withMembers(INVOKE_DECLARED_METHODS));

    hints.reflection().registerType(RateLimiterAspect.class,
      builder -> builder.withMembers(INVOKE_DECLARED_METHODS));

    hints.reflection().registerType(RetryAspect.class,
      builder -> builder.withMembers(INVOKE_DECLARED_METHODS));

    hints.reflection().registerType(TimeLimiterAspect.class,
      builder -> builder.withMembers(INVOKE_DECLARED_METHODS));
  }
}
