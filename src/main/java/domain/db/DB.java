package domain.db;

import domain.model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DB {

    private int sequence = 0;
    private static final List<Product> boodschappenlijst = new ArrayList<>();

    public DB() {
        this.voegtoe(new Product("Cola", 2, 1));
        this.voegtoe(new Product("Fanta", 1, 2));
        this.voegtoe(new Product("Hesp", 3, 1));
    }
    public void voegtoe(Product product){
        this.sequence++;
        product.setId(sequence);
        boodschappenlijst.add(product);
    }
    public List<Product> getBoodschappenlijst() {
        return boodschappenlijst;
    }


}