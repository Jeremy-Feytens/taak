package controller;

import domain.db.DB;
import domain.model.Product;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Controller")
public class controller extends HttpServlet {
    private final DB db = new DB();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String command = request.getParameter("command");
        String destination = "";
        switch(command){
            case "index":
                destination = index(request);
                break;
            case "voegToe":
                destination = voegToe(request);
                break;
            case "overzicht":
                destination = Overzicht(request);
                break;
        }
        request.getRequestDispatcher(destination).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String command = request.getParameter("command");
        String destination = "";
        switch(command){
            case "add":
                destination = this.add(request);
                break;
        }
        request.getRequestDispatcher(destination).forward(request, response);
    }




    private String Overzicht(HttpServletRequest request){
        request.setAttribute("lijst", db.getBoodschappenlijst());
        return "Overzicht.jsp";
    }
    private String index(HttpServletRequest request){
        return "index.jsp";
    }

    private String voegToe(HttpServletRequest request){
        return "Voegtoe.jsp";
    }



    private String add(HttpServletRequest request){
        db.voegtoe(new Product(request.getParameter("naam"), Double.parseDouble(request.getParameter("prijs")), Integer.parseInt(request.getParameter("hvl"))));
        return Overzicht(request);
    }
}