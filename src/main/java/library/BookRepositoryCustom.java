package library;
import java.util.List;


public interface BookRepositoryCustom{

     List<Book> searchByName(String name);
}   