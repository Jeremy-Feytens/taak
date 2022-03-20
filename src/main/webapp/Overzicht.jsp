<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="domain.model.Product" %>
<!DOCTYPE html>
<html>
<head>
    <title>Overzicht</title>
    <link rel="stylesheet" href="Boodschappenlijst.css">
</head>
<body>
<header>
    <h1>Verlanglijst</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="Voegtoe.jsp">Voeg Toe</a></li>
            <li><a href="Overzicht.jsp">0verzicht</a></li>
        </ul>
    </nav>
</header>
<main>
    <h2>Boodschappenlijst</h2>
    <table>
            <thead>
            <tr>
                <th>Naam</th>
                <th>Prijs</th>
                <th>Hoeveelheid</th>
                <th>Verwijder</th>
            </tr>
            </thead>
            <tbody>
            <%  List<Product> lijst = (List<Product>) request.getAttribute("lijst");
                for(Product i : lijst){ %>
            <tr>
                <td><%=i.getNaam()%></td>
                <td><%=i.getPrijs()%></td>
                <td><%=i.getHoeveelheid()%></td>
                <td>Verwijder</td>
            </tr>
            <% } %>
            </tbody>

    </table>
</main>
<footer>
    <p>Jeremy Feytens</p>
</footer>
</body>
</html>