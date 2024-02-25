package controller;

import entity.Character;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CharacterService;

import java.io.IOException;

@WebServlet("/addChar")
public class AddController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String image = req.getParameter("image");
        String ele = req.getParameter("element");
        String path = req.getParameter("path");
        String hp = req.getParameter("hp");
        String atk = req.getParameter("atk");
        String def = req.getParameter("def");

        CharacterService characterService = new CharacterService();
        Character character = new Character();

        character.setName(name);
        character.setName(image);
        character.setName(ele);
        character.setName(path);
        character.setName(hp);
        character.setName(atk);
        character.setName(def);


        boolean check = characterService.add(character);
        if (check){
            req.setAttribute("ok_mess", "Add successfully");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);

        }else {
            req.setAttribute("notok_mess", "Add unsuccessfully");
            req.getRequestDispatcher("/AddCharacter.jsp").forward(req, resp);
        }
        //check co trong db hay chua
        //add skill

    }
}
