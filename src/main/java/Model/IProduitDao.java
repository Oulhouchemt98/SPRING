package Model;

import javax.servlet.ServletException;
import java.util.List;

public interface IProduitDao {
    void init() throws ServletException;

    public Produit save(Produit p);

}