package photos.brooklyn.learnhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import photos.brooklyn.learnhibernate.entity.ShoppingStore;
import photos.brooklyn.learnhibernate.entity.ShoppingStoreRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ShoppingStoreController {
    @Autowired
    private ShoppingStoreRepository repo;

    @GetMapping("/stores")
    public List<ShoppingStore> getAllStores(){
        return repo.findAll();
    }

    @PostMapping("/stores")
    public ShoppingStore createStore(@Valid @RequestBody ShoppingStore store){
        return repo.save(store);
    }
}
