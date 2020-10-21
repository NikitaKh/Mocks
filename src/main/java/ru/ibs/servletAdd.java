package ru.ibs;


import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import ru.ibs.logic.Model;
import ru.ibs.logic.User;

import javax.jws.soap.SOAPBinding;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(urlPatterns = "/add")
public class servletAdd extends HttpServlet {

    private AtomicInteger counter = new AtomicInteger(5);
    Model model = Model.getInstance();

    /*
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter pw = response.getWriter();

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        double salary = Double.parseDouble(request.getParameter("salary"));

        User user = new User(name, surname, salary);
        model.add(counter.getAndIncrement(), user);
        pw.println("<html>" +
                "<h3>Пользователь " + name + " " + surname + " с зарплатой " + salary + " успешно создан!</h3>" +
                "<a href=\"addUser.html\">Создать нового пользователя!</a><br/>" +
                "<a href=\"index.jsp\">Домой.</a>" +
                "</html>");
    }

     */



}
