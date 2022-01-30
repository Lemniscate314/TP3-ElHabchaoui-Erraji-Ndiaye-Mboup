package com.example.serv;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.System.out;

@WebServlet("/Serv")
public class ScolariteManager extends HttpServlet implements java.io.Serializable  {
    private static final long serialversionUID = 1L;
    private static String password="fractale";
    public static ArrayList<Etudiant>listEtu = new ArrayList<>();
    public static ArrayList<String> listSpe = new ArrayList();


    protected void doGet(HttpServletRequest  req,HttpServletResponse res ) throws ServletException,IOException {
        String url = req.getHeader("referer");
        switch(url) {
            case "http://localhost:8080/Serv/index.html":
                if(password.equals(req.getParameter("password"))) {
                    res.sendRedirect("http://localhost:8080/Serv/accueil.html");

                }
                else
                {

                    res.sendRedirect("http://localhost:8080/Serv/index.html");
                }


                break;
            case "http://localhost:8080/Serv/saisieNote.html":
                for(Etudiant etu: listEtu)
                        res.getWriter().println(etu.toString());
                for(Etudiant etu: listEtu)
                    if(etu.getNom().equals(req.getParameter("nom")) && etu.getPrenom().equals(req.getParameter("prenom")) && etu.getFormation().equals(req.getParameter("formation")))
                    {

                        double note = Double.parseDouble(req.getParameter("note"));
                        etu.setNote(note);


                    }



                break;
            case "http://localhost:8080/Serv/inscription.html":
                Etudiant etu = new Etudiant(req.getParameter("nom"),req.getParameter("prenom"),req.getParameter("formation"));
                listEtu.add(etu);

                res.sendRedirect("http://localhost:8080/Serv/afficherEtudiant.html");
                break;
            case "http://localhost:8080/Serv/afficherEtudiant.html":
                for(Etudiant etus : listEtu) System.out.println(etus.toString());



        }


    }

}
