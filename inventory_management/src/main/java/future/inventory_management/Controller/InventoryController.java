package future.inventory_management.Controller;

import future.inventory_management.Model.Inventory;
import future.inventory_management.Repository.InventoryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/inv_mgt/inventory")
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    //create inventory
    @PostMapping("/create")
    public Inventory createInventory(@Valid @RequestBody Inventory inventory){
        return inventoryRepository.save(inventory);
    }

    //get all
    @GetMapping("/getAll")
    public List<Inventory> getAllInventory(){
        return inventoryRepository.findAll();
    }

//    //get by id
//    @GetMapping("/getById/{id}")
//    public Inventory getById(@PathVariable ObjectId _invId){
//        return inventoryRepository._findById(_invId);
//    }

}
