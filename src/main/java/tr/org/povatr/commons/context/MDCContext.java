package tr.org.povatr.commons.context;

import org.slf4j.MDC;

import static tr.org.povatr.commons.constant.MDCConstant.CORRELATION_ID;

public class MDCContext {

    public static void put(String key, String value) {
        MDC.put(key, value);
    }

    public static void get(String key) {
        MDC.get(key);
    }

    public static String getCorrelationId() {
        return MDC.get(CORRELATION_ID);
    }

    public static void putCorrelationId(String correlationId) {
        MDC.put(CORRELATION_ID, correlationId);
    }

    public static void remove(String key) {
        MDC.remove(key);
    }

    public static void clear() {
        MDC.clear();
    }
}