package photos.brooklyn.learnhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"photos.brooklyn.learnhibernate"})
public class LearnHibernateApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnHibernateApplication.class,args);
    }
}
