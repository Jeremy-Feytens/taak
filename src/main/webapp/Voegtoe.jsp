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
    <title>Title</title>
      <link rel="stylesheet" href="Boodschappenlijst.css">
  </head>
  <body>
  <h1><%= "Boodschappenlijst" %></h1>
  <nav>
      <ul>
          <li><a class="active" href="#Home">Home</a></li>
          <li><a href="Voegtoe.jsp">Voeg Toe</a></li>
          <li><a href="Overzicht.jsp">Overzicht</a></li>
      </ul>
  </nav>
  <h2>Voeg een product toe</h2>
  <form>
      <label>Naam: </label>
      <input type="text"><br>
      <label>Prijs: </label>
      <input type="text"><br>
      <label>Hoeveelheid: </label>
      <input type="text"><br>
      <label>Kleur: </label>
      <select>
          <option>Zwart</option>
          <option>Grijs</option>
          <option>Wit</option>
      </select>
  </form>
  </body>
</html>
