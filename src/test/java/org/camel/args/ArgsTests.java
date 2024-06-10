package org.camel.args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArgsTests {
    /**
     * 第一个任务，l 标记存在时获取 true
     */
    @Test
    public void should_get_bool_true() {
        Arguments args = Parser.parse("l:boolean", "-l");
        assertTrue(args.getBoolean("l"));
    }

    /**
     * 第二个任务，l 标记不存在时获取 false
     */
    @Test
    public void should_get_bool_false() {
        Arguments args = Parser.parse("l:boolean", "");
        assertFalse(args.getBoolean("l"));
    }
}
