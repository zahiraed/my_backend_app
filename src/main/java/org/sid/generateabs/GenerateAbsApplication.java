package org.sid.generateabs;

import org.sid.generateabs.dao.ProduitRepository;
import org.sid.generateabs.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class GenerateAbsApplication implements CommandLineRunner {
    @Autowired
    private ProduitRepository ProduitRepository;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(GenerateAbsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Produit.class);
        ProduitRepository.save(new Produit(null,"ordinateur Lx 45",700,4) );
        ProduitRepository.save(new Produit(null,"Imprimante",701,5) );
        ProduitRepository.save(new Produit(null,"smart phone",702,6 ) );
        ProduitRepository.findAll().forEach(p->{
            System.out.println(p.toString());

        });



    }
}
