package com.example.crud1.servletcrud;

import com.example.crud1.student.Student;
import com.example.crud1.student.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/show-student")
public class ShowStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> allStudent = StudentDao.getAllStudent();

        String a = "test_for_github";
        String a_master = "test_for_github for master";
        req.setAttribute("students", allStudent);
        req.getRequestDispatcher("show-student.jsp").forward(req, resp);
    }
}
