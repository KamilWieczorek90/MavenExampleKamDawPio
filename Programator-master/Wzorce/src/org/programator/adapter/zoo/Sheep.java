package org.programator.adapter.zoo;

public class Sheep implements IAnimal {
    @Override
    public String getVoice() {
        return "Beee...";
    }

    @Override
    public String getLatinName() {
        return "Ovis aries";
    }

    public String toString(){
        return "sheep";
    }
}
