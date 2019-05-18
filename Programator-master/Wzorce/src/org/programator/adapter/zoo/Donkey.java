package org.programator.adapter.zoo;

public class Donkey implements IAnimal {
    @Override
    public String getVoice() {
        return "Ioo ioo...";
    }

    @Override
    public String getLatinName() {
        return "Equus asinus";
    }

    public String toString(){
        return "donkey";
    }
}
