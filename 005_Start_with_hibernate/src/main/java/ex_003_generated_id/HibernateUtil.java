package ex_003_generated_id;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jboss.logging.Logger;

/**
 * Created by Asus on 01.11.2017.
 */
public class HibernateUtil {

    private static SessionFactory factory;
    private static final Logger LOG = Logger.getLogger( HibernateUtil.class.getName() );

    static {
        try {
             factory = new Configuration()
                    .configure("ex_03_hibernate.cfg.xml")
                    .buildSessionFactory();
        } catch (HibernateException e) {
            LOG.error(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }

}
