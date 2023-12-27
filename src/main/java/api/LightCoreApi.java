package api;

import com.google.gson.Gson;
import entity.LightCore;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.LightCoreService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({"/lightCore"})
public class LightCoreApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Xử lý yêu cầu GET tại đây
        LightCoreService lightCoreService = new LightCoreService();
        List<LightCore> lightCores = lightCoreService.findAll();

        Gson gson = new Gson();
        String jsonResult = gson.toJson(lightCores);
        // Gửi phản hồi về client
        resp.setContentType("application/json");
        resp.getWriter().write(jsonResult);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getParameter("path");
        String cId = req.getParameter("cId");
        LightCoreService lightCoreService = new LightCoreService();
        List<LightCore> lightCores = lightCoreService.findByPath(path);


        Gson gson = new Gson();
        String jsonResult = gson.toJson(lightCores);
        // Gửi phản hồi về client
        resp.setContentType("application/json");
        resp.getWriter().write(jsonResult);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lightCoreId = req.getParameter("path");
        String cId = req.getParameter("path");
        String hp = req.getParameter("path");
        String def = req.getParameter("path");
        String path = req.getParameter("path");
        String superimpose = req.getParameter("superimpose");//tinh hon

    }
}
