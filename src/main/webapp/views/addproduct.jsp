<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Gestion d'Achat</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>

</head>
<body>

<div class="container">
    <h2>Nouveau produit</h2>
    <form action="save">
        <div class="form-group">
            <label>Nom Produit:</label>
            <input type="text" class="form-control" placeholder="saisir Nom du produit" name="nomProduit">
        </div>
        <div class="form-group">
            <label>Prix:</label>
            <input type="text" class="form-control"  placeholder="saisir prix" name="prix">
        </div>
        <div class="form-group">
            <label>Fournisseur Produit:</label>
            <input type="text" class="form-control" placeholder="saisir fournisseur" name="fournisseurProduit">
        </div>
        <button type="submit" class="btn btn-primary">Enregistrer le produit dans la base de données</button>
    </form>



</div>


<div class="container">



</div>
</body>
</html>