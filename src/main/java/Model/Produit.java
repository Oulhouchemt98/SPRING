package Model;

public class Produit {
    private Long idProduit;
    private String nomProduit;
    private double prix;
    private String fournisseurProduit;
    public Produit(String nomProduit, double prix, int i) {
        super();
    }
    public Produit(String nomProduit, double prix, String fournisseurProduit) {
        super();
        this.nomProduit = nomProduit;
        this.prix = prix;
        this.fournisseurProduit= fournisseurProduit;
    }
    public Long getIdProduit() {
        return idProduit;
    }
    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }
    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }


    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public String getfournisseurProduit() {
        return fournisseurProduit;
    }
    public void setfournisseurProduit(String fournisseurProduit) {
        this.fournisseurProduit = fournisseurProduit;
    }
    @Override
    public String toString(){
        return "Produit [idproduit="+ idProduit +",nomproduit="+ nomProduit+",prix="+prix+",fournisseur="+fournisseurProduit+"]";
    }
}
