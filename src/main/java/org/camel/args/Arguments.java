package org.camel.args;

import java.util.HashMap;
import java.util.Map;

public class Arguments {
    private Map<String, Object> arguments = new HashMap<>();

    public void putOption(String flag, Object value) {
        arguments.put(flag, value);
    }

    public boolean getBoolean(String flag) {
        return arguments.containsKey(flag);
    }
}
