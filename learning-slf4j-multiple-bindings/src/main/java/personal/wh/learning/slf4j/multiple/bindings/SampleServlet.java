package personal.wh.learning.slf4j.multiple.bindings;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleServlet extends HttpServlet {

    private static final long serialVersionUID = -870284320856607145L;
    
    private static final Logger logger = LoggerFactory.getLogger(SampleServlet.class);
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("Hello Slf4j ! - debug");
        logger.info("Hello Slf4j ! - info");
        try (PrintWriter writer = resp.getWriter()) {
            writer.write("ok");
        }
    }
    
}
