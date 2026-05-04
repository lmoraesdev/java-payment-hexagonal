package dev.leandromoraes.paymentapi.infrastructure.logger;

import java.time.LocalDateTime;

public class Logger5w1hBuilder {

    private final Logger5w1h logger;

    private String where;
    private String why;
    private String when;
    private Object who;
    private Object what;
    private String how;

    private Logger5w1hBuilder(Class<?> clazz) {
        this.logger = Logger5w1h.of(clazz);
        this.when = LocalDateTime.now().toString();
    }

    public static Logger5w1hBuilder create(Class<?> clazz) {
        return new Logger5w1hBuilder(clazz);
    }

    public Logger5w1hBuilder where(String value) {
        this.where = value;
        return this;
    }

    public Logger5w1hBuilder why(String value) {
        this.why = value;
        return this;
    }

    public Logger5w1hBuilder when(String value) {
        this.when = value;
        return this;
    }

    public Logger5w1hBuilder who(Object value) {
        this.who = value;
        return this;
    }

    public Logger5w1hBuilder what(Object value) {
        this.what = value;
        return this;
    }

    public Logger5w1hBuilder how(String value) {
        this.how = value;
        return this;
    }

    public void info() {
        logger.info(build());
    }

    public void debug() {
        logger.debug(build());
    }

    public void warn() {
        logger.warn(build());
    }

    public void error(Throwable exception) {
        logger.error(build(), exception);
    }

    private Log5w1h build() {
        return new Log5w1h(
                where,
                why,
                when,
                who,
                what,
                how
        );
    }
}
