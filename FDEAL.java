
import java.util.ArrayList;
import java.util.HashSet;

public class FDEAL {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(4);
        al.add(5);
        al.add(6);

        ArrayList<Integer> duplicate=FindDuplicate(al);
        System.out.println(duplicate);
    }

    public static ArrayList<Integer> FindDuplicate(ArrayList<Integer> number){
        ArrayList<Integer> duplicate=new ArrayList<>();
        HashSet<Integer> HS=new HashSet<>();
        for(Integer num:number){
            if(!HS.add(num))
                duplicate.add(num);
        }
        return duplicate;
    }
}


//In this simplified version, we create a HashSet called uniqueSet to keep track of unique numbers encountered so far.
//We iterate over each element in the ArrayList and use the add() method of the HashSet to add the number to the set.
//If the add() method returns false, it means the number is already present in the set, indicating a duplicate.
//In that case, we add the number to the duplicates ArrayList.
//
//The main method remains the same, where an example ArrayList is created and passed to the findDuplicates method.
//The program then prints the duplicates to the console.