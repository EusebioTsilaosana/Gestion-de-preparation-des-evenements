<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Evenement a voir</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">
</head>
<body>
	<jsp:include page="/WEB-INF/jsp-admin/navigation.jsp" />
	
	<div class="tableau">
            <div class="input-rechercher">
                <input type="text" name="input-recherche" id="input-recherche" placeholder="Rechercher" class="rech">
            </div>
            <div class="titre-table">
                <h2>Listes des evenements</h2>
                <a href="" class="add">+ Add</a>
            </div>

            <div class="filtrer">
                <button class="btn">Tous</button>
                <button class="btn">En cours</button>
                <button class="btn">A venir</button>
                <button class="btn">Annuler</button>
            </div>
            <table>
                <thead>
                    <tr>
                        <th>Evenement</th>
                        <th>Titre</th>
                        <th>Organisateur</th>
                        <th>Evenement-Status</th>
                        <th>Jour de l'evenement</th>
                        <th>Debut</th>
                        <th>Fin</th>
                    </tr>
                </thead>
            </table>
        </div>
</body>
</html>