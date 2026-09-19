<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>event management</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">
</head>
	
<body>
<jsp:include page="navigation.jsp" />
    <section>
    
        <div class="content-resume">
            <div class="resume">
                <h2>Total Evenement</h2>
                <p class="view"> 240 </p>
            </div>

            <div class="resume">
                <h2>Evenement en cours</h2>
                <p class="view">150 </p>
            </div>

            <div class="resume">
                <h2>Evenement a venir</h2>
                <p class="view">05 </p>
            </div>

            <div class="resume">
                <h2>Resigned Employees</h2>
                <p class="view">04 </p>
            </div>
        </div>

        <div class="tableau">
            <div class="titre-table">
                <h2>Liste des prestataire</h2>
                <a href="">view all</a>
            </div>
            <table>
                <thead>
                    <tr>
                        <th>Libelle prestaire</th>
                        <th>Specialite</th>
                        <th>Status</th>
                    </tr>
                </thead>
            </table>
        </div>

        <div class="tableau">
            <div class="titre-table">
                <h2>Liste d'evenement</h2>
                <a href="">view all</a>
            </div>
            <table>
                <thead>
                    <tr>
                        <th>Evenement</th>
                        <th>Titre</th>
                        <th>Organisateur</th>
                        <th>Evenement-Status</th>
                    </tr>
                </thead>
            </table>
        </div>
    </section>
</body>
<footer>

</footer>

</html>