package controller;

import Model.Produit;
import Model.ProduitDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ProductController {
    @Autowired
    ProduitDaoImpl dao;

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("p") Produit p){
        dao.save(p);
        return "redirect:/addproduct";
    }

}