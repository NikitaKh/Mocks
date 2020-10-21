package ru.ibs;


import com.sun.org.apache.xpath.internal.operations.Mod;
import ru.ibs.logic.Model;
import ru.ibs.logic.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(urlPatterns = "/get")
public class servletList extends HttpServlet {

    Model model = Model.getInstance();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));
        if (id == 0) {
            pw.println("<html>" +
                    "<h3>Доступные пользователи</h3><br/>" +
                    "ID пользователя:" +
                    "<ul>");

            for (Map.Entry<Integer, User> entry : model.getFromList().entrySet()) {
                pw.print("<li>" + entry.getKey() + "</li>" +
                        "<ul>" +
                        "<li>Имя: " + entry.getValue().getName() + "</li>" +
                        "<li>Фамилия: " + entry.getValue().getSurname() + "</li>" +
                        "<li>Зарплата: " + entry.getValue().getSalary() + "</li>" +
                        "</ul>");
            }

            pw.print("</ul>" +
                    "<a href=\"index.jsp\">Домой</a>" +
                    "</html>");
        } else if (id > 0) {
            if (id > model.getFromList().size()) {
                pw.print("<html>" +
                        "<h3>Пользователя с таким ID не существует!</h3><br/>" +
                        "<a href=\"index.jsp\">Домой</a>" +
                        "</html>");
            } else {
                pw.print("<html>" +
                        "<h3>Запрошенный пользователь: </h3><br/>" +
                        "Имя: " + model.getFromList().get(id).getName() + "<br/>" +
                        "Фамилия: " + model.getFromList().get(id).getSurname() + "<br/>" +
                        "Зарптала: " + model.getFromList().get(id).getSalary() + "<br/>" +
                        "<a href=\"index.jsp\">Домой</a>" +
                        "</html>");
            }
        } else {
            pw.print("<html>" +
                    "<h3>Id должен быть больше 0!</h3><br/>" +
                    "<a href=\"index.jsp\">Домой</a>" +
                    "</html>");
        }
    }
}
