package lesson32;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main_TreeSet {
    public static void main(String[] args) {
        Set<HeavyBox> heavyBoxSet = new TreeSet<>();
        Random gen = new Random();
        for (int i = 1; i <= 10 ; i++ ){
            heavyBoxSet.add(new HeavyBox(gen.nextInt(20)+1));
        }
        for (HeavyBox box : heavyBoxSet){
            System.out.println(box);
        }
    }
}
