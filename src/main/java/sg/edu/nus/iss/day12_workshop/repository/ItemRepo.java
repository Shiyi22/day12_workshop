package sg.edu.nus.iss.day12_workshop.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.day12_workshop.model.Item;

@Repository
public class ItemRepo {

    private List<Item> itemsList; 

    public List<Item> getCartItems() {

        itemsList = new ArrayList<>(); 

        Item item = new Item(); 
        item.setItemName("Louis Vuitton");
        item.setQuantity(5);
        itemsList.add(item);

        item = new Item(); 
        item.setItemName("Chanel");
        item.setQuantity(6);
        itemsList.add(item);

        item = new Item(); 
        item.setItemName("Prada");
        item.setQuantity(10);
        itemsList.add(item);

        item = new Item(); 
        item.setItemName("Hermes");
        item.setQuantity(15);
        itemsList.add(item);

        item = new Item(); 
        item.setItemName("Bottega");
        item.setQuantity(5);
        itemsList.add(item);

        return itemsList; 
    }

    
}
