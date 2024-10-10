package lab2.tatjavalab2.model;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lab2.tatjavalab2.controller.FirstExerciseController;

import java.io.IOException;

public class FirstExerciseCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        double x = Double.parseDouble(request.getParameter("x"));
        int n = Integer.parseInt(request.getParameter("n"));
        double e = Double.parseDouble(request.getParameter("e"));

        FirstExerciseController controller = new FirstExerciseController();
        FirstExerciseResult result = controller.calculate(x, n, e);
        request.setAttribute("result", result);
        try {
            request.getRequestDispatcher("first-exercise.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}