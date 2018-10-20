package future.inventory_management.Repository;

import future.inventory_management.Model.Inventory;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory, String> {
    //selalu error kalau digunakan
    //Inventory _findById(ObjectId _invId);
}
