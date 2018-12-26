package file.comparator;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import file.comparator.servlets.ComparedFiles;
import file.comparator.servlets.UploadFiles;

public class Starter {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();

        ServletHolder upload = new ServletHolder(new UploadFiles());
        handler.addServlet(upload,"/");

        ServletHolder compare = new ServletHolder(new ComparedFiles());
        handler.addServlet(compare, "/compared");

        server.setHandler(handler);
        server.start();
        server.join();

    }

}
