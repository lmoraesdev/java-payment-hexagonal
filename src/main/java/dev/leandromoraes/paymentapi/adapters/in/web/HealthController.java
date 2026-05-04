package dev.leandromoraes.paymentapi.adapters.in.web;

import dev.leandromoraes.paymentapi.infrastructure.logger.Logger5w1hBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        Logger5w1hBuilder.create(HealthController.class)
                .where("HealthController")
                .what("health_check")
                .why("system_monitoring")
                .who("system")
                .how("GET /health")
                .info();

        return Map.of("status", "UP");
    }

    @GetMapping("/error-test")
    public void error() {
        throw new RuntimeException("Teste erro");
    }

}
