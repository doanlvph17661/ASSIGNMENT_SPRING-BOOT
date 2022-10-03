package Assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Assignment.entitis.Account;
import Assignment.entitis.Category;

@Repository
public interface categoryRepository extends JpaRepository<Category,Integer >{
//	@Query("SELECT o FROM Category o where o.product.id=puid")
//	Category findByProductId(@Param("puid") Integer id);
	
	
}
