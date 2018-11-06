package future.inventory_management.Controller;

import future.inventory_management.Model.Inventory;
import future.inventory_management.Repository.InventoryRepository;
import future.inventory_management.Service.InventoryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/inv_mgt/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/test")
    public String testView(){
        return "index";
    }

    @GetMapping("/getAll")
    public List<Inventory> getAllInventory(){
        return inventoryService.getAllInventory();
    }

    @GetMapping("/getById/{id}")
    public Inventory getById(@PathVariable("id") String invId){
        return inventoryService.getInventoryById(invId);
    }

    @PostMapping("/create")
    public Inventory create(@Valid @RequestBody Inventory inventory){
        return inventoryService.createInventory(inventory);
    }

    @PutMapping(value = "/updateById/{id}")
    public Inventory updateById(@PathVariable("id") String invId, @Valid @RequestBody Inventory inventory) {
        inventory.set_id(invId);
        inventoryService.updateInventoryById(invId, inventory);
        return inventory;
    }

    public String updateStockById(){
        return "";
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") String _invId) {
        inventoryService.deleteInventoryById(_invId);
        return 1;
    }




}
