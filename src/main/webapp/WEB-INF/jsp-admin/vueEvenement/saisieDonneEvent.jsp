<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Formulaire d'ajout d'une nouvelle evenement</h2>
	<div class="saisie-donnee">
		<form action="" accept-charset="utf-8" method="post">
			<div>
				<label for="titre">Titre d'evenement</label> <input type="text"
					name="titre" id="titre" value='<c:out value="${evenement.titre}"/>'>
			</div>
			<div>
				<label for="dateDebut">Date debut</label> <input
					type="date" name="dateDebut" id="dateDebut" value='<c:out value="${evenement.dateDebut}"/>'>
			</div>
			<div>
				<label for="dateFin">Date fin</label> <input
					type="date" name="dateFin" id="dateFin" value='<c:out value="${evenement.dateFin}"/>'>
			</div>
			<div>
				<a href="<c:url value="/EvenementControleur" />">Annuler</a> 
				<input type="submit" value="Confirmer">
			</div>
		</form>
	</div>
</body>
</html>