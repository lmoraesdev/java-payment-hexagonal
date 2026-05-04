package dev.leandromoraes.paymentapi.infrastructure.logger;

public record Log5w1h(
        String where,
        String why,
        String when,
        Object who,
        Object what,
        String how
) {
}
