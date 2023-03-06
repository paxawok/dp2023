package Servlets;

import com.google.gson.Gson;
import entity.NewEntity;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet")
public class ServletOne extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        NewEntity entity = new NewEntity( 1, "gggg", 2324, "dggf" );

        String someJson = new Gson().toJson(entity);

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print("[" + someJson + "]");
        out.flush();
    }
}