//CHECKSTYLE:OFF
/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample;

import brave.baggage.BaggagePropagation;
import brave.baggage.BaggagePropagationCustomizer;
import brave.propagation.B3Propagation;
import brave.propagation.Propagation;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Joe Grandja
 * @since 0.0.1
 */
@SpringBootApplication
public class OAuth2AuthorizationServerApplication {

  @Bean
  BaggagePropagation.FactoryBuilder myPropagationFactoryBuilder(
    ObjectProvider<BaggagePropagationCustomizer> baggagePropagationCustomizers) {
    Propagation.Factory delegate = B3Propagation.newFactoryBuilder().injectFormat(B3Propagation.Format.MULTI).build();
    BaggagePropagation.FactoryBuilder builder = BaggagePropagation.newFactoryBuilder(delegate);
    baggagePropagationCustomizers.orderedStream().forEach((customizer) -> customizer.customize(builder));
    return builder;
  }

  public static void main(String[] args) {
    SpringApplication.run(OAuth2AuthorizationServerApplication.class, args);
  }

}
//CHECKSTYLE:ON
