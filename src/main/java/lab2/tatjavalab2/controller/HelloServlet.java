package lab2.tatjavalab2.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lab2.tatjavalab2.model.Command;

import java.io.IOException;

@WebServlet(name = "HelloServlet" , value = {"/first-exercise", "/second-exercise"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Command command = CommandController.getCommand(request.getServletPath());
        command.execute(request, response);
    }
}