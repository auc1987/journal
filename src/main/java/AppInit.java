import org.defaults.unijournal.configuration.ApplicationConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                ApplicationConfiguration.class
        };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {
                ApplicationConfiguration.class
        };
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
