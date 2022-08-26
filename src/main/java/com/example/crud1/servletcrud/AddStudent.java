package com.example.crud1.servletcrud;

import com.example.crud1.student.Student;
import com.example.crud1.student.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/add-students")
public class AddStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("add-student-form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student();
        student.setFirstName(req.getParameter("firstName"));
        student.setLastName(req.getParameter("lastName"));
        student.setEmail(req.getParameter("email"));
        student.setCourse(Integer.parseInt(req.getParameter("course")));
        int i = StudentDao.addStudent(student);
        if (i > 0) {
            resp.sendRedirect("/show-student");
        } else resp.sendRedirect("/add-students");
    }
}
