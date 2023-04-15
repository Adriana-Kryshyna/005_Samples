package ex_003_generated_id;

import ex_003_generated_id.entity.Author;
import org.jboss.logging.Logger;

/**
 * Created by Asus on 04.11.2017.
 */
public class Main {

    private static final Logger LOG = Logger.getLogger(AuthorHelper.class.getName());

    public static void main(String[] args) {
         AuthorHelper ah = new AuthorHelper();
         Author author = new Author();
//         author.setId(7);
//         author.setName("test");
//         ah.addAuthor(author);
         author.setNewColum("Ahoy there");
         ah.addAuthor(author);
         author.setMiddleName("Vitaliich");
         ah.addAuthor(author);
    }

}
