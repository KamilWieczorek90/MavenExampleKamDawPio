package org.programator.adapter.zoo;

public class Slon extends Mamut implements IAnimal {
    @Override
    public String getVoice() {
        return this.sound();
    }

    @Override
    public String getLatinName() {
        return this.latinName();
    }

    public String toString(){
        return "slon";
    }
}
