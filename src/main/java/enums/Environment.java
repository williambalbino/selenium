package enums;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toMap;

public enum Environment {

    LOCAL("local"), SELENIUM_GRID("selenium-grid");

    private final String value;
    private static final Map<String, Environment> ENUM_MAP;

    Environment(String value) {
        this.value = value;
    }

    static {
        Map<String, Environment> map = stream(Environment.values())
                .collect(toMap(instance -> instance.value.toLowerCase(), instance -> instance, (a, b) -> b, ConcurrentHashMap::new));
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static Environment get(String value) {
        if (!ENUM_MAP.containsKey(value.toLowerCase()))
            throw new IllegalArgumentException(String.format("Value %s not valid. Use one of the TARGET enum values", value));

        return ENUM_MAP.get(value.toLowerCase());
    }
}
