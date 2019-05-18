package org.programator.prototype.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(
                new Processor(3, new Cores(2)),
                new Memory(1024),
                new GraphicsCart(
                        new Processor(11, new Cores(4)),
                        new Memory(2048)
                )
        );

        System.out.println(computer);

        Computer computerCopy = null;
        try {
            computerCopy = computer.clone();
        }
        catch (CloneNotSupportedException e){
            System.err.println("Computer clone() error: " + e);
        }
        System.out.println("Po kopiowaniu");
        System.out.println(computerCopy);

        computer.getGraphicsCart().getMemory().setCapacity(2000);

        System.out.println("Po pomodyfikacji oryginału");
        System.out.println(computer);
        System.out.println(computerCopy);

    }
}
