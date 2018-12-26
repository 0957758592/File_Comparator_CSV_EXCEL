package file.comparator.servlets;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import file.comparator.service.FileService;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.List;

@MultipartConfig(maxFileSize = 1024*1024*20, fileSizeThreshold = 1024*1024*20, maxRequestSize = 1024*1024*20)
public class UploadFiles extends HttpServlet {
    FileService fileCompare = new FileService();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder sb = new StringBuilder();


        sb.append(
                "<html lang=\"en\">\n" +
                "  <head>\n" +
//                "    <meta charset=\"utf-8\">\n" +
//                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n" +
                "    <title>File Comparator</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "<div class='container'><div class='row  justify-content-center'><div class=col col-lg-6 style='max-width: 50%'><h1>Excel CSV Comparator </h1><form enctype='multipart/form-data' method=post >\n" +
                        "  <div class=\"form-group row\">\n" +
                        "    <label for=\"input1\" class=\"col-sm-2 col-form-label\">Excel File</label>\n" +
                        "    <div class=\"col-sm-10\">\n" +
                        "      <input type=\"file\" class=\"form-control-file\" name='xlsx' id=\"input1\" >\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "  <div class=\"form-group row\">\n" +
                        "    <label for=\"input2\" class=\"col-sm-2 col-form-label\">CSV File</label>\n" +
                        "    <div class=\"col-sm-10\">\n" +
                        "      <input type=\"file\" class=\"form-control-file\" name='csv' id=\"input2\">\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "  <div class=\"form-group row\">\n" +
                        "    <div class=\"col-sm-10\">\n" +
                        "      <button type=\"submit\" class=\"btn btn-primary  w-100\">Compare</button>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "</form></div></div></div></body></html>");
//
//        sb.append("<html><head><body><div><form enctype='multipart/form-data' method=post >");
//        sb.append("<ul>");
//        sb.append("<li>Excel:  <input type='file' name='xlsx' ></li>");
//        sb.append("<br>");
//        sb.append("<li>CSV:  <input type='file' name='csv' ></li>");
//        sb.append("<li><select><option name='separator'>,</option><option name='separator'>|</option><option name='separator'>\"</option></select></li>");
//        sb.append("<ul>");
//        sb.append("<br>");
//        sb.append("<button type=submit>Compare</button>");
//        sb.append("</form></div><body><html>");
       resp.getWriter().write(sb.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            boolean isMultipart = ServletFileUpload.isMultipartContent(req);
            if (!isMultipart) {
                System.out.println("not MULTIPART");
            } else {
               String quotes = req.getParameter("separator");
               List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(req);
               fileCompare.compare(items);
               }
            } catch (FileUploadException e) {
            e.printStackTrace();
        }
            resp.sendRedirect("http://localhost:8080/compared");
    }
}
