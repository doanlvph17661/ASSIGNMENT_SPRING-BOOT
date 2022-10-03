package Assignment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Assignment.entitis.cart;

@Repository
public interface CartRepository extends JpaRepository<cart, Integer>{
	@Query("SELECT o FROM cart o WHERE o.account.id=:uid")
	List<cart> findAllCartByAccountId(@Param("uid")Integer id);
}
