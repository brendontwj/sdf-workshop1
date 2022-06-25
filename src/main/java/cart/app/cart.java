package cart.app;

import java.util.ArrayList;

public class cart {
    private static ArrayList<String> contents = new ArrayList<String>();

    public cart() {
    }

    public void list(cart currCart) {
        if(contents.size() > 0) {
            for(int i = 0; i < contents.size(); i++) {
                System.out.print(i+1 + ". ");
                System.out.println(contents.get(i));
            }
        } else {
            System.out.println("Nothing in the cart!");
        }
    }

    public void add(String item) {
        contents.add(item);
        
    }

    public void delete(String itemIndex) {
        int idx = Integer.parseInt(itemIndex) - 1;
        System.out.println("Removing " + contents.get(idx) + " from the cart.");
        contents.remove(idx);
    }
}
