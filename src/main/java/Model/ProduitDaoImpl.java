package Model;
import javax.servlet.ServletException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProduitDaoImpl implements IProduitDao {
    IProduitDao dao;
    @Override
    public void init() throws ServletException
    {
        dao = new ProduitDaoImpl();
    }
    @Override
    public Produit save(Produit p) {
        Connection conn= ConnectBD.getConnection();
        try {
            PreparedStatement ps= conn.prepareStatement("INSERT INTO produits(nomproduit,prix,fournisseurProduit) VALUES(?,?,?)");
            ps.setString(1, p.getNomProduit());
            ps.setDouble(2, p.getPrix());
            ps.setString(3, p.getfournisseurProduit());
            ps.executeUpdate();
            PreparedStatement ps2= conn.prepareStatement
                    ("SELECT MAX(idproduit) as MAX_ID FROM produits");
            ResultSet rs =ps2.executeQuery();
            if (rs.next()) {
                p.setIdProduit(rs.getLong("MAX_ID"));
            }
            ps.close();
            ps2.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }



}