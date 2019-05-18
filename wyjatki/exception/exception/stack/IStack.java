package programator02.exception.stack;

public interface IStack {
    void push(int element) throws StackOverflowException;
    int pop() throws StackEmptyException;
}
