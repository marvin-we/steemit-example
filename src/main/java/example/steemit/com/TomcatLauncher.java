package example.steemit.com;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.glassfish.jersey.servlet.ServletContainer;

public class TomcatLauncher {
	public static void main(String args[]) {
		try {
			Tomcat tomcat = new Tomcat();

			// basedir property will be set by the appassembler script.
			String basedir = System.getProperty("basedir");
			String webappDirectory = new File(basedir + "/webapp").getAbsolutePath();

			tomcat.setPort(8080);

			Context context = tomcat.addWebapp("", webappDirectory);

			Tomcat.addServlet(context, "dez1337Example", new ServletContainer(new ResourceLoader()));
			context.addServletMapping("/rest/*", "dez1337Example");
		 

			tomcat.start();
			tomcat.getServer().await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
