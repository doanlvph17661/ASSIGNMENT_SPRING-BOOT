package Assignment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import Assignment.entitis.Account;

@Repository
public interface accountsRepository extends JpaRepository<Account, Integer> {
   @Query("SELECT a FROM Account a WHERE a.email=:uemail")
 public  Account findByEmail(@Param("uemail") String email);
   
   
}
