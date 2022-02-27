package domain;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private int sequence = 0;
    private final Lijst<Product>  = new ArrayList<>();

    public DB() {
        this.voegtoe(new Product("cola",1.5,3));
        this.voegtoe(new Product("Kaas",2,5));
        this.voegtoe(new Product("Hesp",3,1));
    }

    public void voegtoe(Product product){
        this.sequence++;
        item.setId(sequence);
        Boodschappenlijst.add(item);
    }
}