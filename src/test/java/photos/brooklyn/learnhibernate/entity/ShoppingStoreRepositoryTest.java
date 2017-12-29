package photos.brooklyn.learnhibernate.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@DataJpaTest
public class ShoppingStoreRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ShoppingStoreRepository repo;

    @Test
    public void findNothing() {
        final List<ShoppingStore> stores = repo.findAll();
        assertEquals(0, stores.size());
    }

    @Test
    public void findByName(){
        final ShoppingStore wf = new ShoppingStore();
        wf.setName("Whole Foods");
        entityManager.persist(wf);
        final ShoppingStore st = repo.findByName("Whole Foods");
        assertNotNull(st);
        assertTrue(st.getId()>0);
        System.out.println(st.getId());
    }
}