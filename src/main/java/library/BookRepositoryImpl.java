package library;

import java.util.List;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import java.util.Optional;

public class BookRepositoryImpl implements BookRepositoryCustom{

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Book> searchByName(String name){

    	if(name.isEmpty())
    		return new ArrayList();

        Query query = new Query(Criteria.where("name").regex(name));
            return mongoTemplate.find(query,Book.class);
    }
}   