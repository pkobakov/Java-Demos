package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collections {
    public int length;
    public List<String> names;
    public HashMap<String, Integer> population;
    public int [] numbers ;

    public Collections(){
        this.names = new ArrayList<String>();
        this.population = new HashMap<>();
    }

    public Collections(int length){
        this.length = length;
        this.numbers = new int[length];
    }

}
