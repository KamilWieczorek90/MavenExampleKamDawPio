package org.programator.prototype.computer;

import java.util.*;

import static java.lang.Thread.sleep;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        ArrayList<Computer> list1 = new ArrayList<>();

        final int N = 1000 * 1000;

        long t1 = System.currentTimeMillis();
        for(int i = 0; i < N; i++)
            list1.add(
                    new Computer(
                        new Processor(3, new Cores(3)),
                        new Memory(1024),
                        new GraphicsCart(
                            new Processor(11, new Cores(5)),
                            new Memory(2048)
                        )
                    )
            );
        long t2 = System.currentTimeMillis();
        System.out.println("Time: "+ (t2 -t1) + " count: "+ list1.size());
        list1.clear();


        t1 = System.currentTimeMillis();
        for(int i = 0; i < N; i++)
            list1.add(ComputerFactory.getInstance("small"));
        t2 = System.currentTimeMillis();
        System.out.println("Time: "+ (t2 -t1)+ " count: "+ list1.size());
    }
}

