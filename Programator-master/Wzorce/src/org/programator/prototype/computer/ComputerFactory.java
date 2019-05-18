package org.programator.prototype.computer;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {
    private static Map<String, Computer> computerMap = new HashMap<>();

    static {
        computerMap.put("small",
                new Computer(
                        new Processor(3,new Cores(2)),
                        new Memory(1024),
                        new GraphicsCart(
                                new Processor(11,new Cores(3)),
                                new Memory(2048)
                        )
                )
        );

        computerMap.put("big",
                new Computer(
                        new Processor(6, new Cores(4)),
                        new Memory(32768),
                        new GraphicsCart(
                                new Processor(50, new Cores(7)),
                                new Memory(6144)
                        )
                )
        );
    }

    public static Computer getInstance(final String s) throws CloneNotSupportedException {
        return ((Computer) computerMap.get(s)).clone();
    }
}

