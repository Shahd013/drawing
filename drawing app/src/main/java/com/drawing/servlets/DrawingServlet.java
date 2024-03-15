package com.drawing.servlets;

import com.drawing.model.Circle;
import com.drawing.model.Rectangle;
import com.drawing.model.Shape;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/draw")
public class DrawingServlet extends HttpServlet {
    private List<Shape> shapes = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Display the drawing page
        request.getRequestDispatcher("/WEB-INF/views/draw.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create a shape based on user input
        String shapeType = request.getParameter("shapeType");
        int x = Integer.parseInt(request.getParameter("x"));
        int y = Integer.parseInt(request.getParameter("y"));
        String color = request.getParameter("color");

        Shape shape;
        if ("circle".equals(shapeType)) {
            int radius = Integer.parseInt(request.getParameter("radius"));
            shape = new Circle(x, y, radius, color);
        } else {
            int width = Integer.parseInt(request.getParameter("width"));
            int height = Integer.parseInt(request.getParameter("height"));
            shape = new Rectangle(x, y, width, height, color);
        }

        // Add the shape to the list
        shapes.add(shape);

        // Redirect back to drawing page
        response.sendRedirect(request.getContextPath() + "/draw");
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
