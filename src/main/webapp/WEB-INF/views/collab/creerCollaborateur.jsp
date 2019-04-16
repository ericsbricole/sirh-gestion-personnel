<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Créer collaborateur</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<h1>Nouveau collaborateur</h1>
		</div>
		<div class="row">
			<div class="col-12">
				<form action="/sgp/collaborateurs/creer" method="post">
					<div class="form-group row col-12">
						<label class="col-3" for="nom">Nom</label>
						<input type="text" class="form-control col-8" id="nom" name="nom" required>
					</div>
					<div class="form-group row col-12">
						<label class="col-3" for="prenom">Prénom</label>
						<input type="text" class="form-control col-8" id="prenom" name="prenom" required>
					</div>
					<div class="form-group row col-12">
						<label class="col-3" for="dateDeNaissance">Date de naissance</label>
						<input type="date" class="form-control col-8" id="dateDeNaissance" placeholder="jj/mm/aaaa" name="dateDeNaissance" required>
					</div>
					<div class="form-group row col-12">
						<label class="col-3" for="adresse">Adresse</label>
						<input type="text" class="form-control col-8" id="adresse" name="adresse" required>
					</div>
					<div class="form-group row col-12">
						<label class="col-3" for="numSS">Numéro de sécurité sociale</label>
						<input type="text" class="form-control col-8" id="numSS" name="numSS" required>
					</div>
					
					<div class="row offset-10">
						<input class="btn btn-primary" type="submit" value="Créer">
					</div>
				</form>
			</div>
		</div>
</body>
</html>