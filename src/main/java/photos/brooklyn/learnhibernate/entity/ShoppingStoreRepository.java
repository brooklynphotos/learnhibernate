package photos.brooklyn.learnhibernate.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingStoreRepository extends JpaRepository<ShoppingStore, Integer>{

    ShoppingStore findByName(String name);
}
