package future.inventory_management.Service;

import future.inventory_management.Model.Inventory;
import future.inventory_management.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> getAllInventory(){
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryById(String invId){
        return inventoryRepository.findBy_id(invId);
    }

    public Inventory createInventory(Inventory inventory){
        return inventoryRepository.save(inventory);
    }

    public Inventory updateInventoryById(String invId, Inventory inventory) {
        inventory.set_id(invId);
        inventoryRepository.save(inventory);
        return inventory;
    }

    public int deleteInventoryById(String _invId) {
        inventoryRepository.deleteById(_invId);
        return 1;
    }
}
