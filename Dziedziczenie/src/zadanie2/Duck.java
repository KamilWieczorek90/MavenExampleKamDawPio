package zadanie2;

public class Duck extends Bird implements IFlyable, IRunable{
    public void glos(){
        System.out.println("kwa kwa");
    }
    public void zyje(){
        run();
        lec();
    }
}
