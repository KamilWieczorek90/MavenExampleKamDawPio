package programator02.exception.stack;

public class StackOverflowException extends  Exception{
    private int index;

    public StackOverflowException(int index){
        this.index = index;
    }
    @Override
    public String getMessage() {
        return "Przekroczenie wielkości stosu na indeksie: " + this.getIndex();
    }

    public int getIndex() {
        return index;
    }
}
