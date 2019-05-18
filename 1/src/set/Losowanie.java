package set;
import java.util.*;

public class Losowanie {
    public static void main(String[] args) {

        Set<Pileczka> set = new HashSet<>();
        Set<Pileczka> scoreSet = new HashSet<>();
        initBallBox(set);
       // System.out.println(set);


        Random random = new Random();



        while(scoreSet.size()<6){
            int counter =0;
            int rand = random.nextInt(48);
            for (Pileczka ball : set){
                if (counter == rand){
                    scoreSet.add(ball);
                }
                counter++;
            }

        }
        System.out.println(scoreSet);

    }
    public static void initBallBox(Set<Pileczka> set){
        for (Color color : Color.values()){
            set.addAll(initSetWithColor(color));
        }
    }
    public static Set<Pileczka> initSetWithColor(Color color) {
        Set<Pileczka> set = new HashSet<>();
        for(int i = 1 ; i <13 ;i++){
            set.add(new Pileczka(i, color));

        }
        return set;
    }

}