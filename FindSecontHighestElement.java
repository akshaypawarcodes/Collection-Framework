import java.util.ArrayList;
import java.util.Collections;

public class FindSecontHighestElement {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();

        al.add(3);
        al.add(4);
        al.add(5);
        al.add(4);
        al.add(7);
        al.add(6);

        int second=findsecond(al);
        System.out.println(second);


    }
    public static int findsecond(ArrayList<Integer> num){
        Collections.sort(num);
        int size=num.size();
        if(size<2){
            return -1;
        }
        return num.get(size-2);
    }
}
