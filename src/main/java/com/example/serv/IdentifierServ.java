package com.example.serv;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/Serv")
public class IdentifierServ extends HttpServlet {
    private static final long serialversionUID = 1L;
    private static String password="fractale";
    private ArrayList<Etudiant> listEtu = new ArrayList<>();
    protected void doGet(HttpServletRequest  req,HttpServletResponse res ) throws ServletException,IOException {
        String url = req.getHeader("referer");
        res.getWriter()
                .println(url);
        switch(url) {
            case "http://localhost:8080/Serv/":
                if(password.equals(req.getParameter("password"))) {
                    res.sendRedirect("accueil.html");

                }
                else
                {

                    res.sendRedirect("http://localhost:8080/Serv/");
                }


                break;
            case "http://localhost:8080/Serv/saisieNote.html":
                for(Etudiant etu: listEtu)
                        res.getWriter().println(etu.toString());
                for(Etudiant etu: listEtu)
                    if(etu.getNom().equals(req.getParameter("nom")) && etu.getPrenom().equals(req.getParameter("prenom")) && etu.getFormation().equals(req.getParameter("formation")))
                    {

                        double note = Double.valueOf(req.getParameter("note"));
                        etu.setNote(note);
                        /*res.getWriter()
                                .println(note);*/
                    }



                break;
            case "http://localhost:8080/Serv/inscription.html":
                Etudiant etu = new Etudiant(req.getParameter("nom"),req.getParameter("prenom"),req.getParameter("formation"));
                listEtu.add(etu);
                res.sendRedirect("http://localhost:8080/Serv/accueil.html");
                break;

        }


    }

}
