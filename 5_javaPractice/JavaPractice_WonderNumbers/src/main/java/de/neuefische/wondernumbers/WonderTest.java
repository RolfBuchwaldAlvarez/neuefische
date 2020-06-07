package de.neuefische.wondernumbers;

import java.util.ArrayList;
import java.util.List;

public class WonderTest {


    // wenn x gerade ist, dann x / 2
    // wenn x ungerade ist, dann x*3+1

    int x;

    public List<Integer> wonder(int x) {
        List<Integer> wonderList = new ArrayList<>();
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
                wonderList.add(x);
            } else {
                x = x * 3 + 1;
                wonderList.add(x);
            }
        }
/*        System.out.print(wonderList.size() + " ");
        System.out.print("(");
        for (int i = 0; i < wonderList.size()-1; i++) {
            System.out.print(wonderList.get(i) + ", ");
        }
        System.out.print(wonderList.get(wonderList.size()-1));
        System.out.print(")");
        return wonderList;
    }
 */
        return wonderList;
    }

}
