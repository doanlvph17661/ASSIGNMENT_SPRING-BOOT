package Assignment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Assignment.entitis.Account;
import Assignment.entitis.Order;

@Repository
public interface oderRepository extends JpaRepository<Order, Integer> {
	 @Query("SELECT o FROM Order o WHERE o.user.email=:uemail")
	 List<Order> findByEmail(@Param("uemail") String email);
}
