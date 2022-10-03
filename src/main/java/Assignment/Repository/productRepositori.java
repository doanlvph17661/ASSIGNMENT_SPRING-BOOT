package Assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Assignment.entitis.Product;

@Repository
public interface productRepositori extends JpaRepository<Product, Integer>{
	
}
