package es.viferpar.rest.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import es.viferpar.rest.microservices.limitsservice.bean.Limits;
import es.viferpar.rest.microservices.limitsservice.configuration.Configuration;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LimitsController {

  private final Configuration configuration;

  @GetMapping("/limits")
  public Limits retrieveLimits() {
    return Limits.builder().minimum(configuration.getMinimum()).maximum(configuration.getMaximum())
        .build();
  }

}
