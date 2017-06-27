package alexis.breuse;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by abreuse on 27/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, String>{

    //queries created on the fly when the app is running
    public User findByFirstName(@Param("name") String firstName);
    public List<User> findByLastName(@Param("name") String lastName);
}
