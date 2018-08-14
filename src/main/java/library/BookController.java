package library;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@RestController

public class BookController {

    @Autowired
    private BookRepository repository;


    @GetMapping("bookmanage/read")
    public Optional<Book> read(
    	@RequestParam(value="id", defaultValue="") String id,
    	@RequestParam(value="name",defaultValue="") String name) {

        if(!id.isEmpty())
            return repository.findById(id);
        else if(!name.isEmpty()){
            return repository.findByName(name);
        }else
            return null;

    }

    @GetMapping("/bookmanage/create")
    public Book create(
    	@RequestParam(value="id", defaultValue="") String id,
    	@RequestParam(value="name", defaultValue="noname") String name,
    	@RequestParam(value="author", defaultValue="noauthor") String author

    	){

        Book book = repository.save(new Book(id,name,author));


    	return book;

    }

    @GetMapping("/bookmanage/delete")
    public boolean delete(
    	@RequestParam(value="id", defaultValue="") String id
    	){

        //if no record
        if(repository.findById(id)==null)
            return false;

        // do database delete
        repository.deleteById(id);
        return true;

    	
    }

	@GetMapping("/bookmanage/search")
    public List<Book> read(
    	@RequestParam(value="name",defaultValue="") String name) {

        if("*".equals(name))
            return repository.findAll();

        return repository.searchByName(name);

        // return repository.findAll();
    }

}