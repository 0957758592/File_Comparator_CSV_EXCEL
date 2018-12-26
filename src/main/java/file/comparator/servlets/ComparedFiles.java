package file.comparator.servlets;

import file.comparator.service.FileComparator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ComparedFiles extends HttpServlet {
    FileComparator fileComparator = new FileComparator();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write(resultBuilder());
    }

    private String resultBuilder(){
        TreeMap<String, Object> map = fileComparator.getMerged();
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body><div><ul>");
        for (Map.Entry<String, Object> set : map.entrySet()) {
            sb.append("<li>");
            sb.append(set);
            sb.append("</li>");
        }
        sb.append("</ul></div></body></html>");

        return sb.toString();
    }

}
