package lab2.tatjavalab2.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public interface Command {
    void execute(HttpServletRequest request, HttpServletResponse response);
}