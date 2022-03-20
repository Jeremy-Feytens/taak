<%--
  Created by IntelliJ IDEA.
  User: jerem
  Date: 2/27/2022
  Time: 6:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Voeg Toe</title>
      <link rel="stylesheet" href="Boodschappenlijst.css">
  </head>
  <body>
  <h1><%= "Boodschappenlijst" %></h1>
  <nav>
      <ul>
          <li><a class="active" href="index.jsp">Home</a></li>
          <li><a href="Voegtoe.jsp">Voeg Toe</a></li>
          <li><a href="Overzicht.jsp">Overzicht</a></li>
      </ul>
  </nav>
  <h2>Voeg een product toe</h2>
  <form method="POST" action="Controller">
      <label>Naam: </label>
      <input type="text" id="naam" name="naam"><br>
      <label>Prijs: </label>
      <input type="text" id="prijs" name="prijs"><br>
      <label>Hoeveelheid: </label>
      <input type="text" id="hoeveelheid" name="hoeveelheid"><br>
      <button type="submit" value="add">Verzenden</button>
  </form>
  </body>
</html>
