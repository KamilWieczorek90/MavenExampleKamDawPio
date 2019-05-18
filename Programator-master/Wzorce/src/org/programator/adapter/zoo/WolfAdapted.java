package org.programator.adapter.zoo;

public class WolfAdapted extends Wolf implements IAnimal {
    @Override
    public String getVoice() {
        return this.sound();
    }

    @Override
    public String getLatinName() {
        return this.latinName();
    }

    public String toString(){
        return "wolf";
    }
}
