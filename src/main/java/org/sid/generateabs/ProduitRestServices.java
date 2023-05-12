package org.sid.generateabs;

import org.sid.generateabs.dao.ProduitRepository;
import org.sid.generateabs.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProduitRestServices {
    @Autowired
    private ProduitRepository produitRepository;
    // lister tous les produits
    @GetMapping("/listProduits")
    public List<Produit> listProduits(){
        return produitRepository.findAll();
    }
    // lister tous les produits par leur id

    @GetMapping(value="/listProduits/{id}")
    public Produit listProduit(@PathVariable(name="id") Long id){
        return produitRepository.findById(id).get();
    }
    // modifier les produits par leur id

    @PutMapping(value="/listProduits/{id}")
    public Produit update(@PathVariable(name="id") Long id,@RequestBody Produit p){
            p.setId(id);
            return produitRepository.save(p);
        }
    // enregistrer les produits par leur id

    @PostMapping(value = "/listProduits")
    public Produit save(@RequestBody Produit p){
            return produitRepository.save(p);
    }
    // supprimer les produits par leur id

    @DeleteMapping(value="/listProduits/{id}")
    public void delete(@PathVariable(name="id") Long id) {
        produitRepository.deleteById(id);
    }
}

