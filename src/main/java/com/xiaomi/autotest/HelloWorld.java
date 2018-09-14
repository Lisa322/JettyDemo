package com.xiaomi.autotest;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.print("Hello world");
        Server server = new Server(28083);

        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");
        server.setHandler(context);

        context.addServlet(new ServletHolder(new IndexHandler()),"/index");

        server.start();  //必须
        server.join();

    }
}
