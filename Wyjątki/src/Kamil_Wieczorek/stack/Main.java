package Kamil_Wieczorek.stack;

public class Main {
    public static void main(String[] args)  {
       // Stack stack = new Stack(5);
        ListStack<Person> listStack = new ListStack<>();


            listStack.push(new Person("p1", 5));
            listStack.push(new Person("p2", 45));
            listStack.push(new Person("p3", 25));
            listStack.push(new Person("p4", 54));
            listStack.push(new Person("p5", 51));
            listStack.push(new Person("p6", 75));

//
//        try{
//            for(int i = 0; i < 6; i++){
//                System.out.println("ListStack["+ i +"]="+listStack.pop());
//            }
//        }catch (StackEmptyException ex){
//            System.out.println("StackEmptyException:" + ex);
//            ex.printStackTrace();
//        }finally {
//            System.out.println("Finaly pop");
//        }
        System.out.println(listStack.czyJestNaStosie(new Person("p3", 25)));
        System.out.println(listStack.czyJestNaStosie(new Person("p3", 45)));
    }
}
//try {
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        }
//        catch (StackOverflowException ex){
//        //System.out.println("StackOverflowException:" + ex);
//        System.err.println(ex.getMessage());
////            ex.printStackTrace();
//        }
//        finally {
//        System.out.println("Finaly push");
//        }
//
//        try{
//        for(int i = 0; i < 6; i++){
//        System.out.println("stack["+ i +"]="+stack.pop());
//        }
//        }catch (StackEmptyException ex){
//        System.out.println("StackEmptyException:" + ex);
//        ex.printStackTrace();
//        }finally {
//        System.out.println("Finaly pop");
//        }