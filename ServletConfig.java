package com.example.api;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/api/example") // Define la URL del servlet
public class ExampleServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: Implementar lógica de respuesta
        // Puedes modificar esta sección para devolver datos en formato JSON
        resp.getWriter().write("{\"message\": \"Hello, World!\"}");
        resp.setContentType("application/json");
        resp.setStatus(HttpServletResponse.SC_OK);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: Implementar lógica para manejar POST
        // Aquí puedes leer datos del request y procesarlos
    }
}
