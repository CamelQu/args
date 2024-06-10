package org.camel.args;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    private static Map<String, String> schemaItems = new HashMap<>();
    public static Arguments parse(String schema, String... inputs) {
        Arrays.stream(schema.split(";")).forEach(item -> {
            String[] schemaItem = item.split(":");
            schemaItems.put(schemaItem[0], schemaItem[1]);
        });

        Arguments arguments = new Arguments();
        for (String input : inputs) {
            if (input.startsWith("-")) {
                String optionFlag = input.substring(1);
                String schemaType = schemaItems.get(optionFlag);
                if ("boolean".equals(schemaType)) {
                    arguments.putOption(optionFlag, true);
                }
            }
        }
        return arguments;
    }
}
